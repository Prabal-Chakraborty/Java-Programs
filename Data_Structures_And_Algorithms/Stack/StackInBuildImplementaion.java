package com.Prabal.Data_Structures_And_Algorithms.Stack;

import java.util.Stack;

public class StackInBuildImplementaion {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(10); //first in
        stack.push(20);
        stack.push(30);// last in

        System.out.println(stack.pop());
        System.out.println(stack.pop());



    }
}
