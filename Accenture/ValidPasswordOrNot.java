package com.Prabal.PlacementQuestions.Accenture;

import java.util.Scanner;

public class ValidPasswordOrNot {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        String s = ip.next();

        System.out.println(isValidate(s));
    }

    static int isValidate(String s){
        int num = 0;
        int capLett = 0;
        
        if (s.length() < 4){
            return 0;
        }
        if (s.charAt(0) >=48 && s.charAt(0)<=57){
            return 0;
        }

        for (int i = 0; i <s.length() ; i++) {
            if (s.charAt(i) == ' ' || s.charAt(i)=='/'){
                return 0;
            } else if (s.charAt(i) >=65 && s.charAt(i)<=90) {
                capLett = 1;
            } else if (s.charAt(i)>=48 && s.charAt(i)<=57) {
                num = 1;
            }
        }
        return capLett & num;
    }
}
