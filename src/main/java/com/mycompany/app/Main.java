package com.mycompany.app;

import java.util.Date;

import com.mycompany.app.Model.*;

public class Main {
    public static void main(String[] args){
        Autor autor = new Autor("Alysson","Brasileiro");
        autor.setNome("Alysson Faria");
        autor.setNacionalidade("Brasileiro");


        Livro livro = new Livro("Java for begginers", autor, "Tecnologia", false);
        livro.validarDisponibilidade();

        
        Usuario usuario = new Usuario("Lucas Rafael", 25);
        usuario.setNome("Lucas Rafael");
        usuario.setIdade(25);

        Emprestimo emprestimo = new Emprestimo(new Date(),new Date(),livro, usuario);

        System.out.println("Livro: " + livro.getTitulo());
        System.out.println("Autor: " + livro.getAutor().getNome());
        System.out.println("Gênero: " + livro.getGenero());
        System.out.println("Usuário: " + usuario.getNome());
        System.out.println("Idade: " + usuario.getIdade());
        System.out.println("Data de Retirada: " + emprestimo.getDataRetirada());
        System.out.println("Data de Devolução: " + emprestimo.getDataDevolucao());
    }
}