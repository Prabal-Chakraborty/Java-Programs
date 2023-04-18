package com.Prabal.Data_Structures_And_Algorithms.Arrays;

public class TwoPairSum {
    public static void main(String[] args) {
        int[] arr = {4,6,3,5,2,8,1};
        int sum = 7;

       int answer =  twoPairSum(arr,sum);
        System.out.println(answer);
    }

    public static int twoPairSum(int[] arr,int sum) {

        int ans = 0;

        for (int i = 0; i <arr.length ; i++) {

            for (int j = i+1; j <arr.length ; j++) {

                for (int k = j+1; k < arr.length ; k++) {
                    if(arr[i] + arr[j] + arr[k] == sum){
                        ans++;
                    }
                }

            }

        }

        return ans;
    }
}
