package com.Prabal.PlacementQuestions.Accenture;

import java.util.Scanner;

public class Number248 {
    static final int MOD = 1000000007;

    static boolean is248Number(long n) {
        int count2 = 0, count4 = 0, count8 = 0;

        while (n > 0) {
            int digit = (int) (n % 10);
            if (digit == 2) count2++;
            else if (digit == 4) count4++;
            else if (digit == 8) count8++;
            n /= 10;
        }

        return (count2 == count4 && count4 == count8 && count2 > 0);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();

        long count = 0;
        for (long i = 1; i <= n; ++i) {
            if (is248Number(i)) {
                count = (count + 1) % MOD;
            }
        }

        System.out.println(count);
    }
}
