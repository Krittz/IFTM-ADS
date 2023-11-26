package com.krittz.trabalhofinal.dao;

import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import com.krittz.trabalhofinal.model.Media;

public class MediaDAO {
    DBHelper dbHelper;
    private SQLiteDatabase database;

    public MediaDAO(Context context) {
        dbHelper = new DBHelper(context);
    }

    public void open() throws SQLException {
        database = dbHelper.getWritableDatabase();
    }

    public void close() {
        database.close();
    }

    public Media cadastrarMedia(Media m) {
        Media media = null;
        long id = -1;
        try {
            open();
            if (database != null) {
                database.beginTransaction();
                id = database.insert(DBHelper.TABLE_MEDIA, null, m.getValues());


                if (id != -1) {

                    m.setId((int) id);


                    media = m;

                    Log.d("Krittz", "Média (" + id + ") cadastrada!");
                    database.setTransactionSuccessful();
                } else {
                    Log.e("Krittz", "Falha ao cadastrar média");
                }
            } else {
                Log.e("Krittz", "Banco de dados não foi aberto corretamente");
            }
        } catch (Exception e) {
            Log.e("Krittz", "Erro ao cadastrar média", e);
        } finally {
            if (database != null && database.inTransaction()) {
                database.endTransaction();
            }
            close();
        }

        return media;
    }

}
