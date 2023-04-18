package com.Prabal.Recursions.Permutations;

import java.util.ArrayList;

// Google Question
public class PhonePad {
    public static void main(String[] args) {
//        System.out.println(padRet("","12"));
    }
    static ArrayList<String> padRet(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        int digit  = up.charAt(0) - '0';
        ArrayList<String> list = new ArrayList<>();
        for (int i = (digit-1)*3; i < digit*3 ; i++) {
            char ch = (char) ('a'+ i);
            list.addAll(padRet(p + ch, up.substring(1)));

        }
        return list;
    }
}
