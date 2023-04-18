package com.Prabal.Object_Oriented_Programming.Abstract;

public abstract class Parent {
//    abstract Parent(); // Error !!!!, Abstract Constructors are not allowed
    int age;

    abstract void career();
    abstract void partner();

    static void hello(){
        System.out.println("Hello, I am a static method");
    }

    void normal(){
        System.out.println("Hey, I am a normal method");
    }
}
