package com.dsa.app;

/**
 * NumeroFuerte
 */
public class NumeroFuerte {

    public static boolean esNumeroFuerte(int n){
        int original = n, sum = 0;
        while(n >= 1){
            sum += Factorial.getFactorial(n%10);
            n /= 10;
        }
        return original == sum;
    }
}