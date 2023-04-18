package com.Prabal.Recursions.Basics;

public class NoOfSteps {
    public static void main(String[] args)
    {
        int n = 14;
        System.out.println(steps(n));
    }
    static int steps(int n){
        return helper(n,0);
    }
    static int helper(int n, int steps){
        if(n==0){
            return steps;
        }
        if(n % 2==0){
            return helper(n/2,steps+1);
        }
        return helper(n-1,steps+1);
    }
}
