package com.mycompany.app;
import org.junit.Test;
import java.util.Date;

import static org.junit.Assert.assertEquals;

import com.mycompany.app.Model.*;

public class EmprestimoTest {
    @Test
    public void testGetDataRetirada(){
    Date dataRetirada = new Date();
    Date dataDevolucao = new Date();
    Livro livro = new Livro("Java Basics", new Autor("Alan Turing", "Inglês"), "Tecnologia", true);
    Usuario usuario = new Usuario("Gabriel", 21);
    Emprestimo emprestimo = new Emprestimo(dataRetirada, dataDevolucao, livro, usuario);
    assertEquals(dataRetirada, emprestimo.getDataRetirada());
    }

    @Test
    public void testSetDataRetirada(){
    Date dataRetirada = new Date();
    Date dataDevolucao = new Date();
    Livro livro = new Livro("Java Basics", new Autor("Alan Turing", "Inglês"), "Tecnologia", true);
    Usuario usuario = new Usuario("Gabriel", 21);
    Emprestimo emprestimo = new Emprestimo(dataRetirada, dataDevolucao, livro, usuario);
    Date novaDataRetirada = new Date();
    emprestimo.setDataRetirada(novaDataRetirada);
    assertEquals(novaDataRetirada, emprestimo.getDataRetirada());
    }

    @Test
    public void testGetDataDevolucao(){
    Date dataRetirada = new Date();
    Date dataDevolucao = new Date();
    Livro livro = new Livro("Java Basics", new Autor("Alan Turing", "Inglês"), "Tecnologia", true);
    Usuario usuario = new Usuario("Gabriel", 21);
    Emprestimo emprestimo = new Emprestimo(dataRetirada, dataDevolucao, livro, usuario);
    assertEquals(dataDevolucao, emprestimo.getDataDevolucao());
    }

    @Test
    public void testSetDataDevolucao(){
    Date dataRetirada = new Date();
    Date dataDevolucao = new Date();
    Livro livro = new Livro("Java Basics", new Autor("Alan Turing", "Inglês"), "Tecnologia", true);
    Usuario usuario = new Usuario("Gabriel", 21);
    Emprestimo emprestimo = new Emprestimo(dataRetirada, dataDevolucao, livro, usuario);
    Date novaDataDevolucao = new Date();
    emprestimo.setDataRetirada(novaDataDevolucao);
    assertEquals(novaDataDevolucao, emprestimo.getDataDevolucao());
    }

    @Test
    public void testGetLivro(){
        Date dataRetirada = new Date();
        Date dataDevolucao = new Date();
        Livro livro = new Livro("Java Basics", new Autor("Alan Turing", "Inglês"), "Tecnologia", true);
        Usuario usuario = new Usuario("Gabriel", 21);
        Emprestimo emprestimo = new Emprestimo(dataRetirada, dataDevolucao, livro, usuario);
        assertEquals(livro, emprestimo.getLivro());
    }

    @Test
    public void testSetLivro(){
        Date dataRetirada = new Date();
        Date dataDevolucao = new Date();
        Livro livro = new Livro("Java Basics", new Autor("Alan Turing", "Inglês"), "Tecnologia", true);
        Livro novoLivro = new Livro("Java Advanced", new Autor("Alan Turing", "Inglês"), "Tecnologia", true);
        Usuario usuario = new Usuario("Gabriel", 21);
        Emprestimo emprestimo = new Emprestimo(dataRetirada, dataDevolucao, livro, usuario);
        emprestimo.setLivro(novoLivro);
        assertEquals(novoLivro, emprestimo.getLivro());
    }

    @Test
    public void testGetUsuario(){
        Date dataRetirada = new Date();
        Date dataDevolucao = new Date();
        Livro livro = new Livro("Java Basics", new Autor("Alan Turing", "Inglês"), "Tecnologia", true);
        Usuario usuario = new Usuario("Gabriel", 21);
        Emprestimo emprestimo = new Emprestimo(dataRetirada, dataDevolucao, livro, usuario);
        assertEquals(usuario, emprestimo.getUsuario());
    }

    @Test
    public void testSetUsuario(){
        Date dataRetirada = new Date();
        Date dataDevolucao = new Date();
        Livro livro = new Livro("Java Basics", new Autor("Alan Turing", "Inglês"), "Tecnologia", true);
        Usuario usuario = new Usuario("Gabriel", 21);
        Usuario novoUsuario = new Usuario("Fabio", 25);
        Emprestimo emprestimo = new Emprestimo(dataRetirada, dataDevolucao, livro, usuario);
        emprestimo.setUsuario(novoUsuario);
        assertEquals(novoUsuario, emprestimo.getUsuario());
    }
}
