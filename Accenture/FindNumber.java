package com.Prabal.PlacementQuestions.Accenture;

import java.util.Scanner;

public class FindNumber {
    static int findNumber(String s) {
        String alp = "ABCDE";
        int num = 0;
        for (int i = 0; i < s.length(); i++) {
            num = num * alp.length();
            num += alp.indexOf(s.charAt(i)) + 1; // Update num in each iteration
        }
        return num;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String st = scanner.nextLine();
        System.out.println(findNumber(st));
    }
}
