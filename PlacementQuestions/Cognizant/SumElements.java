package com.Prabal.PlacementQuestions.Cognizant;

import java.util.Arrays;
import java.util.Scanner;
//  https://youtu.be/Njg21LjX55U
public class SumElements {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.print("Enter the size of the array :- ");
        int sizeOfArr = ip.nextInt();
        int [] arr = new int[sizeOfArr];
        int sum = 0;
        int [] answer = new int[arr.length];
        System.out.print("Enter the array elements:- ");
        for (int i = 0; i <arr.length ; i++) {
            arr[i] = ip.nextInt();
            sum+=arr[i];
        }
        for (int i = 0; i <arr.length ; i++) {
            answer[i] = arr[i] + sum;
        }
        System.out.println(Arrays.toString(answer));
    }
}
