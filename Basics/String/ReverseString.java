package com.Prabal.Basics.String;
import java.util.*;
// ITS A PROGRAM TO REVERSE A STRING USING STRING BUILDER
public class ReverseString {
    public static void main(String[] args) {
        StringBuilder strB = new StringBuilder("NILA CHAKRABORTY");
        for (int i = 0; i <strB.length()/2 ; i++) {
            int frontIndex = i;
            int backIndex = strB.length()- 1- i;

            char forntChar = strB.charAt(frontIndex);
            char backChar = strB.charAt(backIndex);

            strB.setCharAt(frontIndex,backChar);
            strB.setCharAt(backIndex,forntChar);
        }
        System.out.println(strB);
    }
}
