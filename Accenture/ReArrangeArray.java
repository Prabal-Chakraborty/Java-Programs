package com.Prabal.PlacementQuestions.Accenture;
import java.util.*;
public class ReArrangeArray {
    public static void main(String[] args) {
        int[] inputArray = {5, 2, 3, 4, 6, 5, -2};
        System.out.println("Input Array: " + Arrays.toString(inputArray));

        rearrangeArray(inputArray);

        System.out.println("Output Array: " + Arrays.toString(inputArray));
    }
    public static void rearrangeArray(int[] arr) {
        Arrays.sort(arr); // Sort the array in ascending order

        int n = arr.length;
        int[] originalArr = Arrays.copyOf(arr, n); // Create a copy of the original array

        int left = 0, right = n - 1;

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                arr[i] = originalArr[left];
                left++;
            } else {
                arr[i] = originalArr[right];
                right--;
            }
        }
    }
}
