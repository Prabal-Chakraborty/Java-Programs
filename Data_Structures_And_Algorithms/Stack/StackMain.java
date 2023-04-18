package com.Prabal.Data_Structures_And_Algorithms.Stack;

import java.util.Stack;

public class StackMain {
    public static void main(String[] args) throws StackException {
//        CustomStack stk = new DynamicStack();
//        stk.push(10);
//        stk.push(20);
//        stk.push(30);
//        stk.push(40);
//        stk.push(50);
//        stk.push(60);
//        stk.push(70);
//        stk.push(80);
//        stk.push(90);
//        stk.push(100);
//        stk.push(110);
//        stk.push(120);
//
//        System.out.println(stk.pop()); // 60 will be pop out from the stack

        String str = "{([])}";
        ispar2(str);
        System.out.println(ispar(str));

    }
    static boolean ispar(String x)
    {

        Stack<Character> stk = new Stack<>();

        for(int i=0;i<x.length();i++){
            if(x.charAt(i)=='{' || x.charAt(i)=='[' || x.charAt(i)=='('){
                stk.push(x.charAt(i));
            }else if(!stk.empty() && (((x.charAt(i)=='[') && (stk.peek()==']')) ||
                    ((x.charAt(i)=='{') && (stk.peek()=='}')) ||
                    ((x.charAt(i)=='(') && (stk.peek()==')')))){

                stk.pop();
            }else{
                stk.push(x.charAt(i));
            }
        }

        if(stk.empty())
        {
            return true;
        }
        return false;
    }

    static void ispar2(String str){
        Stack<Character> st = new Stack<>();

        //Traverse a string
        for(int i = 0; i < str.length(); i++) {

            /* If the current character is starting bracket,
               then push them in a stack
             */
            if(str.charAt(i) == '{' || str.charAt(i) == '[' || str.charAt(i) == '(') {
                st.push(str.charAt(i));

            /*
               Else, If the stack is not empty,
               And current character is a closing bracket
               and top character of a stack is matching open bracket
               then pop it.
             */
            } else if (!st.empty() && (((str.charAt(i) == ']') && (st.peek() == '[')) ||
                    ((str.charAt(i) == '}') && (st.peek() == '{')) ||
                    ((str.charAt(i) == ')') && (st.peek() == '(')))) {

                st.pop();

            } else {
                st.push(str.charAt(i));
            }
        }

        if(st.empty()) {
            System.out.println("Balanced");
        } else {
            System.out.println("Not balanced");
        }
    }
    }

