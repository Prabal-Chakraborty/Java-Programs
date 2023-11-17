package com.Prabal.PlacementQuestions.Accenture;

public class ValidAnagram {
    public static void main(String[] args) {
        boolean ans = isValidAnagram("batman","mantab");
        if (ans){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
    }
    public static boolean isValidAnagram(String a, String b){
        int n = a.length();
        int m = b.length();
        if (n != m){
            return false;
        }

        int[] count = new int[26];
        for (int i = 0; i <n ; i++) {
            count[a.charAt(i) - 'a']++;
        }
        for (int i = 0; i <m ; i++) {
            count[b.charAt(i) - 'a']--;
        }
        for (int i = 0; i <count.length ; i++) {
            if (count[i] != 0){
                return false;
            }
        }
        return true;
    }
}
