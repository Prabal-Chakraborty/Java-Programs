package com.Prabal.PlacementQuestions.Accenture;

public class CountSpecificNumber {
    public static void main(String[] args) {

        System.out.println(cntSpcNo(100,200));
    }
    public static int cntSpcNo(int m, int n){
        int count=0;
        if (m>n){
            return -1;
        }
        for (int i = m; i <=n ; i++) {
            int num = i;

            boolean isValid = true;
            while (num !=0){
                int d = num%10;
                if (d != 1 && d!=4 && d!=9){
                    isValid=false;
                    break;
                }
                num/=10;
            }
            if (isValid){
                count++;
            }
        }
        return count;
    }
}
