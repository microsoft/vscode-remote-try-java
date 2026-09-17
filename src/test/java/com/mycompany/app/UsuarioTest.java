package com.mycompany.app;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import com.mycompany.app.Model.*;
import java.util.Date;

public class UsuarioTest {
    @Test
    public void testGetIdade(){
        Usuario usuario = new Usuario("Alysson", 25);
        assertEquals(25, usuario.getIdade());
    };

    @Test
    public void testSetIdade(){
        Usuario usuario = new Usuario("Alysson", 25);
        usuario.setIdade(30);
        assertEquals(30, usuario.getIdade());
    };

    @Test
    public void testGetHistoricoEmprestimos(){
        Livro livro = new Livro("Java Basics", new Autor("Alan Turing", "Inglês"), "Tecnologia", true);
        Usuario usuario = new Usuario("Gabriel", 21);
        Emprestimo[] historicoEmprestimos = new Emprestimo[1];
        historicoEmprestimos[0] = new Emprestimo(new Date(), new Date(), livro, usuario);
        usuario.setHistoricoEmprestimos(historicoEmprestimos);

        assertArrayEquals(historicoEmprestimos, usuario.getHistoricoEmprestimos());
    }

    @Test
    public void testSetHistoricoEmprestimos(){
        Livro livro = new Livro("Java Basics", new Autor("Alan Turing", "Inglês"), "Tecnologia", true);
        Usuario usuario = new Usuario("Gabriel", 21);
        Emprestimo[] historicoEmprestimos = new Emprestimo[1];
        historicoEmprestimos[0] = new Emprestimo(new Date(), new Date(), livro, usuario);
        usuario.setHistoricoEmprestimos(historicoEmprestimos);

        assertArrayEquals(historicoEmprestimos, usuario.getHistoricoEmprestimos());
    }

}
