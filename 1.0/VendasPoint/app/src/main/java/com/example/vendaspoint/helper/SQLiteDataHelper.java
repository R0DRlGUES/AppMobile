package com.example.vendaspoint.helper;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;


public class SQLiteDataHelper extends SQLiteOpenHelper {

    public SQLiteDataHelper(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL("CREATE TABLE VENDEDOR (NOME VARCHAR(100), REGISTRO INTEGER, LOGIN VARCHAR(100), SENHA VARCHAR(100))");
        sqLiteDatabase.execSQL("CREATE TABLE PEDIDOVENDA(NOMEPRODUTO VARCHAR(100), QUANTIDADE INTEGER, VALOR NUMERIC)");
        sqLiteDatabase.execSQL("CREATE TABLE CLIENE (NOME VARCHAR(100), CPF VARCHAR(100))");
        sqLiteDatabase.execSQL("CREATE TABLE PRODUTO (NOMEPRODUTO VARCHAR(100), CODIGO INTEGER, DESCRICAO VARCHAR(100), VALOR NUMERIC)");
        sqLiteDatabase.execSQL("CREATE TABLE LOGINSENHA(LOGIN VARCHAR(100), SENHA VARCHAR(100))");

        }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
