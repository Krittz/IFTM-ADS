package br.com.cran.impressorabluetooth;

import android.Manifest;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothSocket;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import java.io.IOException;
import java.io.OutputStream;
import java.util.Set;
import java.util.UUID;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    private static final int REQUEST_ENABLE_BT = 1;
    private static final UUID MY_UUID = UUID.fromString("00001101-0000-1000-8000-00805F9B34FB");

    private BluetoothAdapter bluetoothAdapter;
    private BluetoothSocket socket;
    private OutputStream outputStream;
    private EditText editText;
    private Button printButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.editText);
        printButton = findViewById(R.id.printButton);

        bluetoothAdapter = BluetoothAdapter.getDefaultAdapter();
        if (bluetoothAdapter == null) {
            Toast.makeText(this, "Dispositivo não suporta Bluetooth", Toast.LENGTH_SHORT).show();
            finish();
            return;
        }

        if (!bluetoothAdapter.isEnabled()) {
            solicitarAtivacaoBluetooth();
        }

        printButton.setOnClickListener(view -> {
            String textoParaImprimir = editText.getText().toString().trim();
            if (!textoParaImprimir.isEmpty()) {
                imprimir(textoParaImprimir);
            } else {
                Toast.makeText(this, "Digite algo para imprimir", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        fecharConexaoBluetooth();
    }

    private void solicitarAtivacaoBluetooth() {
        Intent enableBtIntent = new Intent(BluetoothAdapter.ACTION_REQUEST_ENABLE);
        iniciarAtividadeResult.launch(enableBtIntent);
    }

    private final ActivityResultLauncher<Intent> iniciarAtividadeResult = registerForActivityResult(
            new ActivityResultContracts.StartActivityForResult(),
            result -> {
                if (result.getResultCode() == RESULT_OK) {
                    Log.i(TAG, "Bluetooth ativado com sucesso");
                } else {
                    Log.e(TAG, "Falha ao ativar o Bluetooth");
                    Toast.makeText(this, "Falha ao ativar o Bluetooth", Toast.LENGTH_SHORT).show();
                }
            });

    private void verificarPermissaoBluetooth() {
        if (ContextCompat.checkSelfPermission(this, Manifest.permission.BLUETOOTH) != PackageManager.PERMISSION_GRANTED) {
            Log.e(TAG, "Permissão Bluetooth não concedida");
            Toast.makeText(this, "Permissão Bluetooth não concedida", Toast.LENGTH_SHORT).show();
            return;
        }
    }

    private void conectarImpressora() {
        if (ContextCompat.checkSelfPermission(this, Manifest.permission.BLUETOOTH) != PackageManager.PERMISSION_GRANTED) {
            Log.e(TAG, "Permissão BLUETOOTH não concedida");
            Toast.makeText(this, "Permissão BLUETOOTH não concedida", Toast.LENGTH_SHORT).show();
            return;
        }

        if (!bluetoothAdapter.isEnabled()) {
            Toast.makeText(this, "Bluetooth não está ativado", Toast.LENGTH_SHORT).show();
            return;
        }

        Set<BluetoothDevice> pairedDevices = bluetoothAdapter.getBondedDevices();
        for (BluetoothDevice device : pairedDevices) {
            if (device.getName().equals("MTP-II_73B0")) {
                try {
                    socket = device.createRfcommSocketToServiceRecord(MY_UUID);
                    socket.connect();
                    outputStream = socket.getOutputStream();
                    Log.i(TAG, "Conexão com a impressora estabelecida com sucesso");
                    return;
                } catch (IOException e) {
                    Log.e(TAG, "Erro ao conectar-se à impressora", e);
                    Toast.makeText(this, "Erro ao conectar-se à impressora", Toast.LENGTH_SHORT).show();
                }
            }
        }
        Log.e(TAG, "Impressora não encontrada");
        Toast.makeText(this, "Impressora não encontrada", Toast.LENGTH_SHORT).show();
    }


    private void imprimir(String texto) {
        conectarImpressora();
        if (outputStream != null) {
            try {
                outputStream.write(texto.getBytes());
                Toast.makeText(this, "Impressão concluída", Toast.LENGTH_SHORT).show();
            } catch (IOException e) {
                Log.e(TAG, "Erro ao imprimir", e);
                Toast.makeText(this, "Erro ao imprimir", Toast.LENGTH_SHORT).show();
            } finally {
                fecharConexaoBluetooth();
            }
        } else {
            Log.e(TAG, "Falha ao imprimir: OutputStream nulo");
            Toast.makeText(this, "Falha ao imprimir", Toast.LENGTH_SHORT).show();
        }
    }

    private void fecharConexaoBluetooth() {
        if (socket != null) {
            try {
                socket.close();
                Log.i(TAG, "Conexão Bluetooth fechada com sucesso");
            } catch (IOException e) {
                Log.e(TAG, "Erro ao fechar a conexão Bluetooth", e);
            }
        }
    }
}
