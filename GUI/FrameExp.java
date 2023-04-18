package com.Prabal.GUI;

import javax.swing.*;
import java.awt.*;

public class FrameExp {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("PRABAL'S SUPREMACY");
        frame.setSize(500,500); //sets the x-dimension, and y-dimension of frame
        frame.setResizable(false);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit from application
        frame.getContentPane().setBackground(new Color(123,55,250));
        frame.setVisible(true);   //make frame visible
//        ImageIcon imgg = new ImageIcon("e991804378163190adbd288a473edc85.jpg");
//        frame.setIconImage(imgg.getImage());
    }
}
