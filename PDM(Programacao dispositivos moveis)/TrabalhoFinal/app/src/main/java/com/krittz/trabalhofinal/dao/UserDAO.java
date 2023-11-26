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


    public User autenticar(String email, String senha) {
        Cursor cursor = null;

        try {
            open();
            String[] columns = {"id", "email", "password"};
            String selection = "email = ?";
            String[] selectionArgs = {email};

            cursor = database.query(DBHelper.TABLE_USER, columns, selection, selectionArgs, null, null, null);

            if (cursor != null && cursor.moveToFirst()) {
                int idColumnIndex = cursor.getColumnIndex("id");
                int emailColumnIndex = cursor.getColumnIndex("email");
                int passwordColumnIndex = cursor.getColumnIndex("password");

                if (idColumnIndex != -1 && emailColumnIndex != -1 && passwordColumnIndex != -1) {
                    int userId = cursor.getInt(idColumnIndex);
                    String userEmail = cursor.getString(emailColumnIndex);
                    String hashedPassword = cursor.getString(passwordColumnIndex);
                    Log.d("UserDAO", "ID: " + userId);
                    Log.d("UserDAO", "Email:" + userEmail);
                    if (BCrypt.checkpw(senha, hashedPassword)) {
                        User authenticatedUser = new User();
                        authenticatedUser.setId(userId);
                        authenticatedUser.setEmail(userEmail);
                        authenticatedUser.setPassword(hashedPassword);
                        return authenticatedUser;
                    } else {
                        return null;  // Senha incorreta
                    }
                } else {
                    return null;  // Alguma coluna está ausente
                }
            }
        } catch (Exception e) {
            Log.e("Krittz", "Erro ao autenticar usuário", e);
        } finally {
            if (cursor != null && !cursor.isClosed()) {
                cursor.close();
            }
            close();
        }

        return null;  // Usuário não encontrado
    }


}
