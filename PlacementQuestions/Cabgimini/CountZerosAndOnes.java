package com.Prabal.PlacementQuestions.Cabgimini;

import java.util.ArrayList;
//  https://youtu.be/odjKeH7X6CM
public class CountZerosAndOnes {
    public static void main(String[] args) {
        int[] arr = {0,1,1,1,1,0,1,0,1,0,1};

        int ZeroCount = 0;
        int OneCount = 0;

        for (int i = 0; i < arr.length ; i++) {

            if (arr[i] == 0){
                ZeroCount++;
            }
            else{
                OneCount++;
            }
        }
        System.out.println("Number of 1's are "+OneCount);
        System.out.println("Number of 0's are "+ZeroCount);



    }
}
