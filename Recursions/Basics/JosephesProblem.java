package com.Prabal.Recursions.Basics;

public class JosephesProblem {
    public static void main(String[] args) {
        int n = 5;
        int k = 3;
        System.out.println(josephes(n,k));
    }
    static int josephes(int n, int k){
        if (n == 1){
            return 0;
        }
      return (josephes((n-1),k)+k) % n;
    }
}
