package com.Prabal.PlacementQuestions.Wipro;
/* https://youtu.be/yVbvLjLMg8A */
public class SecurityKeyValue {
    public static void main(String[] args) {
        int num = 26537432;
        int key = Integer.MIN_VALUE; // this is nothing but finding max digit
        while (num > 0){
            int rem = num % 10;
            key = Math.max(rem,key);
            num/=10;
        }
        System.out.println(key);
    }
}
