package cristian.roteirosms;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.content.pm.PackageManager;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import android.Manifest;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final AppCompatActivity activity = this;
        AppCompatButton btnSend = findViewById(R.id.btnSend);
        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(ContextCompat.checkSelfPermission(activity, Manifest.permission.SEND_SMS)
                        != PackageManager.PERMISSION_GRANTED){
                    ActivityCompat.requestPermissions(activity, new String[]{Manifest.permission.SEND_SMS}, 1);
                }
                smsJava(view);
            }
        });
    }

    public void smsJava(View v) {
        EditText inputNum = (EditText) findViewById(R.id.inputPhone);
        EditText inputMsg = (EditText) findViewById(R.id.inputMessage);
        String numero = inputNum.getText().toString().trim();
        String mensagem = inputMsg.getText().toString();

        if (numero.isEmpty() || mensagem.isEmpty()) {
            Toast.makeText(getApplicationContext(), "Por favor, preencha todos os campos.", Toast.LENGTH_LONG).show();
        } else {
            try {
                SmsManager smsManager = SmsManager.getDefault();
                smsManager.sendTextMessage(numero, null, mensagem, null, null);
                Toast.makeText(getApplicationContext(), "Mensagem enviada com sucesso.", Toast.LENGTH_LONG).show();
            } catch (Exception e) {
                Toast.makeText(getApplicationContext(), "Falha ao enviar SMS: " + e.getMessage(), Toast.LENGTH_LONG).show();
                e.printStackTrace();
            }
        }
    }
}