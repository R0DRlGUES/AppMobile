package com.example.vendaspoint.controller;

import android.content.Context;

import com.example.vendaspoint.dao.PedidoVendaDao;
import com.example.vendaspoint.model.PedidoVenda;

import java.util.ArrayList;

public class PedidoVendaController {
    private Context context;

    public PedidoVendaController (Context context){
        this.context = context;
    }

    private String nomeProduto;
    private int quantidade;
    private double valor;

    public String RegistroPedidoVenda(String nomeProduto, int quantidade, double valor) {
        try {
            if(nomeProduto.equals("") || nomeProduto.isEmpty()){
                return "É necessário inserir um produto.";
            }
            if(quantidade == 0 ){
                return "É necessário inserir a quantidade para continuar.";
            }
            if(valor == 0.0){
                return "É necessário inserir o valor para continuar.";
            }

            PedidoVenda pedidoVenda = PedidoVendaDao.getInstance(context).getById(nomeProduto);
            if (nomeProduto != null){
                return "n sei oq fala aqui ";
            }else{
                pedidoVenda = new PedidoVenda();
                pedidoVenda.setNomeProduto(nomeProduto);
                pedidoVenda.setQuantidade(quantidade);
                pedidoVenda.setValor(valor);

            }
        }catch (Exception ex){
            return "aqui também";

        }
        return null;

    }
    public ArrayList<PedidoVenda> RegistroPedidoVenda(){
        return PedidoVendaDao.getInstance(context).getAll();
    }
}
