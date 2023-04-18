package com.Prabal.Object_Oriented_Programming.Polymorphism;

public class OverLoadDemo {
    void test(double a){
        System.out.println("Inside test (double) a : "+a);
    }
}
class OverLoad{
    public static void main(String[] args) {
        OverLoadDemo obj = new OverLoadDemo();
        int i = 88;
        obj.test(i);
        obj.test(123.2);

    }
}
