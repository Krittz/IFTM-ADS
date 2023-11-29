package com.krittz.trabalhofinal;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatEditText;

import com.krittz.trabalhofinal.dao.MediaDAO;
import com.krittz.trabalhofinal.model.Media;

public class SupplyActivity extends AppCompatActivity {
    AppCompatButton btnSalvar, btnCancelar;
    AppCompatEditText inputLitros, inputQuilometros, inputPrecoLitro;
    String userId;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.supply);
        userId = getIntent().getStringExtra("USER_ID");


        btnCancelar = findViewById(R.id.btnCancelar);
        btnSalvar = findViewById(R.id.btnSalvarAbastecimento);
        inputLitros = findViewById(R.id.inputLitros);
        inputQuilometros = findViewById(R.id.inputKmAtual);
        inputPrecoLitro = findViewById(R.id.inputPrecoLitro);


        btnCancelar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        btnSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String strLitros = inputLitros.getText().toString().trim();
                String strQuilometros = inputQuilometros.getText().toString().trim();
                String strPreco = inputPrecoLitro.getText().toString().trim();

                if (TextUtils.isEmpty(strLitros) || TextUtils.isEmpty(strQuilometros) || TextUtils.isEmpty(strPreco)) {
                    Toast.makeText(SupplyActivity.this, "Preencha todos os campos", Toast.LENGTH_SHORT).show();
                } else {
                    Media media = new Media();
                    media.setIdUser(Integer.parseInt(userId));

                    Double litros = Double.parseDouble(strLitros.replace(",", "."));
                    Double quilometros = Double.parseDouble(strQuilometros.replace(",", "."));
                    Double preco = Double.parseDouble(strPreco.replace(",", "."));
                    media.setLitros(litros);
                    media.setQuilometros(quilometros);
                    media.setPreco(preco);
                    media.setTotal(quilometros / litros);
                    MediaDAO mediaDAO = new MediaDAO(getApplicationContext());
                    Media m = mediaDAO.cadastrarMedia(media);
                    Log.d("MEDIAS", "Media cadastrar ID> " + m.getId() + "Total Km/L: " + m.getTotal());
                    clear();
                    finish();

                }
            }
        });
    }

    private void clear() {
        inputPrecoLitro.getText().clear();
        inputLitros.getText().clear();
        inputQuilometros.getText().clear();
    }
}
