package com.Prabal.PlacementQuestions.LeetCode;

import java.util.Scanner;

public class RemoveDuplicateElements {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.print("enter the size - ");
        int size = ip.nextInt();
        int [] arr = new int[size];
        System.out.print("Enter the elements:- ");
        for (int i = 0; i <size ; i++) {
            arr[i] = ip.nextInt();
        }
        int val = 3;
        System.out.println("the result is --> "+removeDuplicate(arr,val));

    }
    static int removeDuplicate(int[] nums, int val){
        int count = 0;

        for (int i = 0; i < nums.length ; i++) {
            if (nums[i] != val){
                nums[count] = nums[i];
                count++;
            }
        }
        return count;
    }
}
