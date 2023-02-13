package com.dsa.app;

public class AnioBisiesto{
    public static boolean esBisiesto(int anio){
        return (anio % 4 == 0 && anio % 400 == 0);
    }
}