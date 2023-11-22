package com.example.vendaspoint.controller;

import android.content.Context;

import com.example.vendaspoint.dao.ClienteDao;
import com.example.vendaspoint.model.Cliente;


import java.util.ArrayList;

public class ClienteController {
    /**
    private Context context;
    public ClienteController (Context context){
        this.context = context;
    }
    public String registroCliente(String nome, String cpf) {
        try {
            if(nome.equals("") || nome.isEmpty()){
                return "É necessário inserir um nome para continuar.";
            }
            if(cpf.equals("") || cpf.isEmpty()){
                return "É necessário inserir um CPF para continuar.";
            }
            Cliente cliente = new Cliente.getInstance(context).g
            if (cliente != null){
                return "Cliente já cadastrato";
            }else{
                cliente = new Cliente();
                cliente.setNome(nome);
                cliente.setCpf(cpf);
            }
        }catch (Exception ex){
            return "Erro ao Registrar Cliente";

        }
        return null;

    }
    public ArrayList<Cliente> retornarRegistroCliente(){
        return Cliente.getInstance
    }
**/
    private Context context;

    public ClienteController (Context context){
        this.context = context;
    }

    public String registroCliente(String nome, String cpf) {
        try {
            if(nome.equals("") || nome.isEmpty()){
                return "É necessário inserir um nome para continuar.";
            }
            if(cpf.equals("") || cpf.isEmpty()){
                return "É necessário inserir um cpf para continuar.";
            }
            Cliente cliente = ClienteDao.getInstance(context).getById(cpf);
            if (cliente != null){
                return "Cliente já cadastrado ";
            }else{
                cliente = new Cliente();
                cliente.setNome(nome);
                cliente.setCpf(cpf);
            }
        }catch (Exception ex){
            return "Erro ao cadastrar cliente";

        }
        return null;

    }
    public ArrayList<Cliente> retornarClientes(){
        return ClienteDao.getInstance(context).getAll();
    }
}
