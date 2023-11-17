package com.Prabal.PlacementQuestions.Accenture;
import java.util.*;
public class TreesAndSprinklers {
    public static int findMinK(int[] trees, int[] sprinklers) {
        int minK = -1;
        for (int i = 0; i < trees.length; i++) {
            int treePos = trees[i];
            int closestDist = Integer.MAX_VALUE;
            for (int j = 0; j < sprinklers.length; j++) {
                int sprinklerPos = sprinklers[j];
                int distance = Math.abs(sprinklerPos - treePos);
                closestDist = Math.min(closestDist, distance);
            }
            if (minK == -1 || closestDist > minK) {
                minK = closestDist;
            }
        }
        return minK;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int[] trees = new int[N];
        for (int i = 0; i < N; i++) {
            trees[i] = scanner.nextInt();
        }

        int M = scanner.nextInt();
        int[] sprinklers = new int[M];
        for (int i = 0; i < M; i++) {
            sprinklers[i] = scanner.nextInt();
        }

        int result = findMinK(trees, sprinklers);
        System.out.println(result);
        scanner.close();
    }
}
