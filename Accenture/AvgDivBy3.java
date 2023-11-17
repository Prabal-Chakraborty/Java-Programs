package com.Prabal.PlacementQuestions.Accenture;

public class AvgDivBy3 {
    public static void main(String[] args) {

        int[] a = {16,24,32,48,55,64,72};
        int n = a.length;
        System.out.println(calAv(a,n));
    }
    public static int calAv(int[] nums, int n) {
        int totalSum = 0;
        int AvgCount = 0;

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (num % 3 == 0 && num % 2 == 0) {
                totalSum += num;
                AvgCount++;
            }
        }
        if (AvgCount == 0) {
            return 0; // If no number satisfies the condition, return 0 to avoid division by zero
        }
        return totalSum / AvgCount; // Returning the integer division of totalSum by AvgCount
    }
}
