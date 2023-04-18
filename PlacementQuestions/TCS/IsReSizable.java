package com.Prabal.PlacementQuestions.TCS;

import java.util.Scanner;

public class IsReSizable {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.print("Enter the string length:- ");
        int n = ip.nextInt();
        System.out.print("Enter the first string:- ");
        String s1 = ip.next();
        System.out.print("Enter the second string:- ");
        String s2 = ip.next();
        int count_0_s1 = 0;
        int count_1_s1 = 0;
        int count_0_s2 = 0;
        int count_1_s2 = 0;
        // This loop is for s1
        for (int i = 0; i <s1.length() ; i++) {
            if(s1.charAt(i)=='1'){
                count_1_s1 ++;
            }else
                count_0_s1++;
        }
        // this loop is for s2
        for (int i = 0; i <s2.length() ; i++) {
            if(s2.charAt(i) == '0'){
                count_0_s2 ++ ;
            }else
                count_1_s2++;
        }
        // Now check
        if(count_0_s1 == count_0_s2 && count_1_s1 == count_1_s2){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
    }

}
