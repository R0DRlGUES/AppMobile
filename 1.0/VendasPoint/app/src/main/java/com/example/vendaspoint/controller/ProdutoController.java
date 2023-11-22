package com.example.vendaspoint.controller;

import android.content.Context;


import com.example.vendaspoint.dao.ProdutoDao;
import com.example.vendaspoint.model.Produto;

import java.util.ArrayList;

public class ProdutoController {

    private Context context;

    public ProdutoController (Context context){
        this.context = context;
    }

    private String nomeProduto;
    private int codigo;
    private String descricao;
    private double valor;

    public String RegistroProduto(String nomeProduto, int quantidade, double valor) {
        try {
            if(nomeProduto.equals("") || nomeProduto.isEmpty()){
                return "É necessário inserir um Nome para produto.";
            }
            if(codigo == 0 ){
                return "É necessário inserir um código.";
            }
            if(descricao.equals("") || descricao.isEmpty()){
                return "É necessário inserir uma descrição";
            }
            if(valor == 0.0){
                return "É necessário inserir o valor para continuar.";
            }

            Produto produto = ProdutoDao.getInstance(context).getById(nomeProduto);
            if (nomeProduto != null){
                return "n sei oq fala aqui ";
            }else{
                produto = new Produto();
                produto.setNomeProduto(nomeProduto);
                produto.setCodigo(codigo);
                produto.setDescricao(produto.getDescricao());
                produto.setValor(valor);


            }
        }catch (Exception ex){
            return "aqui também";

        }
        return null;
    }
    public ArrayList<Produto> RegistroProduto(){
        return ProdutoDao.getInstance(context).getAll();
    }
}
