package com.Prabal.PlacementQuestions.LeetCode;
import java.io.*;
import java.util.*;


public class PlusMinus {
    public static void main(String[] args) throws IOException {
        Scanner ip = new Scanner(System.in);
        double n = ip.nextDouble();
        int[] arr = new int[(int) n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = ip.nextInt();
        }

        int PosCount = 0;
        int NegCount = 0;
        int zeroCount = 0;
        //int N = arr.length;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                PosCount++;
            } else if (arr[i] < 0) {
                NegCount++;
            } else {
                zeroCount++;
            }
        }
        float a = (float) (PosCount / n);
        float b = (float) (NegCount / n);
        float c = (float) (zeroCount / n);

        System.out.printf("%.6f",a);
        System.out.println();
        System.out.printf("%.6f",b);
        System.out.println();
        System.out.printf("%.6f",c);

    }
}
