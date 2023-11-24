package com.krittz.trabalhofinal.dao;

import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import com.krittz.trabalhofinal.model.User;

import org.mindrot.jbcrypt.BCrypt;

public class UserDAO {
    DBHelper dbHelper;
    private SQLiteDatabase database;

    public UserDAO(Context context) {
        dbHelper = new DBHelper(context);
    }

    public void open() throws SQLException {
        database = dbHelper.getWritableDatabase();
    }

    public void close() {
        database.close();
    }

    public long registerUser(User u) {
        long id = -1;
        try {
            open();

            if (database != null) {
                database.beginTransaction();
                id = database.insert(DBHelper.TABLE_USER, null, u.getValues());
                Log.d("KrittZ", "Usuário (" + id + ") cadastrado!");
                database.setTransactionSuccessful();
            } else {
                Log.e("KrittZ", "Banco de dados não foi aberto corretamente");
            }
        } catch (Exception e) {
            Log.e("KrittZ", "Erro ao cadastrar usuário", e);
        } finally {
            if (database != null && database.inTransaction()) {
                database.endTransaction();
            }
            close();
        }
        return id;
    }

    public String autenticar(String email, String senha) {
        try {
            open();
            String[] columns = {"email", "password"};
            String selection = "email = ?";
            String[] selectionArgs = {email};

            Cursor cursor = database.query(DBHelper.TABLE_USER, columns, selection, selectionArgs, null, null, null);
            if (cursor != null && cursor.moveToFirst()) {
                int passwordColumnIndex = cursor.getColumnIndex("password");
                if (passwordColumnIndex != -1) {
                    String hashedPassword = cursor.getString(passwordColumnIndex);
                    if (BCrypt.checkpw(senha, hashedPassword)) {
                        String useremail = cursor.getString(cursor.getColumnIndex("email"));
                        return useremail;
                    }
                }
            }
            return null;
        } catch (Exception e) {
            Log.e("Krittz", "Erro ao autenticar usuário", e);
        } finally {
            close();
        }
        return null;
    }


}
