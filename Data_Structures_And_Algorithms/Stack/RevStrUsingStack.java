package com.Prabal.Data_Structures_And_Algorithms.Stack;
/* https://practice.geeksforgeeks.org/problems/reverse-a-string-using-stack/1?page=1&category[]=Stack&sortBy=accuracy */
import java.util.Stack;

public class RevStrUsingStack {
    public String reverse(String S){
        //code here
        Stack <Character> stk = new Stack<>();

        String ans = "";
        int len = S.length();

        for(int i=0; i<len; i++){

            stk.add(S.charAt(i));
        }

        while(!stk.isEmpty()){

            ans+=stk.pop();
        }

        return ans;
    }
}
