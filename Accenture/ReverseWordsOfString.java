package com.Prabal.PlacementQuestions.Accenture;

import java.util.Stack;

public class ReverseWordsOfString {
    public static void main(String[] args) {
        System.out.println(reverse("I love coding"));
    }

    public static String reverse(String s){
        String [] words = s.split(" +");
        StringBuilder sb = new StringBuilder();

        for (int i = words.length-1;i >= 0 ; i--) {
            sb.append(words[i]);
            sb.append(" ");
        }
        return sb.toString().trim();
    }
}
