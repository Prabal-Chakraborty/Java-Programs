package com.Prabal.PlacementQuestions.Cabgimini;

import java.util.Arrays;
import java.util.List;
// https://youtu.be/odjKeH7X6CM
public class StringQn {
    public static void main(String[] args) {
        List<String> str = Arrays.asList("ab","aba","xyx","pop","mno");
        str.stream().filter(x -> x.length() >0 && x.endsWith(String.valueOf(x.charAt(0)))).forEach(System.out::println);
    }
}
