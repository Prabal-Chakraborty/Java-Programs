package com.Prabal.PlacementQuestions.Accenture;

public class CountBinarystring {
    public static void main(String[] args) {

        System.out.println(cntBS(3));
    }
    public static int cntBS(int n){
        int zeroEnd = 1;
        int oneEnd = 1;
        int sum = zeroEnd + oneEnd;

        if (n == 1) {
            return sum;
        }

        int i = 2;
        while (i <= n) {

            oneEnd = zeroEnd;
            zeroEnd = sum;
            sum = (zeroEnd + oneEnd);
            i++;
        }

        return sum;
    }
}
