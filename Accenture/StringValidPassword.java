package com.Prabal.PlacementQuestions.Accenture;

import java.util.Scanner;

public class StringValidPassword {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the password: ");
        String password = scanner.nextLine();

        int result = isStrong(password);
        System.out.println("Result: " + result);

        scanner.close();
    }
    public static int isStrong(String password) {
        boolean lengthOk = password.length() > 6 && password.length() <= 22;
        boolean uppercaseOk = false;
        boolean lowercaseOk = false;
        boolean specialCharsOk = false;
        int numericCount = 0;
        boolean consecutiveCharsOk = true;

        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);
            if (Character.isUpperCase(c)) {
                uppercaseOk = true;
            }
            if (Character.isLowerCase(c)) {
                lowercaseOk = true;
            }
            if ("@!#$%^&*".indexOf(c) != -1) {
                specialCharsOk = true;
            }
            if (Character.isDigit(c)) {
                numericCount++;
            }
        }

        for (int i = 0; i < password.length() - 1; i++) {
            if (password.charAt(i) == password.charAt(i + 1)) {
                consecutiveCharsOk = false;
                break;
            }
        }

        int checkNotSatisfied = 0;
        if (!lengthOk) {
            checkNotSatisfied++;
        }
        if (!uppercaseOk) {
            checkNotSatisfied++;
        }
        if (!lowercaseOk) {
            checkNotSatisfied++;
        }
        if (!specialCharsOk) {
            checkNotSatisfied++;
        }
        if (numericCount < 2) {
            checkNotSatisfied++;
        }
        if (!consecutiveCharsOk) {
            checkNotSatisfied++;
        }

        return checkNotSatisfied;
    }
}
