package com.Prabal.Recursions.Permutations;

import java.util.ArrayList;

public class Dice {
    public static void main(String[] args) {
        System.out.println(dice("",4));
//        System.out.println(diceFACES("",6,12).size());
    }
    static ArrayList <String> dice(String p, int target){
        if(target == 0){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
            ArrayList<String> list = new ArrayList<>();
        for (int i = 1; i <=6 && i<=target ; i++) {
            list.addAll(dice(p + i, target - i));
        }
        return list;
    }

    // What if the dice has more than 6 faces
    static ArrayList <String> diceFACES (String p, int target, int face){
        if(target == 0){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        for (int i = 1; i <= face && i<=target ; i++) {
            list.addAll(diceFACES(p + i, target - i, face));
        }
        return list;
    }
}
