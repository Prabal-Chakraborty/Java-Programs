package com.Prabal.Recursions.Basics;

public class IsPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalin(12121));
    }

    static boolean isPalin(int n)
    {
        return n == rev2(n);

    }

    static int rev2(int n)
    {
        int digits = (int)(Math.log10(n))+1;
        return helper(n,digits);
    }

    static int helper(int n, int digits)
    {
        if((n%10)==n){
            return n;
        }
        int rem = n%10;
        return rem * (int)(Math.pow(10,digits-1))+ helper((n/10),digits-1);
    }
}

