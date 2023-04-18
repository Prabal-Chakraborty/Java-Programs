package com.Prabal.GUI;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class FrameDemo implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        int a,b,c;
        a=Integer.parseInt(t1.getText());
        b=Integer.parseInt(t2.getText());
        c=a+b;
        t3.setText(String.valueOf(c));

    }
    JFrame f;
    JButton b;
    JTextField t1,t2,t3;
    FrameDemo()
    {
        f=new JFrame(); // This name should same as the class name

        f.setTitle("My Frame");
        f.setSize(700, 300);
        f.setLocationRelativeTo(null);// set JFrame in center of the screen
        f.setResizable(false);//Fix the Size of the JFrame
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        f.setLayout(null);
        f.getContentPane().setBackground(new Color(123,50,250));
        t1=new JTextField(10);
        t1.setBounds(50,30,100,30);
        f.add(t1);
        t2=new JTextField(10);
        t2.setBounds(50,80,100,30);
        f.add(t2);
        t3=new JTextField(10);
        t3.setBounds(50,180,100,30);
        f.add(t3);
        t1.setToolTipText("Enter 1st number");
        t2.setToolTipText("Enter 2nd number");
        t3.setToolTipText("Result");

        b=new JButton("CLICK");
        b.setBounds(60,130,80,30);
        f.add(b);
        b.setToolTipText("click here to get result");
        b.addActionListener(this);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new FrameDemo(); // This name should also same as the class name
    }
}
