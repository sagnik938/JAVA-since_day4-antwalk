package day6.GUI_app;
import java.awt.Color;
import java.awt.event.ActionEvent;

import javax.swing.*;
import javax.swing.event.AncestorListener;

public class MyCalculatorGUI implements Action{
    JFrame f;
    JTextField t;
    JButton b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,badd,bminus,bmult,bdiv,bdec,beq,bclr,bdel;
    static double a = 0 , b = 0 , result = 0;
    static int operator = 0;

    public MyCalculatorGUI(){
        f = new JFrame("My Calculator");
        f.setVisible(true);
        f.setLayout(null);
        f.setBounds(20,20,300,350);
        f.setResizable(false);

        // Font fo = new Font("Arial",Font.BOLD,20);
        t = new JTextField();
        t.setFont(null);
        t.setBackground(Color.gray);
        t.setForeground(Color.BLACK);
        t.setBounds(40,40,200,50);
        f.add(t);

        b0 = new JButton("0");
        b1 = new JButton("1");
        b2 = new JButton("2");
        b3 = new JButton("3");
        b4 = new JButton("4");
        b5 = new JButton("5");
        b6 = new JButton("6");
        b7 = new JButton("7");
        b8 = new JButton("8");
        b9 = new JButton("9");
        badd = new JButton("+");
        bminus = new JButton("-");
        bmult = new JButton("*");
        bdiv = new JButton("/");
        bdec = new JButton(".");
        bclr = new JButton("CLR");
        bdel = new JButton("DEL");

    }

    public static void main(String[] args) {
        new MyCalculatorGUI();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        
    }
}
