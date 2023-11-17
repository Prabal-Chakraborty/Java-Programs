package com.Prabal.PlacementQuestions.Accenture;

import java.util.Arrays;
import java.util.Scanner;
/* https://www.youtube.com/watch?v=eQffg2tO0ss */
public class QuesProd {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.print("Enter the size of the array:- ");
        int n = ip.nextInt();
        int [] a = new int[n];
        System.out.print("Enter the array elements:- ");
        for (int i = 0; i <n ; i++) {
            a[i] = ip.nextInt();
        }

        System.out.println(Arrays.toString(prod(a, n)));

    }
    public static int[] prod(int[] a, int n){

        for (int i = 0; i <a.length ; i++) {
            int sumS = 0;
            int SumL = 0;
            for (int j = i+1; j < a.length ; j++) {
                if (a[j] < a[i]){
                    sumS+=a[j];
                }else {
                    SumL+=a[j];
                }
            }
            a[i] = (sumS * SumL);
        }
        return a;
    }
}
