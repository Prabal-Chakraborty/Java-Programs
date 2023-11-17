package com.Prabal.PlacementQuestions.Accenture;

import java.util.Scanner;

public class SubDivEqual {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int n = ip.nextInt();

        System.out.println(minOp(n));
    }
    static int minOp(int n){
        int operations = 0;

        while (n>1){

            boolean isPrime = true;
            for (int i = 2; i <(n/2+1) ; i++) {
                if (n%i==0){
                    isPrime = false;
                    break;
                }
            }
            if (isPrime){
                n--;
                operations++;
            }else {
                int greatest_factor=1;

                for (int i = 2; i <(n/2+1) ; i++) {
                    if (n%i==0){
                        greatest_factor = i;
                    }
                }
                n=n/greatest_factor;
                operations++;

                while (n!=1){
                    n--;
                    operations++;
                }
            }
        }
        return operations;
    }
}
