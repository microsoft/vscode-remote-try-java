package com.mycompany.app.Model;

import java.util.Date;

public class Emprestimo {
    private Date dataRetirada;
    private Date dataDevolucao;
    private Livro livro;
    private Usuario usuario;

    public Emprestimo ( Date dataRetirada, Date dataDevolucao, Livro livro, Usuario usuario){
        this.dataRetirada = dataRetirada;
        this.dataDevolucao = dataDevolucao;
        this.livro = livro;
        this.usuario = usuario;
    }
    
    public Date getDataRetirada(){
        return dataRetirada;
    }

    public void setDataRetirada(Date dataRetirada){
        this.dataRetirada = dataRetirada;
    }

    public Date getDataDevolucao(){
        return dataDevolucao;
    }

    public void setDataDevolucao(Date dataDevolucao){
        this.dataDevolucao = dataDevolucao;
    }

    public Livro getLivro(){
        return livro;
    }

    public void setLivro(Livro livro){
        this.livro = livro;
    }

    public Usuario getUsuario(){
        return usuario;
    }

    public void setUsuario(Usuario usuario){
        this.usuario = usuario;
    }
}