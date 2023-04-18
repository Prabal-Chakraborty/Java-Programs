package com.Prabal.Object_Oriented_Programming.Interfaces;

public class NIceCar {
    private Engine engine;
    private Media player = new CdPlayer();
    NIceCar(){
        engine = new PowerEngine();
    }

    public void start(){
        engine.start();
    }

    public void stop(){
        engine.stop();
    }

    public void startMusic(){
        player.start();
    }
    public void stopMusic(){
        player.stop();
    }

    public void UpgradeEngine(){
        this.engine = new ElectricEngine();
    }
}
