package com.example.vendaspoint.dao;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.example.vendaspoint.helper.SQLiteDataHelper;
import com.example.vendaspoint.model.Produto;

import java.util.ArrayList;


public class ProdutoDao implements IGenericDao{
    private SQLiteDataHelper openHelper;
    private SQLiteDatabase baseDados;
    private String[] colunas = {"NOMEPRODUTO" , "CODIGO" , "DESCRICAO", "VALOR"};
    private String tabela = "PRODUTO";
    private Context context;
    private static ProdutoDao instancia;

    public static ProdutoDao getInstance(Context context){
        if (instancia == null){
            return instancia = new ProdutoDao(context);
        }else{
            return instancia;
        }
    }
    private ProdutoDao(Context context){
        this.context = context;
        openHelper = new SQLiteDataHelper(this.context, "VENDASPONT", null, 1);
        baseDados = openHelper.getWritableDatabase();

    }
    public Produto getById(String nomeProduto) {
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
