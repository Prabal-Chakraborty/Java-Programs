package com.Prabal.PlacementQuestions.Infosys;

import java.util.Arrays;

public class InfosisQn2 {
    public static void main(String[] args) {
        int [] arr = {11,22,47,80,33,12};
        int ans [] = new int [arr.length];
        for (int i = 0; i < arr.length ; i++) {
            if(arr[i] % 2 != 0 && i%2!=0)
            {
                ans[i] = arr[i];
                continue;  // Wrong Logic ....Ch
                // eck Later
            }
            else
                ans[i] = arr[i];
        }
        System.out.println(Arrays.toString(ans));
    }
}
