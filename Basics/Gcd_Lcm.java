package com.Prabal.Basics;

public class Gcd_Lcm {
    public static void main(String[] args) {
        System.out.println(lcm(9,18));
    }
    static int gcd(int a, int b){ // also called HCF
        if(a==0){
            return b;
        }
        return gcd(b%a,a);
    }
    static int lcm(int a , int b){
        return a*b / gcd(a,b);
    }
}
