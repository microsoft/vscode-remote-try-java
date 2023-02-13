package com.dsa.app;

public class StarLadder {
    public static void buildLadder(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i; j++) {
                System.out.print("*");   
            }
            System.out.println();
        }

        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n-i; j++) {
                System.out.print(" ");   
            }
            for (int j = 0; j < i+1; j++) {
                System.out.print("*");   
            }
            System.out.println();
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i+1; j++) {
                System.out.print("*");   
            }
            System.out.println();
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");   
            }
            for (int j = 0; j < n-i; j++) {
                System.out.print("*");   
            }
            System.out.println();
        }
    }
}
