package com.Prabal.GUI;

import javax.swing.*;

public class UseOptionPane {
    public static void main(String[] args) {
        // read's the user's name graphically
        String name = JOptionPane.showInputDialog(null,"What is your name?");
       // ask the user yes/no qn
        int choice = JOptionPane.showConfirmDialog(null,"Do you like cake, "+ name +" ?");

        if(choice == JOptionPane.YES_OPTION)
        {
            JOptionPane.showMessageDialog(null,"Of Course, Who doesn't?");
        } else if (choice == JOptionPane.CANCEL_OPTION) {
            System.exit(0);


        } else
        { // choice == JOptionPane.NO_OPTION
            JOptionPane.showMessageDialog(null,"we'll have to agree to disagree.");
        }

    }
}
