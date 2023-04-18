package com.Prabal.Recursions.Basics;

public class Facttorial {
    public static void main(String[] args) {
        System.out.println(fact(15));
    }
    static long fact(long n){
        if(n<=1){
            return 1;
        }
        return n * fact(n-1);
    }
}
