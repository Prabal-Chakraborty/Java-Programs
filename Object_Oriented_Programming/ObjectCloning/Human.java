package com.Prabal.Object_Oriented_Programming.ObjectCloning;

import java.util.Arrays;

public class Human implements Cloneable{
    int age;
    String name;
    int [] arr;
   public Human(int age, String name){
        this.age = age;
        this.name = name;
        this.arr = new int[]{3,4,5,6,9,1};
    }

    public Human (Human other){
       this.age = other.age;
       this.name = other.name;
    }

    public Object clone() throws CloneNotSupportedException{
       return super.clone(); // this is shallow copy
    }

    public static void main(String[] args) throws CloneNotSupportedException {

        Human prabal = new Human(21,"Prabal Chakraborty");

        Human twin  = (Human)prabal.clone(); // we have to type cast it to Human type because it is of Object type
                                             //  and Object is more restrictive type than any other.

        //System.out.println(twin.age + " " + twin.name);

        System.out.println(Arrays.toString(twin.arr));
        twin.arr[0] = 420;
        System.out.println(Arrays.toString(prabal.arr));




    }

}
