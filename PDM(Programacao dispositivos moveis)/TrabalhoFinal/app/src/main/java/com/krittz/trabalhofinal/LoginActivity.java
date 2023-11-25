package com.krittz.trabalhofinal;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatImageButton;

import com.krittz.trabalhofinal.dao.UserDAO;

public class LoginActivity extends AppCompatActivity {
    AppCompatButton btnLogin, btnCadastrar;

    AppCompatEditText inputEmail, inputPass;
    UserDAO userDAO;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        userDAO = new UserDAO(this);
        btnLogin = findViewById(R.id.btnLogin);
        btnCadastrar = findViewById(R.id.btnCadastrar);

        inputEmail = findViewById(R.id.loginEmail);
        inputPass = findViewById(R.id.loginSenha);


        btnCadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(LoginActivity.this, SignUpActivity.class);
                startActivity(i);
            }
        });
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = inputEmail.getText().toString().trim();
                String pass = inputPass.getText().toString().trim();
                if (!TextUtils.isEmpty(email) && !TextUtils.isEmpty(pass)) {
                    String authenticatedEmail = userDAO.autenticar(email, pass);
                    if (authenticatedEmail != null) {
                        inputEmail.getText().clear();
                        inputPass.getText().clear();
                        Intent i = new Intent(LoginActivity.this, HomeActivity.class);
                        i.putExtra("USER_EMAIL", authenticatedEmail);
                        startActivity(i);
                    } else {
                        Toast.makeText(LoginActivity.this, "E-mail ou senha incorretos", Toast.LENGTH_SHORT).show();
                    }
                } else {
                    Toast.makeText(LoginActivity.this, "Preencha todos os campos", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}