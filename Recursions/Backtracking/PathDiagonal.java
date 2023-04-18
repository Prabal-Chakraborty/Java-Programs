package com.Prabal.Recursions.Backtracking;

import java.util.ArrayList;

public class PathDiagonal {
    public static void main(String[] args) {
        System.out.println(pathDia("",3,3));
    }
    static ArrayList<String> pathDia(java.lang.String p, int row, int col){
        if(row == 1 && col ==1){
            java.util.ArrayList<java.lang.String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<java.lang.String> list = new ArrayList<>();
        if (row>1 && col>1){
            list.addAll(pathDia(p+'D',row-1,col-1));
        }
        if (row>1){
            list.addAll(pathDia(p+'V',row-1,col));
        }
        if (col > 1) {
            list.addAll(pathDia(p+'H',row,col-1));
        }
        return list;
    }
}
