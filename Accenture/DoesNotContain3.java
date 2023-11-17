package com.Prabal.PlacementQuestions.Accenture;

public class DoesNotContain3 {
    public static void main(String[] args) {
        System.out.println(countNumbersWithout3(45));
    }
    public static int countNumbersWithout3(int n) {
        int count = 0;
        for (int num = 1; num <= n; num++) {
            int current = num;
            boolean hasThree = false;

            while (current > 0) {
                int digit = current % 10;
                if (digit == 3) {
                    hasThree = true;
                    break; // No need to continue checking if we found a 3
                }
                current /= 10;
            }

            if (!hasThree) {
                count++;
            }
        }
        return count;
    }

}
