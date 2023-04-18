package com.Prabal.PlacementQuestions.Wipro;

public class LastWordLength {
    public static void main(String[] args) {
        String str = "i am a good student";
        int count = 0;
        int len = str.length() -1;
        for (int i = len ; i > 0 ; i--) {
            if (str.charAt(i) == ' '){
                break;
            }else {
                count++;
            }
        }
        System.out.println(count);
    }
}
