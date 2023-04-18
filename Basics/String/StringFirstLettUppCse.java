package com.Prabal.Basics.String;
import java.util.*;
public class StringFirstLettUppCse {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        String str1 = ip.next();
        String str2 = ip.next();
        // First evaluate the value of the concatenated length
        int sl = str1.length() + str2.length();
        System.out.println(sl);
        // Now determine which string is lexicographically first
        int A = str1.charAt(0);
        int B = str2.charAt(0);
        if(A<=B){
            System.out.println("No");
        }
        else
            System.out.println("Yes");
        // Now we have to convert the first letter of each string into capital
        String New = str1.substring(0,1).toUpperCase()+str1.substring(1,str1.length()) + " " + str2.substring(0,1).toUpperCase()+str2.substring(1,str2.length());
        System.out.println(New);
    }
}
