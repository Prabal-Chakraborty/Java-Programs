package com.Prabal.Basics;
import java.util.*;
public class FindUnidueInStrig {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.print("Enter the input string:- ");
        String str = ip.next();
        int AnsINdex = findUnique(str);
        if(AnsINdex>=0){
            System.out.printf("Unique element found at index %d",AnsINdex);
        }
        else {
            System.out.println("There is no unique element");
        }

    }

     static int findUnique(String str) {
         for (int i = 0; i <str.length() ; i++) {
             char ch = str.charAt(i);
             if(str.indexOf(ch)==str.lastIndexOf(ch))
                 return i;
         }
         return -1;
    }
}
