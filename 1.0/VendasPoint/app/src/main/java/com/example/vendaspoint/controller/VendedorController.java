package com.example.vendaspoint.controller;

import android.content.Context;

import com.example.vendaspoint.dao.VendedorDao;
import com.example.vendaspoint.model.Vendedor;

import java.util.ArrayList;

public class VendedorController {

    private Context context;

    public VendedorController (Context context){
        this.context = context;
    }

    private String nome;
    private int registro;
    private String login;
    private String senha;

    public String RegistroVendedor(String nome, int registro, String login, String senha) {
        try {

            // Altera Texto
            if(nome.equals("") || nome.isEmpty()){
                return "É necessário inserir um Nome para produto.";
            }
            if(registro == 0 ){
                return "É necessário inserir um código.";
            }
            if(login.equals("") || login.isEmpty()){
                return "É necessário inserir uma descrição";
            }
            if(senha.equals("") || senha.isEmpty()){
                return "É necessário inserir uma descrição";
            }

            Vendedor vendedor = VendedorDao.getInstance(context).getById(nome);
            if (nome != null){
                return "n sei oq fala aqui ";
            }else{
                vendedor = new Vendedor();
                vendedor.setNome(nome);
                vendedor.setRegistro(registro);
                vendedor.setLogin(login);
                vendedor.setSenha(senha);


            }
        }catch (Exception ex){
            return "aqui também";

        }
        return null;
    }
    public ArrayList<Vendedor> RegistroProduto(){
        return VendedorDao.getInstance(context).getAll();
    }
}
