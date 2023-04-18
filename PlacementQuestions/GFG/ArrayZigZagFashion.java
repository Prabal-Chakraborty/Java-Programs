package com.Prabal.PlacementQuestions.GFG;

import java.util.Scanner;
//https://practice.geeksforgeeks.org/problems/convert-array-into-zig-zag-fashion1638/1?page=1&curated[]=1&sortBy=submissions

//https://www.youtube.com/watch?v=ceMTbyQKTCc

public class ArrayZigZagFashion {

    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int n = ip.nextInt();
        int [] a = new int[n];
        for (int i = 0; i <n ; i++) {
            a[i] = ip.nextInt();
        }


    }
    public static void zigZag(int a[], int n){
        // Code your solution here.
        for(int i=0;i<n-1;i++){
            if(i%2 == 0 && a[i] > a[i+1]){
                int tmp = a[i];
                a[i] = a[i+1];
                a[i+1] = tmp;
            }else if(i%2==1 && a[i] < a[i+1]){
                int tmp = a[i];
                a[i] = a[i+1];
                a[i+1] = tmp;
            }
        }
        return;
    }
}
