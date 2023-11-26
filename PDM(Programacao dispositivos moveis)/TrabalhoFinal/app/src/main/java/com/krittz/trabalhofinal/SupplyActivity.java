package com.krittz.trabalhofinal;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatEditText;

public class SupplyActivity extends AppCompatActivity {
    AppCompatButton btnSalvar, btnCancelar;
    AppCompatEditText inputLitros, inputQuilometros, inputPrecoLitro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.supply);

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
                String litros = inputLitros.getText().toString().trim();
                String quilometros = inputQuilometros.getText().toString().trim();
                String preco = inputPrecoLitro.getText().toString().trim();

                if (TextUtils.isEmpty(litros) || TextUtils.isEmpty(quilometros) || TextUtils.isEmpty(preco)) {
                    Toast.makeText(SupplyActivity.this, "Preencha todos os campos", Toast.LENGTH_SHORT).show();
                }else{

                }
            }
        });
    }
}
