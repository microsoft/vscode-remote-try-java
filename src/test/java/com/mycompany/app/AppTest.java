package com.mycompany.app;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.*;


public class AppTest
{
    public AppTest() {
    }

    @Test
    public void testApp()
    {
        assertTrue( true );
    }

    @Test
    public void testMore()
    {
        assertTrue( true );
    }

    @Test
    public void testSystemOut()
    {
        PrintStream originalOut = System.out;
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(bos));

        App.main(null);

        assertEquals("Hello Remote World!\n", bos.toString());

        System.setOut(originalOut);
    }
}
