package com.dsa.app;


public class Factorial {
    public static int getFactorial(int n){
        if(n < 1){throw new Error();}
        int i = 1, fact = 1;
        while(i<=n){
            fact *= i;
            i++;
        }
        return fact;
    }
}