package com.Prabal.GUI;
import javax.swing.*;
import java.awt.*;
public class SimpleFrame2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setForeground(Color.WHITE);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocation(10,50);
        frame.setSize(300,120);
        frame.setTitle("My FRAME");
        frame.setVisible(true);
    }
}
