package com.Prabal.Recursions.Basics;

public class SimpleRecursion {
    public static void main(String[] args) {
        print(1);
    }

   static void print(int n) {
        // Base Condition
        if(n==7){
            System.out.println(7);
            return;
        }
        // Body
       System.out.println(n);
        // Recursive Call
        print(n+1);
    }
}
