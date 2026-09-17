package com.mycompany.app;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import com.mycompany.app.Model.*;

public class PessoaTest {
    @Test
    public void testGetNome(){
        Pessoa pessoa = new Pessoa("Alysson");
        assertEquals("Alysson", pessoa.getNome());
    };
    @Test
    public void testSetNome(){
        Pessoa pessoa = new Pessoa("Alysson");
        pessoa.setNome("Maria");
        assertEquals("Maria", pessoa.getNome());
    }
    @Test
    public void testGetLivros(){
        Pessoa pessoa = new Pessoa("Alysson");

        Livro[] livros = new Livro[2];
        Autor autor = new Autor("Alysson", "Brasileiro");
        livros[0] = new Livro("Meu pé de laranja lima", autor, "Romance", true);
        livros[0] = new Livro("Dom Casmurro", autor, "Romance", true);

        pessoa.setLivros(livros);
        assertArrayEquals(livros, pessoa.getLivros());
    }

    @Test
    public void testSetLivros(){
        Pessoa pessoa = new Pessoa("Alysson");

        Livro[] livros = new Livro[2];
        Autor autor = new Autor("Alysson", "Brasileiro");
        livros[0] = new Livro("Meu pé de laranja lima", autor, "Romance", true);
        livros[0] = new Livro("Dom Casmurro", autor, "Romance", true);

        pessoa.setLivros(livros);
        assertArrayEquals(livros, pessoa.getLivros());
    }
}
