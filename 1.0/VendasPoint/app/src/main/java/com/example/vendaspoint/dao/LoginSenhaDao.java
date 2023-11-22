package com.example.vendaspoint.dao;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.vendaspoint.helper.SQLiteDataHelper;
import com.example.vendaspoint.model.LoginSenha;

import java.util.ArrayList;


public class LoginSenhaDao implements IGenericDao<LoginSenha> {

    private SQLiteDataHelper openHelper;
    private SQLiteDatabase baseDados;
    private String[] colunas = {"IDLOGINSENHA" , "LOGIN" , "SENHA"};
    private String tabela = "LOGINSENHA";
    private Context context;
    private static LoginSenhaDao instancia;

    public static LoginSenhaDao getInstance(Context context){
        if (instancia == null){
            return instancia = new LoginSenhaDao(context);
        }else{
            return instancia;
        }
    }
    private LoginSenhaDao(Context context){
        this.context = context;
        openHelper = new SQLiteDataHelper(this.context, "VENDASPONT", null, 1);
        baseDados = openHelper.getWritableDatabase();

    }
    public LoginSenha getById(String login) {
        return null;
    }

    @Override
    public long insert(LoginSenha obj) {
        return 0;
    }

    @Override
    public long update(LoginSenha obj) {
        return 0;
    }

    @Override
    public long delete(LoginSenha obj) {
        return 0;
    }

    @Override
    public ArrayList<LoginSenha> getAll() {
        return null;
    }

    @Override
    public LoginSenha getById(int id) {
        return null;
    }
}
