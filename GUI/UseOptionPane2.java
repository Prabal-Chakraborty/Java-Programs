package com.Prabal.GUI;
import javax.swing.JOptionPane;
public class UseOptionPane2 {
    public static void main(String[] args) {
        int age = 0;
        double money = 0.0;
        try {
             age = Integer.parseInt(JOptionPane.showInputDialog(null, "How old are you?"));
        }catch (NumberFormatException nfe){
            JOptionPane.showMessageDialog(null,"Please enter only integer values !");
            System.exit(0);
        }

        try {
            money = Double.parseDouble(JOptionPane.showInputDialog(null, "How much money do you have ?"));
        }catch (NumberFormatException nfe){
            JOptionPane.showMessageDialog(null,"INVALID INPUT !!!");
            System.exit(0);
        }

        JOptionPane.showMessageDialog(null,"If you can double your money each year, \n"
                                       + "You'll have " + (money*32) + " dollars at age " + (age+5) + "!" );

    }
}
