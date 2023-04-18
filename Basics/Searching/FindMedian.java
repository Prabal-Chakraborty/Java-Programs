package com.Prabal.Basics.Searching;
import java.util.*;
public class FindMedian {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.print("Enter the size of the array:- ");
        int n = ip.nextInt();
        int [] arr = new int [n];
        System.out.print("Enter the elements:- ");
        for (int i = 0; i < arr.length ; i++) {
            arr[i] = ip.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("After sorting ");
        System.out.println(Arrays.toString(arr));
        System.out.print("The index of median is:- ");
        System.out.println(theMedian(arr));
    }

     static int theMedian(int[] arr) {

        int start = 0;
        int end = arr.length-1;
        int median = 0;
        while (start<=end){
            int mid = start + (end-start)/2;
            median = mid;
            start++;
            end--;
        }
        return median;
    }
}
