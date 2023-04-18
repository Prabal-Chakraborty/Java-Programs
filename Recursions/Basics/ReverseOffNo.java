package com.Prabal.Recursions.Basics;

public class ReverseOffNo {
    public static void main(String[] args) {
        int n = 1234;
       // int ans = rev1(n); // check again something wrong with it
        System.out.println(rev2(123456));
    }
    static void rev1(int n){
        int sum = 0;
        if(n == 0){
            return ;
        }
        int rem = n % 10;
        sum = sum * 10 + rem;
        rev1(n/10);
    }

    static int rev2(int n){
        int digits = (int)(Math.log10(n))+1;
        return helper(n,digits);
    }

     static int helper(int n, int digits) {
        if((n%10)==n){
            return n;
        }
        int rem = n%10;
        return rem * (int)(Math.pow(10,digits-1))+ helper((n/10),digits-1);
    }
}
