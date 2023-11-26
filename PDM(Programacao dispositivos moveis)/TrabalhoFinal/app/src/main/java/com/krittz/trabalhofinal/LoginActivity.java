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

import com.krittz.trabalhofinal.model.User;

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
                    User authenticatedUser = userDAO.autenticar(email, pass);

                    if (authenticatedUser != null) {
                        // Autenticação bem-sucedida
                        inputEmail.getText().clear();
                        inputPass.getText().clear();

                        // Obtenha os dados do usuário autenticado
                        int userId = authenticatedUser.getId();
                        String userEmail = authenticatedUser.getEmail();
                        Log.d("Autenticar: ", "Email:" + userEmail);
                        Log.d("Autenticar: ", "ID: " + userId);


                        // Redirecione para a HomeActivity
                        Intent i = new Intent(LoginActivity.this, HomeActivity.class);
                        i.putExtra("USER_EMAIL", userEmail);
                        i.putExtra("USER_ID", String.valueOf(userId));  // Converta para String
                        startActivity(i);
                    } else {
                        // Credenciais inválidas
                        Toast.makeText(LoginActivity.this, "E-mail ou senha incorretos", Toast.LENGTH_SHORT).show();
                    }
                } else {
                    // Campos vazios
                    Toast.makeText(LoginActivity.this, "Preencha todos os campos", Toast.LENGTH_SHORT).show();
                }
            }
        });


    }
}