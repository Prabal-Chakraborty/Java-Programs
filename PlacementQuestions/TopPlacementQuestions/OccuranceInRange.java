package com.Prabal.PlacementQuestions.TopPlacementQuestions;

import java.util.Scanner;

public class OccuranceInRange {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.print("Enter the Lower Value:- ");
        int lower = ip.nextInt();
        System.out.print("Enter the Upper Value:- ");
        int upper = ip.nextInt();
        System.out.print("Enter The Digit:- ");
        int digit = ip.nextInt();

        System.out.println(occurance(lower,upper,digit));
    }

    public static int occurance(int lower, int upper, int digit) {
        int count = 0;
        for (int i = lower; i <=upper ; i++) {
            int temp = i;
            while (temp>0){
                if (temp % 10 == digit){
                    count++;
                }
                temp/=10;
            }
        }
        return count;
    }
}
