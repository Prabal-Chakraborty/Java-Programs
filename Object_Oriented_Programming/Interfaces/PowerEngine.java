package com.Prabal.Object_Oriented_Programming.Interfaces;

public class PowerEngine implements Engine{
    @Override
    public void start() {
        System.out.println("Power Engine Is Ready to Start");
    }

    @Override
    public void stop() {
        System.out.println("Power Engine Stops");
    }

    @Override
    public void acc() {
        System.out.println("This is accelerating cuz of its Power");
    }
}
