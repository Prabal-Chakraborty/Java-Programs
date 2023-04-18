package com.Prabal.PlacementQuestions.Wipro;
/* https://youtu.be/tdyo0eKu4B8 */
public class DigitCountExcludingGivenDigit {
    public static void main(String[] args) {
        int num = 4555654;
        int n = 4;
        int count =0;
        while (num > 0){
            int rem = num % 10;
            if(rem != n){
                count++;
            }
            num/=10;
        }
        System.out.println(count);
    }
}
