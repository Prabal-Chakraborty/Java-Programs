package com.Prabal.PlacementQuestions.Accenture;
import java.util.Scanner;
public class RearrangeArray2 {
    public static int[] rearrange(int[] arr, int n) {
        if (arr == null) {
            return null;
        }

        int negInd = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] < 0) {
                if (i != negInd) {
                    int temp = arr[i];
                    arr[i] = arr[negInd];
                    arr[negInd] = temp;
                }
                negInd++;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        arr = rearrange(arr, n);

        System.out.println("Array after rearranging:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        scanner.close();
    }
}
