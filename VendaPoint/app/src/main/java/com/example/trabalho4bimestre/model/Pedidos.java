package com.example.trabalho4bimestre.model;

public class Pedidos {

    private String cliente;
    private String item;
    private int quantidade;
    private int codigo;

    public Pedidos(){
        this.cliente = cliente;
        this.item = item;
        this.quantidade = quantidade;
        this.codigo = codigo;
    }

    public String getCliente() {return cliente;}

    public void setCliente(String cliente) {this.cliente = cliente;}

    public String getItem() {return item;}

    public void setItem(String item) {this.item = item;}

    public int getQuantidade() {return quantidade;}

    public void setQuantidade(int quantidade) {this.quantidade = quantidade;}

    public int getCodigo() {return codigo;}

    public void setCodigo(int codigo) {this.codigo = codigo;}
}
