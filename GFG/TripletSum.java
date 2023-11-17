package com.Prabal.PlacementQuestions.GFG;
import java.util.*;
// https://practice.geeksforgeeks.org/problems/triplet-sum-in-array-1587115621/1?page=2&category[]=Arrays&curated[]=7&sortBy=submissions
public class TripletSum {
    public static boolean find3Numbers(int A[], int n, int X) {

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
