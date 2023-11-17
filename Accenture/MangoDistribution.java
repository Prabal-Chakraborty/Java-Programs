package com.Prabal.PlacementQuestions.Accenture;
import java.util.*;
public class MangoDistribution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int p = scanner.nextInt();
        System.out.println(mangoDistAmongPersons(m, p));
    }

    static int mangoDistAmongPersons(int m, int p) {
        int ways = factorial(m + p - 1) / (factorial(m) * factorial(p - 1));
        return ways;
    }

    static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}
