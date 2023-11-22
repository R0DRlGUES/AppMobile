package com.example.vendaspoint.dao;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.example.vendaspoint.helper.SQLiteDataHelper;
import com.example.vendaspoint.model.LoginSenha;
import com.example.vendaspoint.model.PedidoVenda;

import java.util.ArrayList;

public class PedidoVendaDao implements IGenericDao{

    private SQLiteDataHelper openHelper;
    private SQLiteDatabase baseDados;
    private String[] colunas = {"NOMEPRODUTO" , "QUANTIDADE" , "VALOR"};
    private String tabela = "PEDIDOVENDA";
    private Context context;
    private static PedidoVendaDao instancia;

    public static PedidoVendaDao getInstance(Context context){
        if (instancia == null){
            return instancia = new PedidoVendaDao(context);
        }else{
            return instancia;
        }
    }
    private PedidoVendaDao(Context context){
        this.context = context;
        openHelper = new SQLiteDataHelper(this.context, "VENDASPONT", null, 1);
        baseDados = openHelper.getWritableDatabase();

    }
    public PedidoVenda getById(String nomeProduto) {
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
