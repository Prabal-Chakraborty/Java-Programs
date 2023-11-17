package com.Prabal.PlacementQuestions.Accenture;

public class Palindrome {
    public static void main(String[] args) {
        String s = "12324";
        System.out.println(isPalin(s));
    }
    static int isPalin(String s){

        if (s.equals(reverse(s))){
            return 1;
        }
        return 0;
    }
    static String reverse(String s){

        String ans = "";
        for (int i = s.length()-1; i >=0 ; i--) {
            ans += s.charAt(i);
        }
        return ans;
    }
    static boolean isPalindrome(String s){
        return s.equals(new StringBuilder(s).reverse().toString());
}
