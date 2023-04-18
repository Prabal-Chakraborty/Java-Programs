package com.Prabal.Object_Oriented_Programming.Generics;

import java.util.Arrays;

public class MyOwnCustomIntegerArrayList {
    private int[] data;
    private static int DEFAULT_VALUE = 10;
    private int  size = 0;
    MyOwnCustomIntegerArrayList(){

        this.data = new int[DEFAULT_VALUE]; // ctrl + D to copy the entire line
    }
    public void add(int num){
        if (isFull()){
            resize();
        }
        data[size++] = num;
    }

    public static int getDefaultValue() {
        return DEFAULT_VALUE;
    }

    public void resize() {
        int temp[] = new int[data.length * 2];
        for (int i = 0; i < data.length ; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }

    public boolean isFull() {
        return size == data.length;
    }
    public int remove(int removed){
        removed = data[--size];
        return removed;
    }
    public int size(){

        return size;
    }
    public void set(int index , int value){

        data[index] = value;
    }
    @Override
    public String toString() {

        return  Arrays.toString(data) +"\nactual size is : " + size ;
    }

    public static void main(String[] args) {
        MyOwnCustomIntegerArrayList list = new MyOwnCustomIntegerArrayList();

//        list.add(14);
//        list.add(15);

        for (int i = 1; i <= 15 ; i++) {
            list.add(2*i);
        }
        System.out.println(list);
    }
}
