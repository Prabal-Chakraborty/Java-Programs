package com.Prabal.PlacementQuestions.Accenture;

import java.util.Scanner;

public class CompressString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        scanner.close();
        String compressedString = compressString(inputString);
        System.out.println(compressedString);

    }
    public static String compressString(String inputString) {
        StringBuilder output = new StringBuilder();
        int i = 0;

        while (i < inputString.length()) {
            int count = 1;
            while (i < inputString.length() - 1 && inputString.charAt(i) == inputString.charAt(i + 1)) {
                count++;
                i++;
            }
            if (count == 1) {
                output.append(inputString.charAt(i));
            }
            i++;
        }

        return output.toString();
    }
}
