package com.Prabal.PlacementQuestions.Accenture;

public class ChocolateDistribution {

    public static int chocolateDistributionWays(int n) {
        int ways = 0;
        for (int b = 1; b <= n / 2; b++) {
            for (int a = n / 2; a <= n; a++) {
                if (a + b == n && a > b) {
                    ways++;
                }
            }
        }
        return ways;
    }

    public static void main(String[] args) {
        int result = chocolateDistributionWays(4);
        System.out.println(result);
    }
}

