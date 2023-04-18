package com.Prabal.Data_Structures_And_Algorithms.Arrays;

import java.util.Arrays;

public class KthLargestElement {
    public static void main(String[] args) {
        int [] arr = {1,4,5,6,8,9,11};
        int k = 4;
        System.out.println(kThElement(arr,k));
    }
    static int kThElement(int [] arr, int k){
        Arrays.sort(arr);
        int length = arr.length;
        return arr[length - k];
    }
}
