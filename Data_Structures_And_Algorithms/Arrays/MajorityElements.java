package com.Prabal.Data_Structures_And_Algorithms.Arrays;

import java.util.Arrays;

public class MajorityElements {
    public static void main(String[] args) {
        int[] arr = {1, 4, 4, 5, 4};
        System.out.println(majority_BruteForce(arr));

    }

    static int majority_BruteForce(int[] arr) {
        int maxTimes = 1;
        //Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    maxTimes++;
                }
            }
            if (maxTimes > arr.length / 2)
                return arr[i];
        }
        return -1;
    }
}
