package com.Prabal.Basics;

public class Prime {
    public static void main(String[] args) {
        int n = 100;
        for (int i = 1; i <=n ; i++) {
            System.out.println(i + " is prime ???? :->> " + isprime(i));

        }
    }
    static boolean isprime(int n){
        if(n<=1){
            return false;
        }
        int count = 2;
        int no = (int) Math.sqrt(n);
        while (count <= no){
            if(n % count == 0){
                return false;
            }
            count ++;
        }
        return true;
    }
}
