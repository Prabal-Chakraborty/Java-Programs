package com.Prabal.Recursions.Strings;

public class PowerSet {
    public static void main(String[] args) {
        String str = "abc";
        powerSet(str, 0, " ");

    }
    static void powerSet(String str, int i, String current){
        if(i == str.length()){
            System.out.println(current + " ");
            return;
        }
        powerSet(str, i+1, current+str.charAt(i));
        powerSet(str, i+1, current);
    }
}
