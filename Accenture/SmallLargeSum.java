package com.Prabal.PlacementQuestions.Accenture;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SmallLargeSum {
    public static void main(String[] args) {
        int[] arr = {3,2,1,7,5,4};
        System.out.println(Sum(arr));
    }
    public static int Sum(int []a){
        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();
        int n = a.length;
        if (n<=3){
            return 0;
        }
        for (int i = 0; i <n ; i++) {
            if(i%2 == 0){
                even.add(a[i]);
            }else {
                odd.add(a[i]);
            }
        }

        // Sort in descending order using Collections.reverseOrder()
        Collections.sort(even, Collections.reverseOrder());

        Collections.sort(odd, Collections.reverseOrder());


        return even.get(1) + odd.get(1);
    }
}
