package com.Prabal.PlacementQuestions.Accenture;

import java.util.HashSet;

public class AlmostLucky {
    static HashSet<Character> luckyDigits = new HashSet<>();

    static {
        luckyDigits.add('4');
        luckyDigits.add('7');
    }

    // static boolean isLuckyDigit(char digit) {
    //     return luckyDigits.contains(digit);
    // }

    static boolean isLuckyNumber(int num) {
        while (num > 0) {
            int digit = num % 10;
            if (digit != 4 && digit != 7) {
                return false;
            }
            num /= 10;
        }
        return true;
    }

    static boolean isAlmostLucky(int number) {
        for (int i = 1; i <= number; i++) {
            if (number % i == 0 && isLuckyNumber(i)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Enter a number: ");
        int N = scanner.nextInt();

        if (isAlmostLucky(N)) {
            System.out.println("Almost");
        } else {
            System.out.println("Not Almost");
        }
    }
}
