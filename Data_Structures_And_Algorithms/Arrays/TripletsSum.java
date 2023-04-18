package com.Prabal.Data_Structures_And_Algorithms.Arrays;
import java.util.*;
public class TripletsSum {
    public static void main(String[] args) {

    }
    public static int triplet(int[] arr, int sum){

        int ans = 0;

        for (int i = 0; i <arr.length ; i++) {

            for (int j = i+1; j <arr.length ; j++) {

                if(arr[i] + arr[j] == sum){
                    ans++;
                }

            }

        }

        return ans;
    }

    public static boolean triplet(int []A, int n, int X){
        if(n<3){
            return false;
        }
        Arrays.sort(A);
        for(int i=0;i<n;i++){

            int second = i+1;
            int third = n-1;

            while(second < third){

                if(A[i] + A[second] + A[third] == X){
                    return true;
                }else if(A[i] + A[second] + A[third] < X){
                    second ++;
                }else{
                    third --;
                }
            }
        }

        return false;
    }
}
