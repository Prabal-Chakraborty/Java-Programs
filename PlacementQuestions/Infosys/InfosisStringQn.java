package com.Prabal.PlacementQuestions.Infosys;

import java.util.Scanner;

public class InfosisStringQn {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.print("Enter the first string:- ");
        String s1 = ip.next();
        System.out.print("Enter the second string:- ");
        String s2 = ip.next();
        int ans = s1.compareTo(s2);

        if(ans>=0){
            System.out.println("YES");
        }
        else
            System.out.println("NO");
    }
}
