package com.Prabal.PlacementQuestions.Accenture;

import java.util.Scanner;

public class StandardDeviation {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        double stdDeviation = calculateStandardDeviation(arr, n);
        System.out.printf("%.2f", stdDeviation);

        scanner.close();
    }
    public static double calculateStandardDeviation(int[] arr, int n) {
        double sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        double avg = sum / n;

        double sumOfSqDiff = 0;
        for (int i = 0; i < n; i++) {
            sumOfSqDiff += Math.pow((arr[i] - avg), 2);
        }

        double variance = sumOfSqDiff / n;
        double stdDev = Math.sqrt(variance);

        return stdDev;
    }
}
