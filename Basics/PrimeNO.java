package com.Prabal.Basics;

public class PrimeNO {
    public static void main(String[] args) {
        for (int i = 1; i <=100 ; i++) {
            if(checkPrime(i))
            {
                System.out.print(i+"  ");
            }

        }
    }

    private static boolean checkPrime(int i) {
        if(i<2)
            return false;
        else {
            int x = i/2;
            for (int j = 2; j < x; j++) {
                if(i%j==0)
                    return false;

            }
        }
        return true;
    }

}
