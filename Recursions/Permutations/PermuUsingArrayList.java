package com.Prabal.Recursions.Permutations;

import java.util.ArrayList;

public class PermuUsingArrayList {
    public static void main(String[] args) {
        System.out.println(permut("","0123456789"));
    }
    static ArrayList <String> permut(String p, String up){
        if(up.isEmpty()){
            ArrayList <String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);

        // local to this call
        ArrayList <String> ans = new ArrayList<>();
        for (int i = 0; i <= p.length() ; i++)
        {
            String first = p.substring(0,i);
            String second = p.substring(i,p.length());
            ans.addAll(permut(first+ch+second, up.substring(1)));
        }
        return ans;
    }
}
