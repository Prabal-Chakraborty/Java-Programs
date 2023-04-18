package com.Prabal.Basics.Bits;

public class Bitsss {
    public static void main(String[] args) {
        int n = 7;
        int position = 8;
        // This portion will generate the entire binary representation of that number
/* ****************************************************************************************************************************** */

       for (int i = position; i >=1; i--) {
            System.out.print(ithBitFinder(n,position) + " ");
            position --;

        }
/* ****************************************************************************************************************************** */

        // This Portion is to find the i th position of a particular bit
       /* int ans = ithBitFinder(n,position);
        System.out.println(ans);
        */

    }

     static int ithBitFinder(int n, int position)
     {
        return ((n & (1 << (position-1))) >> (position-1));
     }
}
