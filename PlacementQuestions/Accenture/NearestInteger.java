package com.Prabal.PlacementQuestions.Accenture;

import java.util.Scanner;
/* https://youtu.be/KyCOQmF8Imo */
public class NearestInteger {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int num = ip.nextInt();
        int m = ip.nextInt();
        int ans = nearestInteger(num,m);
        System.out.println(ans);
    }

     static int nearestInteger(int num, int m) {
        int rem = num % m;
        if (rem < (m+1)/2){
            return num - rem;
        }else {
            return num + (m-rem);
        }
    }
}
