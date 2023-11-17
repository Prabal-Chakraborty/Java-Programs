package com.Prabal.PlacementQuestions.Accenture;
import java.util.*;
public class MerryStringCount {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.nextLine());
        String s = scanner.nextLine();
        int result = countMerrySubstring(s);
        System.out.println(result);
        scanner.close();
    }
    public static int countMerrySubstring(String s) {
        int n = s.length();
        if (n < 4) {
            return 0;
        }

        int merryCount = 0;
        for (int i = 0; i < n - 3; i++) {
            String sub = s.substring(i, i + 4);
            if (isMerry(sub)) {
                merryCount++;
            }
        }

        return merryCount;
    }
    public static boolean isMerry(String sub) {
        for (char c : sub.toCharArray()) {
            if (sub.indexOf(c) != sub.lastIndexOf(c)) {
                return false;
            }
        }
        return true;
    }
}
