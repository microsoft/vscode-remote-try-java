package com.mycompany.app;
import org.junit.Test;

import com.mycompany.app.Model.*;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class AutorTest {
    @Test
    public void testGetNacionalidade(){
        Autor autor = new Autor("Jess", "Brasileira");
        assertEquals("Brasileira", autor.getNacionalidade());
    }

    @Test
    public void testSetNacionalidade(){
        Autor autor = new Autor("Jess", "Brasileira");
        autor.setNacionalidade("Argentina");
        assertEquals("Argentina", autor.getNacionalidade());
    }

    @Test
    public void testGetObrasPublicadas(){
        Autor autor = new Autor("Jess", "Brasileira");
        Livro[] livros = new Livro[2];
        livros[0] = new Livro("Java avançado", autor, "Tecnologia", false);
        livros[1] = new Livro("Java iniciante", autor, "Tecnologia", true);
        autor.setObrasPublicadas(livros);

        assertArrayEquals(livros, autor.getObrasPublicadas());
    }

    @Test
    public void testSetObrasPublicadas(){
        Autor autor = new Autor("Jess", "Brasileira");
        Livro[] livros = new Livro[2];
        livros[0] = new Livro("Java avançado", autor, "Tecnologia", false);
        livros[1] = new Livro("Java iniciante", autor, "Tecnologia", true);
        autor.setObrasPublicadas(livros);

        assertArrayEquals(livros, autor.getObrasPublicadas());
    }
}
