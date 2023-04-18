package com.Prabal.Recursions.Backtracking;

public class CountTheWays {
    public static void main(String[] args) {
        System.out.println(count(3,3));

    }
    static int count(int row, int col){
        if(row==1 || col==1){
            return 1;
        }
        int left = count(row-1,col);
        int right = count(row,col-1);
        return left+right;
    }
}
