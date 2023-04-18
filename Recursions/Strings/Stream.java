package com.Prabal.Recursions.Strings;
import java.util.*;
public class Stream {
    public static void main(String[] args) {
        String str = "bacapplecad";
//        skip("",str);
        System.out.println(skipAcertainWord(str));
    }
    // This program is to remove a certain character from the input string
    static void skip(String processed , String unprocessed){
        if(unprocessed.isEmpty())
        {
            System.out.println(processed);
            return;
        }
        char ch = unprocessed.charAt(0);
        if(ch=='a'){
            skip(processed,unprocessed.substring(1));
        }
        else {
            skip(ch + processed, unprocessed.substring(1));
        }
    }

    // This program is to remove a certain word from the given input string
    // for example the word is apple
    static String skipAcertainWord(String unprocessed){
        if(unprocessed.isEmpty())
        {
            return "";
        }

        if(unprocessed.startsWith("apple")){

            return skipAcertainWord(unprocessed.substring("apple".length()));
        }
        else {
            return unprocessed.charAt(0) + skipAcertainWord(unprocessed.substring(1));
        }
    }

}
