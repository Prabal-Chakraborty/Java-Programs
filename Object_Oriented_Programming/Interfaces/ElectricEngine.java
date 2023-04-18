package com.Prabal.Object_Oriented_Programming.Interfaces;

public class ElectricEngine implements Engine{
    @Override
    public void start() {
        System.out.println("Electric Engine starts");
    }

    @Override
    public void stop() {
        System.out.println("Electric Engine stops");

    }

    @Override
    public void acc() {
        System.out.println("Electric Engine accelerates");

    }
}
