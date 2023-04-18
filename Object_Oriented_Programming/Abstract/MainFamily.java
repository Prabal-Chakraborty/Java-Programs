package com.Prabal.Object_Oriented_Programming.Abstract;

public class MainFamily {
    public static void main(String[] args) {
        son son = new son(18);
        son.career();
        son.partner();
        son.normal();
        son.hello();
        System.out.println("*******************************************************************************");
        Daughter daughter = new Daughter(20);
        daughter.career();
        daughter.partner();
        daughter.normal();
        daughter.hello();

//        Parent maa = new Parent(); // Error, we can not create objects of abstract classes
    }
}
