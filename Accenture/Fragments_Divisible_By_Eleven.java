package com.Prabal.PlacementQuestions.Accenture;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Fragments_Divisible_By_Eleven {
    public static void main(String[] args) {
        System.out.println(findCount(1215598));

    }
    public static int findCount(int n) {
        int sumVal = 0;
        int count = 0;
        List<Integer> v = new ArrayList<>();

        while (n != 0) {
            v.add(n % 10);
            n /= 10;
        }

        int lenV = v.size();

        for (int i = 0; i < lenV; i++) {
            sumVal = v.get(i);
            for (int j = i + 1; j < lenV; j++) {
                sumVal = sumVal * 10 + v.get(j);
                if (sumVal % 11 == 0) {
                    count++;
                }
            }
        }

        return count;
    }
}
