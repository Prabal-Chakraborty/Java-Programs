package com.Prabal.PlacementQuestions.Accenture;
import java.math.BigInteger;
import java.util.Scanner;

public class HCForGCD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the two numbers:");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        int hcf = findHCF(num1, num2);
        System.out.println("The HCF of " + num1 + " and " + num2 + " is: " + hcf);

        scanner.close();
    }
    public static int findHCF(int a, int b) {
        while (b > 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
