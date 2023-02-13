package com.dsa.app;

public class Primo {
    public static boolean esPrimo(int n){
        int i = 2;
        if(n < i){return false;}
        while(i < n/2+1 ){
            if(n % i == 0)
              return false;
            i++;
        }
        return true;
    }
}