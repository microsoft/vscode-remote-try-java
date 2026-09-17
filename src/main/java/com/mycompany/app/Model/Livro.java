package com.mycompany.app.Model;

public class Livro {
    private String titulo;
    private Autor autor;
    private String genero;
    private boolean disponivel;

    public Livro(String titulo, Autor autor, String genero, boolean disponivel){
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.disponivel = disponivel;
    }
    public String getTitulo(){
        return titulo;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public Autor getAutor(){
        return autor;
    }

    public void setAutor(Autor autor){
        this.autor = autor;
    }

    public String getGenero(){
        return genero;
    }

    public void setGenero(String genero){
        this.genero = genero;
    }

    public boolean isDisponivel(){
        return disponivel;
    }

    public boolean validarDisponibilidade(){
        if (disponivel){
            System.out.println("O livro está disponível.");
            return true;
        } else {
            System.out.println("O livro não está disponível.");
            return false;
        }
    }
}