package com.Prabal.Recursions.Sortings;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int [] arr = {1112,0,-455,701,22};
        System.out.println(Arrays.toString(mergeSort(arr)));
    }
    static int [] mergeSort(int [] arr){
        if(arr.length == 1){
            return arr;
        }
        int mid = arr.length/2;
        int left [] = mergeSort(Arrays.copyOfRange(arr,0,mid));
        int right [] = mergeSort(Arrays.copyOfRange(arr,mid,arr.length));
        return merge(left,right);
    }

     static int[] merge(int[] left, int[] right) {
        int [] mirgedArray = new int [left.length+ right.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < left.length && j < right.length){
            if(left[i] < right[j]){
                mirgedArray[k] = left[i];
                i++;
            }
            else {
                mirgedArray[k] = right[j];
                j++;
            }
            k++;
        }
        // it may be possible that one of the arrays is not complete
         // copy the remaining elements
         while (i < left.length){
             mirgedArray[k] = left[i];
             i++;
             k++;
         }
         while (j < right.length){
             mirgedArray[k] = right[j];
             j++;
             k++;
         }
         return mirgedArray;
    }
}
