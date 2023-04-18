package com.Prabal.Basics.Bits;

import java.util.Scanner;
// Apna College Lecture 15
public class BItManipulation {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.print("Enter your number:- ");
        int n = ip.nextInt();
        System.out.print("Enter the positon:- ");
        int pos = ip.nextInt();
        int bitMask = 1 << pos;
       // getBit(bitMask,n);

        setBit(bitMask,n);
        
        // clearBit(bitMask,n);
        
        // updateBit(bitMask,n);

    }

     static void updateBit(int bitMask, int n) {
         Scanner ip = new Scanner(System.in);
         System.out.print("Enter the operator(1 or 0):- ");
        int operator = ip.nextInt();
        if(operator==1){
            setBit(bitMask, n);
        }
        else {
            clearBit(bitMask,n);
        }
    }

     static void clearBit(int bitMask, int n) {
        int newBitMask = ~(bitMask);
        int newNumber = newBitMask & n;
         System.out.println("After clearing the bit");
        System.out.println(newNumber);
    }

    static void getBit(int bitMask, int n) {
        if((bitMask & n)==0){
            System.out.println("Bit is 0");
        }
        else
            System.out.println("Bit is 1");
    }
    static void setBit (int bitMask, int n){
        int newNUmber = bitMask | n;
        System.out.println("After setting the bit");
        System.out.println(newNUmber);
    }
}
