package com.Prabal.PlacementQuestions.Accenture;
//Accenture 30th sept, 2023 slot 1
public class StrCamelCasetoNextLineIterchange {
    public static void main(String[] args) {
        String str1 = "thisMightBeACode";
        String str2 = "thisIsATest";
        System.out.println(change(str1));
        System.out.println();
        System.out.println(change(str2));
    }
    public static String change(String s){
        StringBuilder result = new StringBuilder();

        for (int i = 0; i <s.length() ; i++) {

            if (Character.isUpperCase(s.charAt(i))){
                result.append("\n");
                result.append(Character.toLowerCase(s.charAt(i)));
            } else if (Character.isLowerCase(s.charAt(i))) {
                result.append(Character.toUpperCase(s.charAt(i)));
            }
        }
        return result.toString();
    }
}
