package com.Prabal.Object_Oriented_Programming.ObjectCloning;

import java.util.Arrays;

public class Human2 implements Cloneable{
    int age;
    String name;
    int [] arr;
    public Human2(int age, String name){
        this.age = age;
        this.name = name;
        this.arr = new int[]{3,4,5,6,9,1};
    }


    public Object clone() throws CloneNotSupportedException{
        Human2 twin = (Human2) super.clone();
        // This is deep copy
        twin.arr = new int[twin.arr.length];
        for (int i = 0; i <twin.arr.length ; i++) {
            twin.arr[i] = this.arr[i];
        }
        return twin;
    }

    public static void main(String[] args) throws CloneNotSupportedException {

        Human2 prabal = new Human2(21,"Prabal Chakraborty");

        Human2 twin  = (Human2)prabal.clone(); // we have to type cast it to Human type because it is of Object type
        //  and Object is more restrictive type than any other.

        //System.out.println(twin.age + " " + twin.name);

        System.out.println(Arrays.toString(twin.arr));
        twin.arr[0] = 420;
        System.out.println(Arrays.toString(prabal.arr)); // [3, 4, 5, 6, 9, 1]

        System.out.println(Arrays.toString(twin.arr)); //  [420, 4, 5, 6, 9, 1]


    }
}
