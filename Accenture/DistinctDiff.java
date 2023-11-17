package com.Prabal.PlacementQuestions.Accenture;

public class DistinctDiff {
    public static void main(String[] args) {
        int a = 5, b = 9, c = 4, d = 4;
        int result = findDifference(a, b, c, d);
        System.out.println("Result: " + result);
    }
    public static int findDifference(int a, int b, int c, int d) {
        int sumOfDistinct = 0;
        int sumOfDuplicates = 0;

        if (a != b && a != c && a != d) {
            sumOfDistinct += a;
        } else {
            sumOfDuplicates += a;
        }

        if (b != a && b != c && b != d) {
            sumOfDistinct += b;
        } else {
            sumOfDuplicates += b;
        }

        if (c != a && c != b && c != d) {
            sumOfDistinct += c;
        } else {
            sumOfDuplicates += c;
        }

        if (d != a && d != b && d != c) {
            sumOfDistinct += d;
        } else {
            sumOfDuplicates += d;
        }

        return sumOfDistinct - (sumOfDuplicates/2); // sumOfDuplicates / 2 because there are two duplicates present & we need to subtract only one that's why /2
    }
}
