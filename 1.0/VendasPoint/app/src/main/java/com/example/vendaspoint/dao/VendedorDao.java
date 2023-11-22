package com.example.vendaspoint.dao;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.example.vendaspoint.helper.SQLiteDataHelper;
import com.example.vendaspoint.model.Produto;
import com.example.vendaspoint.model.Vendedor;

import java.util.ArrayList;

public class VendedorDao implements IGenericDao{
    private SQLiteDataHelper openHelper;
    private SQLiteDatabase baseDados;
    private String[] colunas = {"NOME" , "REGISTRO" , "LOGIN", "SENHA"};
    private String tabela = "VENDEDOR";
    private Context context;
    private static VendedorDao instancia;

    public static VendedorDao getInstance(Context context){
        if (instancia == null){
            return instancia = new VendedorDao(context);
        }else{
            return instancia;
        }
    }
    private VendedorDao(Context context){
        this.context = context;
        openHelper = new SQLiteDataHelper(this.context, "VENDASPONT", null, 1);
        baseDados = openHelper.getWritableDatabase();

    }
    public Vendedor getById(String nome) {
        return null;
    }

    @Override
    public long insert(Object obj) {
        return 0;
    }

    @Override
    public long update(Object obj) {
        return 0;
    }

    @Override
    public long delete(Object obj) {
        return 0;
    }

    @Override
    public ArrayList getAll() {
        return null;
    }

    @Override
    public Object getById(int id) {
        return null;
    }
}
