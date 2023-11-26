package com.example.trabalho4bimestre.controller;

import android.content.Context;

import com.example.trabalho4bimestre.dao.PedidosDao;
import com.example.trabalho4bimestre.model.Pedidos;
import com.example.trabalho4bimestre.view.PedidosActivity;

import java.util.ArrayList;

public class PedidosController {
    private Context context;
    public PedidosController(Context context) {
        this.context = context;
    }
    public String salvarPedido(String cliente, String item, String quantidade){
        try{
            if(cliente.equals("") || cliente.isEmpty()){
                return "É necessário informar o nome do Cliente!";
            }
            if(item.equals("") || item.isEmpty()){
                return "É necessário informar o nome do Item!";
            }
            if(quantidade.equals("") || quantidade.isEmpty()){
                return "É necessário informar a Quantidade!";
            }

                Pedidos pedidos = new Pedidos();
                pedidos.setCliente(cliente);
                pedidos.setItem(item);
                pedidos.setQuantidade(Integer.parseInt(quantidade));
                PedidosDao.getInstancia(context).insert(pedidos);

        }catch (Exception ex){
            return "Erro, Verifique os dados novamente."+ex.getMessage()+cliente+item+quantidade;}
        return null;
    }

    public ArrayList<Pedidos> retornarPedidos(){
        return PedidosDao.getInstancia(context).getAll();
    }
}
