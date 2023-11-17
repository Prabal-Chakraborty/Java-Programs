package com.Prabal.PlacementQuestions.Accenture;

public class printFirstKWords {
    public static void FirstKWords(String line, int k) {
        String[] words = line.split(" "); // Split the line into individual words

        if (k <= words.length) {
            for (int i = 0; i < k; i++) {
                System.out.print(words[i] + " ");
            }
        } else {
            System.out.println("The line has fewer than k words.");
        }
    }

    public static void main(String[] args) {
        String lineOfWords = "Look at the sky";
        int k = 2;
        FirstKWords(lineOfWords, k);
    }
}
