package com.Prabal.PlacementQuestions.Accenture;

public class BinaryStringOperatiions {
    public static void main(String[] args) {
        String s = "1C0C1C1A0B1";
        String s1 = "0C1A1B1C1C1B0A0";
        System.out.println(operationsOnBinaryString(s));
        System.out.println(calculateBinaryString(s));

    }
    public static int operationsOnBinaryString(String s){
        if (s == null){
            return -1;
        }
        int result = s.charAt(0) - '0';
        for (int i = 1; i <s.length() ; ) {
            char rev = s.charAt(i);
            i++;
            if (rev == 'A'){
                result = result & (s.charAt(i) - '0');
            } else if (rev == 'B') {
                result = result | (s.charAt(i) - '0');
            }else {
                result = result ^ (s.charAt(i) - '0');
            }
            i++;
        }
        return result;
    }
    public static int calculateBinaryString(String inputString) {
        if (inputString == null || inputString.isEmpty()) {
            return -1; // Invalid input
        }

        int result = inputString.charAt(0) - '0';

        for (int i = 1; i < inputString.length(); i += 2) {
            char operation = inputString.charAt(i);
            int number = inputString.charAt(i + 1) - '0';

            if (operation == 'A') {
                result &= number;
            } else if (operation == 'B') {
                result |= number;
            } else if (operation == 'C') {
                result ^= number;
            } else {
                return -1; // Invalid operation
            }
        }
        return result;
    }
}
