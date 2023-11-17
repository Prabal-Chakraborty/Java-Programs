package com.Prabal.PlacementQuestions.Accenture;

public class FineNumber {
    public static void main(String[] args) {
        int[] a1 = {1, 2, 3, 4, 5};
        int[] b1 = {10, 12, 34, 2, 4, 89};
        int result1 = fineNumber(a1, b1, 5, 6);
        System.out.println("Output for Test Case 1: " + result1);  // Output: 88

        int[] a2 = {6, 7, 8, 11};
        int[] b2 = {3, 1, 2};
        int result2 = fineNumber(a2, b2, 4, 3);
        System.out.println("Output for Test Case 2: " + result2);  // Output: 10
    }
    public static int fineNumber(int[] a, int[] b, int n, int m) {
        if (a == null || b == null || a.length == 0 || b.length == 0) {
            return 0;
        }
        int ans = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int d = Math.abs(a[i] - b[j]);
                ans = Math.max(ans, d);
            }
        }

        return ans;
    }
}
