package com.example.vendaspoint.controller;

import android.content.Context;

import com.example.vendaspoint.dao.IGenericDao;
import com.example.vendaspoint.dao.LoginSenhaDao;
import com.example.vendaspoint.model.LoginSenha;

import java.util.ArrayList;

public class LoginSenhaController{
     private Context context;

     public LoginSenhaController (Context context){
         this.context = context;
     }

    public String registroLoginSenha(String login, String senha) {
         try {
             if(login.equals("") || login.isEmpty()){
                 return "É necessário inserir um login para continuar.";
             }
             if(senha.equals("") || senha.isEmpty()){
                 return "É necessário inserir uma senha para continuar.";
             }
             LoginSenha loginSenha = LoginSenhaDao.getInstance(context).getById(login);
             if (loginSenha != null){
                 return "Ja existe Login e senha registrado ";
             }else{
                 loginSenha = new LoginSenha();
                 loginSenha.setLogin(login);
                 loginSenha.setSenha(senha);
             }
         }catch (Exception ex){
             return "Erro ao Registrar usuário";

         }
         return null;

    }
    public ArrayList<LoginSenha> retornarLoginsSenhas(){
         return LoginSenhaDao.getInstance(context).getAll();
    }
}
