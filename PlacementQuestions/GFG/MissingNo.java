package com.Prabal.PlacementQuestions.GFG;
/* https://practice.geeksforgeeks.org/problems/missing-number-in-array1416/1?page=1&curated[]=2&sortBy=submissions */
public class MissingNo {
    public static void main(String[] args) {

    }
    int MissingNumber(int array[], int n) {
        // Your Code Here
        int totalSum = n*(n+1)/2;

        int sum = 0;

        for(int i=0;i<array.length;i++){
            sum+=array[i];
        }

        int ans = totalSum - sum;
        return ans;
    }
}
