package com.Prabal.Object_Oriented_Programming.Generics;

import java.util.Arrays;
// https://docs.oracle.com/javase/tutorial/java/generics/restrictions.html#createObjects
public class CustomGenArrayList <T>{ //You can not create an instance of generic type
    private Object[] data;
    private static int DEFAULT_VALUE = 10;
    private int  size = 0;
    public CustomGenArrayList(){
        this.data = new Object[DEFAULT_VALUE]; // ctrl + D to copy the entire line
    }
    public void add(T num){
        if (isFull()){
            resize();
        }
        data[size++] = num;
    }

    public static int getDefaultValue() {
        return DEFAULT_VALUE;
    }

    public void resize() {
        Object temp[] = new Object[data.length * 2];
        for (int i = 0; i < data.length ; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }

    public boolean isFull() {

        return size == data.length;
    }
    public T remove(T removed){
        removed =(T)( data[--size]);
        return removed;
    }
    public int size(){
        return size;
    }
    public void set(int index , T value){

        data[index] = value;
    }
    @Override
    public String toString() {

        return  Arrays.toString(data) +"\nactual size is : " + size ;
    }

    public static void main(String[] args) {
        CustomGenArrayList <Integer> list = new CustomGenArrayList<>();

//        list.add("bandvsvd");
//        list.add(14);
//        list.add(15);

        for (int i = 1; i <= 15 ; i++) {
            list.add(2*i);
        }
        System.out.println(list);

    }
}
