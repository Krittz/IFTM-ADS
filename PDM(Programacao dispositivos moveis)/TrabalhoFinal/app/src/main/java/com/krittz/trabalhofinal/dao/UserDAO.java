package com.krittz.trabalhofinal.dao;

import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import com.krittz.trabalhofinal.model.User;

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

}
