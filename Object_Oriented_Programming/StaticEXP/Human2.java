package com.Prabal.Object_Oriented_Programming.StaticEXP;

public class Human2 {
    String msg = "Hello World !";
     public static void dispaly (Human2 human){
         System.out.println(human.msg);
     }

    public static void main(String[] args) {
        Human2 prabal = new Human2();
        prabal.msg = "Prabal's Message ";
        Human2.dispaly(prabal);
    }
}
