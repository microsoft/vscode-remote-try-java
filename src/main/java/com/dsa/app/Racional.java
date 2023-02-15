package com.dsa.app;

public class Racional {
    int num;
    int den;
    public Racional(){
        this.num = 1;
        this.den = 1;
    }
    public  Racional(int num, int den){
        this.num = num;
        this.den = den;
    }

    public Racional suma(Racional a){
        return new Racional(this.num*a.den + this.den*a.num, this.den*a.den);
    }
    
    public static Racional resta(Racional a, Racional b){
        return new Racional(a.num*b.den - a.den * b.num, a.den * b.den);
    }

    public String getString(){
        String string = new String(this.num + "/" + this.den);
        return string;
    }
}
