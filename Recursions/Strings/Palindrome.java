package com.Prabal.Recursions.Strings;

public class Palindrome {
    public static void main(String[] args) {
        String str = "abbc";
        if (isPalin(str,0,str.length() - 1)){
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not Palindrome");
        }
    }
    static boolean isPalin(String str, int s, int e){
        if (s>=e){
            return  true;
        }
        if (str.charAt(s) != str.charAt(e)){
            return  false;
        }
        return  isPalin(str, s+1, e-1);
    }
}
