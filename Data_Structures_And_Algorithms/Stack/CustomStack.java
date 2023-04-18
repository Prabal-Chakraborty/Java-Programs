package com.Prabal.Data_Structures_And_Algorithms.Stack;

import java.util.Stack;

public class CustomStack {
    protected int [] data;
    private static final int DEFAULT_SIZE = 10;
    int ptr = -1;

    public CustomStack() {
        this(DEFAULT_SIZE);
    }

    public CustomStack(int size) {
        this.data = new int[size];
    }
    public boolean push(int item){
        if (isFull()){
            System.out.println("Stack in full !!");
            return false;
        }
        ptr++;
        data[ptr] = item;
        return true;
    }
    public int pop() throws StackException {
        if (isEmpty()){
            throw  new StackException("Can not pop from an empty stack");
        }
//        int removed = data[ptr];
//        ptr--;
//        return removed;

        return data[ptr--];
    }

    public int peek() throws StackException {
        if (isEmpty()) {
            throw new StackException("Cannot peek from an empty stack!!");
        }
        return data[ptr];
    }

    public boolean isEmpty() {
        return ptr == -1;
    }

    public boolean isFull() {
        return ptr == data.length-1;
    }

    
}
