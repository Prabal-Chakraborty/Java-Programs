package com.Prabal.PlacementQuestions.Accenture;

public class MinAppendsToPalindrome {
    public static void main(String[] args) {
        String str = "abcde";
        System.out.println(minAppnsToPalindrome(str));
    }
    public static int minAppnsToPalindrome(String s){
        int count = 0;

        while (!isPalindrome(s)){
            s = s.substring(0,s.length()-1);
            count++;
        }
        return count;
    }
    public static boolean isPalindrome(String s){
        return s.equals(new StringBuilder(s).reverse().toString());
    }
}
