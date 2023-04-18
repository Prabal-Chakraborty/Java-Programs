package com.Prabal.GUI;

import javax.swing.*;

public class HappyNewYear {
    public static void main(String[] args) {
        try {
            String numberYear = JOptionPane.showInputDialog("Enter The Year");
            int numberYearInt = Integer.parseInt(numberYear);
            secondClass message = new secondClass();
            message.displayMessage(numberYearInt);
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "You have ended the program");
        }
    }
}
