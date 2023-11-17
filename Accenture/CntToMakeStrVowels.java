package com.Prabal.PlacementQuestions.Accenture;

import java.util.Scanner;

public class CntToMakeStrVowels {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        String s = ip.next();
        System.out.println(makeVwls(s));
    }
    public static int makeVwls(String s){

        String vow = "aeiou";
        int cost = 0;

        for (int i = 0; i < s.length(); i++) {
            int minCharCost = Integer.MAX_VALUE; // Initialize with a large value.

            for (int j = 0; j < 5; j++) {
                int charCost = Math.abs(s.charAt(i) - vow.charAt(j)); // Corrected the cost calculation.
                if (charCost < minCharCost) {
                    minCharCost = charCost;
                }
            }

            cost += minCharCost;
        }

        return cost;

//        int consonents = 0;
//        int vowels = 0;
//
//        for (int i = 0; i <s.length() ; i++) {
//            if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i)=='u'){
//                vowels++;
//            }else {
//                consonents++;
//            }
//        }
//        return consonents ;
    }
}
