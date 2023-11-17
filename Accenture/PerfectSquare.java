package com.Prabal.PlacementQuestions.Accenture;

public class PerfectSquare {
    public static void main(String[] args) {
        int [] arr = {64,16,36,121,49,100};
        System.out.println(PsCnt(arr));
    }
    public static int PsCnt(int [] arr){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (Math.ceil(Math.sqrt(arr[i])) == Math.floor(Math.sqrt(arr[i]))){
                count ++;
            }
        }
        return count;
    }
}
