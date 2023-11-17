package com.Prabal.PlacementQuestions.GFG;

import java.util.Arrays;

public class SecondLargestElement {
    // Brute Force Approach With the help of sorting O(NlogN) + O(N)
    static int secLg(int[] arr){
        Arrays.sort(arr);
        int n = arr.length;;
        for (int i = n-2; i >=0 ; i--) {
            if (arr[i] != arr[i+1]){
                return arr[i];
            }
        }
        return -1;
    }

    // better Approach Without Sorting O(2N)
    static int seccondlargst(int[]a){

        int Largest = a[0];
        for (int i = 0; i <a.length ; i++) {
            if (a[i] > Largest){
                Largest = a[i];
            }
        }

        int secondLargest = a[0];
        for (int i = 0; i <a.length ; i++) {
            if (a[i] > secondLargest && a[i] != Largest){
                secondLargest = a[i];
            }
        }

        return secondLargest;
    }
}
