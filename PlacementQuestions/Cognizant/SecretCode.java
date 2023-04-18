package com.Prabal.PlacementQuestions.Cognizant;
/* https://youtu.be/8J3Zs5KT3Tc */
public class SecretCode {
    public static void main(String[] args) {
        int n = 45671;
        int ans = 0;
        int p = 1;
        while (n > 0){
            int rem = n % 10;
            if (rem % 2 == 0){
                rem+=1;
            }
            else {
                rem-=1;
            }
            ans = ans + rem * p; // the main formula

            p*=10;
            n = n/10;
        }
        System.out.println(ans);
    }
}
