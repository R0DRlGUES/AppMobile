package com.example.vendaspoint.dao;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.example.vendaspoint.helper.SQLiteDataHelper;
import com.example.vendaspoint.model.Cliente;
import com.example.vendaspoint.model.LoginSenha;

import java.util.ArrayList;

public class ClienteDao implements IGenericDao<Cliente>{

    private SQLiteDataHelper openHelper;
    private SQLiteDatabase baseDados;
    private String[] colunas = {"NOME", "CPF"};
    private String tabela = "CLIENTE";
    private Context context;
    private static ClienteDao instancia;

    public static ClienteDao getInstance(Context context){
        if (instancia == null){
            return instancia = new ClienteDao(context);
        }else{
            return instancia;
        }
    }
    private ClienteDao(Context context){
        this.context = context;
        openHelper = new SQLiteDataHelper(this.context, "VENDASPONT", null, 1);
        baseDados = openHelper.getWritableDatabase();

    }

    public Cliente getById(String cpf) {
        return null;
    }
    @Override
    public long insert(Cliente obj) {
        return 0;
    }

    @Override
    public long update(Cliente obj) {
        return 0;
    }

    @Override
    public long delete(Cliente obj) {
        return 0;
    }

    @Override
    public ArrayList<Cliente> getAll() {
        return null;
    }

    @Override
    public Cliente getById(int id) {
        return null;
    }
}
