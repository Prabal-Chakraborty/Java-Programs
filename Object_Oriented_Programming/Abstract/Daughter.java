package com.Prabal.Object_Oriented_Programming.Abstract;

public class Daughter extends Parent{
    Daughter(int age){
        this.age=age;
    }
    @Override
    void career() {
        System.out.println("I Want to become a doctor");
    }

    @Override
    void partner() {
        System.out.println("I Love Monkey D. Luffy");
    }
}
