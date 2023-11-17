package com.Prabal.PlacementQuestions.Accenture;

import java.util.Scanner;

public class MinuimumTimeToFill {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter pipeline1 capacity: ");
        int pipeline1 = scanner.nextInt();
        System.out.print("Enter pipeline2 capacity: ");
        int pipeline2 = scanner.nextInt();
        System.out.print("Enter pipeline3 capacity: ");
        int pipeline3 = scanner.nextInt();
        System.out.print("Enter total capacity: ");
        int capacity = scanner.nextInt();

        String result = minimumTimeToFill(pipeline1, pipeline2, pipeline3, capacity);
        System.out.println("Minimum time to fill: " + result);
    }
    public static String minimumTimeToFill(int pipeline1, int pipeline2, int pipeline3, int TotalCapacity) {
        double p1 = (double) TotalCapacity / pipeline1;
        double p2 = (double) TotalCapacity / pipeline2;
        double p3 = (double) TotalCapacity / pipeline3;

        double[] time = {p1, p2, p3};

        if (time[0] <= time[1] && time[0] <= time[2]) {
            return "pipeline1";
        } else if (time[1] <= time[0] && time[1] <= time[2]) {
            return "pipeline2";
        } else {
            return "pipeline3";
        }
    }
}
