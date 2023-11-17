package com.Prabal.PlacementQuestions.Accenture;

public class AddNumbersInSpecificRange {
    public static void main(String[] args) {
        System.out.println(add(100000,-8000));
    }
    public static int add(int a, int b){

        if(a<=10000 && a>=-10000 && b<=10000 && b>=-10000 ){
            return a+b;
        }
        return -1;
    }
    
}
