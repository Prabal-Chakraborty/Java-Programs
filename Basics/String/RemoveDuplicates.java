package com.Prabal.Basics.String;

import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your string:- ");
        String str = sc.next();

        System.out.print("After removing duplicates :- ");
        System.out.println(removeDuplies(str));
    }

    public static String removeDuplies(String str){

        String result ="";
        for (int i = 0; i <str.length() ; i++) {

            if( !result.contains(String.valueOf(str.charAt(i))) ) {
                result += String.valueOf(str.charAt(i));
            }

        }
        return result;
    }
}
