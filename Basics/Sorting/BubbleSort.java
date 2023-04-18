package com.Prabal.Basics.Sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int [] arr = {6,5,4,1,3};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubbleSort(int[] arr) {
        boolean swapped = false;
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 1; j < arr.length-i ; j++) {
                if(arr[j]<arr[j-1]){
                    int temp =0;
                    temp = arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                    swapped = true;
                }
                if(swapped==false)
                    break;
            }
        }
    }
}
