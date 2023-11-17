package com.Prabal.PlacementQuestions.Accenture;

import java.util.HashSet;

public class ClassToppers {
    public static void main(String[] args) {

        int n = 5;

        int [] arr = {78,78,50,50,70};
        System.out.println(findTps(n,arr));
    }
    public static int findTps(int n, int[] tps){
        int count=0;
        HashSet<Integer> e = new HashSet();
        for (int i = 0; i < tps.length; i++) {
            if(e.contains(tps[i])){
                count++;
            }
            e.add(tps[i]);
        }
        return count;
    }
}
