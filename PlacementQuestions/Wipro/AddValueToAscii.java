package com.Prabal.PlacementQuestions.Wipro;
/* https://youtu.be/oyktZweKNSI */
public class AddValueToAscii {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("as3gAsd");
        String ans = "";
        int key = 3;
        int len = str.length();
        for (int i = 0; i <len ; i++) {
            char ch = str.charAt(i);
            ch+=key;
            ans+=ch;
        }
        System.out.println(ans);
    }
}
