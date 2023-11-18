package com.krittz.trabalhofinal.dao;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBHelper extends SQLiteOpenHelper {
    private static final String DB_NAME = "trabalhoFinal.db";
    private static final int DB_VERSION = 1;
    public static final String TABLE_USER = "user";

    public DBHelper(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String createUser_table = "CREATE TABLE user(id INT PRIMARY KEY, email TEXT NOT NULL, password TEXT NOT NULL);";
        db.execSQL(createUser_table);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
