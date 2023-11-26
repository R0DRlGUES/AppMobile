package com.example.trabalho4bimestre.helper;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import androidx.annotation.Nullable;

public class SQLiteDataHelper extends SQLiteOpenHelper {

    public SQLiteDataHelper(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory,int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL("CREATE TABLE PEDIDOVENDA (CLIENTE VARCHAR(100), ITEM VARCHAR(100), QUANTIDADE INTEGER, CODIGO INTEGER)");
        sqLiteDatabase.execSQL("CREATE TABLE LOGINSENHA (USUARIO VARCHAR(100), SENHA VARCHAR(100))");
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int oldVersion, int newVersion) {
    }
}

