package com.Prabal.Basics.Searching;
import java.util.*;
public class BinarySearch {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int [] arr = {5,6,7,9,1};
        int target = 9;
        int ans = binarySearch(arr,target);
        System.out.print("the element found at:- " + ans);

    }
    static int linnaerSearch(int[]arr,int target){
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]==target){
                return i;
            }

        }
        return -1;
    }
    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;

        while (start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
            if(target < arr[mid]){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }

       return -1;
    }
}
