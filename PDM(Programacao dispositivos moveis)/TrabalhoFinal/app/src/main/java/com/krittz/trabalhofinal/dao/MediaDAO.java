package com.krittz.trabalhofinal.dao;

import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import java.util.List;
import java.util.ArrayList;

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

    public Media getMediaByUserID(int userID) {
        Cursor cursor = null;
        try {
            open();
            String[] columns = {"id", "quilometros", "litros", "preco", "total"};
            String selection = "idUser = ?";
            String[] selectionArgs = {String.valueOf(userID)};

            cursor = database.query(DBHelper.TABLE_MEDIA, columns, selection, selectionArgs, null, null, null);

            if (cursor != null && cursor.moveToFirst()) {
                int idColumnIndex = cursor.getColumnIndex("id");
                int quillometrosColumnIndex = cursor.getColumnIndex("quilometros");
                int litrosColumnIndex = cursor.getColumnIndex("litros");
                int precoColumnIndex = cursor.getColumnIndex("preco");
                int totalColumnIndex = cursor.getColumnIndex("total");
                if (idColumnIndex != -1 && quillometrosColumnIndex != -1 && litrosColumnIndex != -1 && precoColumnIndex != -1 && totalColumnIndex != -1) {
                    Media media = new Media();
                    media.setId(cursor.getInt(idColumnIndex));
                    media.setQuilometros(cursor.getDouble(quillometrosColumnIndex));
                    media.setLitros(cursor.getDouble(litrosColumnIndex));
                    media.setPreco(cursor.getDouble(precoColumnIndex));
                    media.setTotal(cursor.getDouble(totalColumnIndex));
                    media.setIdUser(userID);
                    return media;

                } else {
                    return null;
                }
            } else {
                return null;
            }

        } catch (SQLException e) {
            Log.e("Find by userID", "Erro ao buscar média", e);
        } finally {
            if (cursor != null && !cursor.isClosed()) {
                cursor.close();
            }
            close();
        }
        return null;
    }


}
