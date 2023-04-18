package com.Prabal.GUI;
import javax.swing.JOptionPane;
public class MsgShower {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Enter Your Name");
        JOptionPane.showMessageDialog(null,"Hello, Wassup " + name);

        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter Your Age"));
        JOptionPane.showMessageDialog(null,"You are " + age + " Years Old!!!!");

        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter Your Height"));
        JOptionPane.showMessageDialog(null,"Your height is " + height + " cm");

    }
}
