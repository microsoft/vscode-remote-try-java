package com.mycompany.app.Model;

public class Autor extends Pessoa {
    private String nacionalidade;
    private Livro[] obrasPublicadas;

    public Autor(String nome, String nacionalidade){
        super(nome);
        this.nacionalidade = nacionalidade;
    }

    public String getNacionalidade(){
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade){
        this.nacionalidade = nacionalidade;
    }


    public Livro[] getObrasPublicadas(){
        return obrasPublicadas;
    }

    public void setObrasPublicadas(Livro[] livro){
        this.obrasPublicadas = livro;
    }
}