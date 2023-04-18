package com.Prabal.PlacementQuestions.TCS;

import java.math.BigInteger;
import java.util.Scanner;

public class SumOfHugeNo {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.print("Enter the first no ");
        String s = ip.next();
        BigInteger no1 = new BigInteger(s);
        System.out.print("Enter the second no ");
        String s2 = ip.next();
        BigInteger no2 = new BigInteger(s2);

        System.out.println(no1.add(no2));


    }
}
