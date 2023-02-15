/*----------------------------------------------------------------------------------------
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See LICENSE in the project root for license information.
 *---------------------------------------------------------------------------------------*/

package com.dsa.app;

public class App {
    public static void main(String[] args) {
        // System.out.println("Hello Remote World!");
        // System.out.println(Factorial.getFactorial(5));
        // System.out.println(NumeroFuerte.esNumeroFuerte(145));
        // System.out.println(Primo.esPrimo(4));
        // StarLadder.buildLadder(5);
        Racional a = new Racional(7,9);
        Racional suma = a.suma(new Racional(7,8));
        System.out.println(suma.getString());
        // a.getString();
        
    }
}