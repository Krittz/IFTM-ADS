package com.krittz.trabalhofinal.model;

import android.content.ContentValues;

import org.mindrot.jbcrypt.BCrypt;

public class User {
    private int id;
    private String email;
    private String password;

    public User() {
    }


    public User(int id, Strign password, String email) {
        this.id = id;
        this.email = email;
        setSenha(password);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = BCrypt.hashpw(password, BCrypt.gensalt());
    }

    public boolean verificarSenha(String password) {
        return BCrypt.checkpw(password, this.password);
    }

    public ContentValues getValues() {
        ContentValues values = new ContentValues();
        if (this.id > 0) values.put("id", this.id);
        values.put("email", this.email);
        values.put("password", this.password);

        return values;
    }
}
