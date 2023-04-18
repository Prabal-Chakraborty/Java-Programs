package com.Prabal.PlacementQuestions.GFG;

import java.util.Arrays;

public class CheckTwoArrAreEqualOrNot {
    public static void main(String[] args) {

    }
    public static boolean check(long A[],long B[],int N)
    {
        //Your code here
        Arrays.sort(A);
        Arrays.sort(B);

        //int j = 0;
        for(int i = 0; i<A.length; i++){
            if(A[i] != B[i]){
                return false;
            }
        }
        return true;
    }
}
