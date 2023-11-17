package com.Prabal.PlacementQuestions.Accenture;

import java.util.Scanner;

public class SumOfDigits {

    public static int sumOfDigits(int num) {
        int sum = 0;
        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }

    public static int diff(int[] arr, int n) {
        int f1 = 0;
        int f2 = 0;

        for (int i = 0; i < n; i++) {
            f1 += sumOfDigits(arr[i]);
            f2 += arr[i];
        }

        int res = (f1 % 10) - (f2 % 10);
        return res;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int result = diff(arr, n);
        System.out.println(result);

        scanner.close();
    }
}
