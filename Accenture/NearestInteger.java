package com.Prabal.PlacementQuestions.Accenture;

import java.util.Scanner;
/* https://youtu.be/KyCOQmF8Imo */
public class NearestInteger {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int num = ip.nextInt();
        int m = ip.nextInt();
        int ans = nearestInteger(num,m);
        int ans2 = NI(num,m);
        System.out.println(ans);
        System.out.println(ans2);
    }

     static int nearestInteger(int num, int m) {
        int rem = num % m;
        if (rem < (m+1)/2){
            return num - rem;
        }else {
            return num + (m-rem);
        }
    }
    static int NI(int num, int m){
        int ans  = 0;
        for (int i = 1; i <=num ; i++) {
            if (i % m == 0 && i <= num){
                ans = i;
            }
        }
        return ans;
    }
}
