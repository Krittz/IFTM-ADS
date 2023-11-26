package com.krittz.trabalhofinal.dao;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBHelper extends SQLiteOpenHelper {
    private static final String DB_NAME = "trabalhoFinal.db";
    private static final int DB_VERSION = 1;
    public static final String TABLE_USER = "user";
    public static final String TABLE_MEDIA = "media";

    public DBHelper(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String createUserTable = "CREATE TABLE " + TABLE_USER + " (id INTEGER PRIMARY KEY AUTOINCREMENT, email TEXT NOT NULL, password TEXT NOT NULL);";
        String createMediaTable = "CREATE TABLE " + TABLE_MEDIA + " (id INTEGER PRIMARY KEY AUTOINCREMENT, quilometros REAL NOT NULL, litros REAL NOT NULL, preco REAL NOT NULL, total REAL NOT NULL, idUser INTEGER, FOREIGN KEY (idUser) REFERENCES " + TABLE_USER + "(id) ON DELETE CASCADE);";
        db.execSQL(createUserTable);
        db.execSQL(createMediaTable);
    }


    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
