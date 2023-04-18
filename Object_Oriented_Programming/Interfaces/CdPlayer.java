package com.Prabal.Object_Oriented_Programming.Interfaces;

public class CdPlayer implements Media{
    @Override
    public void start() {
        System.out.println("Music Starts, Rock On");
    }

    @Override
    public void stop() {
        System.out.println("Music stops");

    }
}
