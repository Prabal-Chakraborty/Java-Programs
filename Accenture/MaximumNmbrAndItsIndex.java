package com.Prabal.PlacementQuestions.Accenture;

public class MaximumNmbrAndItsIndex {
    public static void main(String[] args) {
        int [] a = {23,45,82,71};
        maxEleInd(a);
    }
    static void maxEleInd(int[] a){
        int max = Integer.MIN_VALUE;
        int ind = 0;
        for (int i = 0; i <a.length ; i++) {
            if (a[i] > max){
                max = a[i];
                ind = i;
            }
        }
        System.out.println(max + " " +ind);
    }
}
