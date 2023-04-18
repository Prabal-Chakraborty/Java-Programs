package com.Prabal.Basics.String;

import java.util.*;
public class StringMethods {
    public static void main(String[] args) {
        String str  =  "Prabal";
        System.out.println(Arrays.toString(str.toCharArray()));

        System.out.println(str.substring(0,3)); // basically this means from index 0 upto before index 3 means 0 to 2

        System.out.println(str.length());

        System.out.println(str.toLowerCase());

        System.out.println(str.toUpperCase());

        System.out.println(str.charAt(5));

        System.out.println(str.substring(1)); // its taking the string after 1

        System.out.println(str.contains("r")); // this should give me true
        System.out.println(str.contains("o")); // this should give me false cuz "o" isn't present in Prabal string

        String str2 = "Probal";
        System.out.println(str.compareTo(str2));

        System.out.println(str.compareToIgnoreCase(str2));

        System.out.println(str.concat(str2)); // This method concatenates two Stings

        System.out.println(str.indexOf("a")); // gives us the index of a specific char in the string
        // and if the char isn't present in the string in will give us -1


        System.out.println(str.replace("a","o"));


    }
}
