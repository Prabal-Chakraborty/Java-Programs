package com.Prabal.PlacementQuestions.Accenture;

import java.util.HashSet;

public class HappyNumber {
    public static void main(String[] args) {

        System.out.println(isHappy(19));
    }
    public static boolean isHappy(int n){

        HashSet<Integer> usedIntegers = new HashSet<>();
        while (true) {

            // Find the sum of squares
            int sum = 0;
            while (n != 0) {
                sum += Math.pow(n % 10, 2.0);
                n = n / 10;
            }
            // If sum is 1, return true
            if (sum == 1) return true;

            // Else, the new number is the current sum
            n = sum;

            // Check if we have already encountered
            // that number
            if (usedIntegers.contains(n))
                return false;
            usedIntegers.add(n);
        }
    }
}
