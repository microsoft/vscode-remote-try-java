package com.mycompany.app.Model;

public class Pessoa {

    public Pessoa (String nome){
        this.nome = nome;
    }

    private String nome;
    protected Livro[] listaLivros;

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public Livro[] getLivros(){
        return listaLivros;
    }

    public void setLivros(Livro[] listaLivros){
        this.listaLivros = listaLivros;
    }
}