package com.Prabal.PlacementQuestions.Accenture;

import com.sun.deploy.util.SyncAccess;

import java.util.Scanner;

public class BalanceFruits {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int a = ip.nextInt();
        int m = ip.nextInt();
        int rs = ip.nextInt();
        System.out.println(balanceFruits(a,m,rs));
    }
    public static int balanceFruits(int a, int m, int rs){
        if (a>m){
            return rs-(a-m);
        } else if (a<m) {
            return rs+(m-a);
        }

        // if a==m then return rs unchanged
        return rs;
    }
}
