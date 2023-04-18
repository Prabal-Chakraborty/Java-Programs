package com.Prabal.Object_Oriented_Programming.StaticEXP;

public class CallHuman {
    public static void main(String[] args) {
        // Human And CallHuman they are in the same package that's why we don't have to import the package path
        Human prabal = new Human(21,"Prabal",65000,false);
        Human bubun = new Human(21,"Bubun",75000,false);
        Human Riju = new Human(21,"Riju",60000,false);

        System.out.println(Human.population);
    }
}
