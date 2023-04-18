package com.Prabal.Basics.Bits;

public class uniqueNo {
    public static void main(String[] args) {
        int [] arr = {2,3,4,1,2,1,3,110,4};
        System.out.println(isUnique(arr));
        // int check = 2 ^ 3 ^ -3 ^ -2 ^ 6 ^ 5 ^ -5;
       // System.out.println(check);
    }

    private static int isUnique(int[] arr) {
        int ans = 0;
        /* for (int i : arr) {
            ans^=i;
        } */
        for (int i = 0; i < arr.length ; i++) {
            ans ^= arr[i];
        }

        return ans;
    }
}
