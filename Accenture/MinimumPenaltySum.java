package com.Prabal.PlacementQuestions.Accenture;

import java.util.Arrays;

public class MinimumPenaltySum {
    public static void main(String[] args) {

        int [] a = {2,3,4};
        System.out.println(minPenSum(a));

    }
    public static int minPenSum(int []a){
        int sum = 0;
        Arrays.sort(a);
        int n = a.length;
        for (int i = 1; i <n ; i++) {
            sum += Math.abs(a[i] - a[i-1]);
        }
        return sum;
    }
}
