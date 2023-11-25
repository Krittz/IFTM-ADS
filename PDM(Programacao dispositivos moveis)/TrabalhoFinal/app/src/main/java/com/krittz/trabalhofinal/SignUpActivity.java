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
import androidx.appcompat.widget.AppCompatImageButton;

import com.krittz.trabalhofinal.dao.UserDAO;
import com.krittz.trabalhofinal.model.User;

public class SignUpActivity extends AppCompatActivity {
    AppCompatButton btnLogin, btnSignUp;
    AppCompatEditText inputEmail, inputPass, inputConfirmPass;

    UserDAO userDAO;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup);
        userDAO = new UserDAO(this);

        btnLogin = findViewById(R.id.btnLogin);

        btnSignUp = findViewById(R.id.btnSignup);
        inputEmail = findViewById(R.id.signupEmail);
        inputPass = findViewById(R.id.signupSenha);
        inputConfirmPass = findViewById(R.id.signupConfirmarSenha);


        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                redirectLogin();
            }
        });

        btnSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = inputEmail.getText().toString().trim();
                String pass = inputPass.getText().toString().trim();
                String confirmPass = inputConfirmPass.getText().toString().trim();

                if (TextUtils.isEmpty(email) || TextUtils.isEmpty(pass) || TextUtils.isEmpty(confirmPass)) {
                    Toast.makeText(SignUpActivity.this, "Preencha todos os campos", Toast.LENGTH_SHORT).show();
                } else if (!pass.equals(confirmPass)) {
                    Toast.makeText(SignUpActivity.this, "As senhas não coincidem", Toast.LENGTH_SHORT).show();
                } else {
                    User user = new User();
                    user.setEmail(email);
                    user.setPassword(pass);
                    long userID = userDAO.registerUser(user);
                    if (userID > -1) {
                        Toast.makeText(SignUpActivity.this, "Usuário cadastrado com sucesso!", Toast.LENGTH_SHORT).show();
                        clear();
                        Log.d("KRITTZ", "Usuário cadastrado " + userID);
                        redirectLogin();
                    } else {
                        Toast.makeText(SignUpActivity.this, "Erro ao cadastrar usuário", Toast.LENGTH_SHORT).show();
                    }

                }
            }
        });

    }

    private void clear() {
        inputEmail.getText().clear();
        inputPass.getText().clear();
        inputConfirmPass.getText().clear();
    }

    public void redirectLogin() {
        Intent i = new Intent(SignUpActivity.this, LoginActivity.class);
        startActivity(i);
    }
}
