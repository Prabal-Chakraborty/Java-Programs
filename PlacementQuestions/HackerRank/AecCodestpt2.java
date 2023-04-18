package com.Prabal.PlacementQuestions.HackerRank;

import java.util.Arrays;
import java.util.Scanner;

public class AecCodestpt2 {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner ip = new Scanner(System.in);
        int [] a = new int[9];
        for(int i =0 ;i<a.length;i++){
            a[i] = ip.nextInt();
        }
        int k =4;
        System.out.println( findKthLargest(a,k));

    }
    public static int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);

        int length = nums.length;

        return nums[length - k];

    }

    static void RevArr(int []arr, int s, int e) {
        int temp;
        while (s < e) {
            temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;
        }
    }

}
