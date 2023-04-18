package com.Prabal.PlacementQuestions.TCS;
import java.util.*;
public class RemoveExtraParenthesis {
    public static void main(String[] args) {
        String ps = "()()()"; // the result should be ()()()
        System.out.println(REP(ps));
    }
    static String REP(String s){
        String res = "";
        int k = 0;
        for (int i = 0; i <s.length() ; i++) {
            if (s.charAt(i)==41){ //41 is the ASCII value of --> ')'
               k--;
            }

            if (k!=0) res+=s.charAt(i);

            if (s.charAt(i)==40) //40 is the ASCII value of --> '('
            {
                k++;
            }
        }
        return res;
    }
}
