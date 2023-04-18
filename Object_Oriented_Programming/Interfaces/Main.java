package com.Prabal.Object_Oriented_Programming.Interfaces;

public class Main {
    public static void main(String[] args) {
//        Car car = new Car();
//
//        car.start();
//        car.stop();
//        car.acc();
//        car.acc();

//        Media carMedia = new Car();
//        carMedia.stop(); // o/p :- I stop engine like a normal car

        NIceCar car = new NIceCar();
        car.start();
        car.startMusic(); // Now Problem is solved

        car.UpgradeEngine(); // without creating a new obj you are changing the part of the engine
        car.start();
    }
}
