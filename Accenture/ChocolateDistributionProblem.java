package com.Prabal.PlacementQuestions.Accenture;
import java.util.Collections;
import java.util.ArrayList;
public class ChocolateDistributionProblem {
    
    public long findMinDiff (ArrayList<Integer> a, int n, int m)
    {
        // your code here
        Collections.sort(a);
        if(n==0 || m==0){
            return 0;
        }
        if(n<m){
            return -1;
        }
        int min_diff = Integer.MAX_VALUE;
        for(int i=0; i+m-1<n; i++){
            int diff = a.get(i+m-1) - a.get(i);

            if(diff < min_diff){
                min_diff = diff;
            }
        }
        return min_diff;
    }

}
