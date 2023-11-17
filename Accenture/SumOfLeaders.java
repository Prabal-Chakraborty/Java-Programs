package com.Prabal.PlacementQuestions.Accenture;

public class SumOfLeaders {
    public static void main(String[] args) {
        int[] a = {16,17,4,3,5,2};

        System.out.println(isLeader(a));

    }
    static int isLeader(int[]a){
        int sum = 0;
        int j =0;
        for (int i = 0; i < a.length; i++) {
            for (j =i+1; j < a.length; j++) {
                if (a[i] < a[j]){
                    break;
                }
            }
            if (j == a.length){
                sum+=a[i];
            }
        }
        return sum;
    }
}
