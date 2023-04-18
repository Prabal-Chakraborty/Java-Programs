package com.Prabal.Recursions.Basics;

import org.jetbrains.annotations.Contract;

public class IsSorted {
    public static void main(String[] args) {
        int arr [] = {-1,1,0};
        if(isSorted(arr,0)){
            System.out.println("Array is Sorted !!!!!!");
        }
        else {
            System.out.println("Array is not sorted ");
        }
    }

    @Contract(pure = true)
    private static boolean isSorted(int[] arr, int index) {
        if(index == arr.length-1){
            return true;
        }
        return arr[index] < arr[index+1] && isSorted(arr,index+1);
    }
}
