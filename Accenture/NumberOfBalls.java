package com.Prabal.PlacementQuestions.Accenture;

public class NumberOfBalls {
    public static void main(String[] args) {
        int[] a = {1,2,7,13};
        System.out.println(noOfBalls(a));
    }
    public static int noOfBalls(int[] a){
        if (a == null){
            return 0;
        }
        int NoOfBall = 0;
        for (int i = 0; i <a.length ; i++) {

            NoOfBall+= Math.pow((i+1),2) - a[i];

        }
        return NoOfBall;
    }
}
