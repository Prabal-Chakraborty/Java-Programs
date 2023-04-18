package com.Prabal.Object_Oriented_Programming.Abstract;

public class son extends Parent{
    son(int age){
        this.age=age;
    }

    @Override
    void normal() {
        super.normal();
    }

    @Override
    void career() {
        System.out.println("I want to be an engineer");
    }

    @Override
    void partner() {
        System.out.println("I love DD");

    }
}
