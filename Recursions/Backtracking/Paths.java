package com.Prabal.Recursions.Backtracking;

import java.util.ArrayList;

public class Paths {
    public static void main(String[] args) {
        System.out.println(path("",3,3));

    }
    static ArrayList<String> path(String p, int row, int col){
        if(row == 1 && col ==1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        if (row>1){
            list.addAll(path(p+'D',row-1,col));
        }
        if (col > 1) {
            list.addAll(path(p+'R',row,col-1));
        }
        return list;
    }
}
