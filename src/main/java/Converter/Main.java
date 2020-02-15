package Converter;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.*;
import java.awt.*;
import java.awt.Font;
import java.io.IOException;

public class Main extends JFrame implements ActionListener{
    private JLabel lb1, lb2;
    private JPanel p1, p2, p3;
    private JButton length, temp, mass, water;
    
    public static void main(String[] args) {
        Main obj = new Main();
        obj.setSize(600, 400);
        obj.setTitle("Unit Calculator");
        obj.setVisible(true);
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public Main()
    {
        lb1 = new JLabel("<html>Welcome to unit calculator!<br/><br/>Choose a Converter",JLabel.CENTER);
        lb1.setFont(new Font("Verdana", Font.BOLD, 20));
        length = new JButton("LENGTH");
        length.setPreferredSize(new Dimension(100, 30));
        temp = new JButton("TEMPERATURE");
        temp.setPreferredSize(new Dimension(150, 30));
        mass = new JButton("MASS");
        mass.setPreferredSize(new Dimension(100, 30));
        water = new JButton("WATER");
        water.setPreferredSize(new Dimension(100, 30));
        
        p1 = new JPanel();
        p1.setBackground(new Color(25, 181, 254));
        p1.add(lb1);
        
        p2 = new JPanel();
        p2.add(length);
        p2.add(temp);
        p2.add(mass);
        p2.add(water);
        p2.setLocation(10,10);
        
        
        setLayout(new BorderLayout());
        add(p1, BorderLayout.NORTH);
        add(p2, BorderLayout.CENTER);
        
        length.addActionListener(this);
        temp.addActionListener(this);
        mass.addActionListener(this);
        water.addActionListener(this);
        
    }
    
     @Override public void actionPerformed(ActionEvent e){
            if(e.getSource()== length)
                createFrame(new Length(),"Length Converter");
            if(e.getSource() == temp)
                createFrame(new Temperature(),"Temperature Converter");
            if(e.getSource() == mass)
                createFrame(new Mass(),"Mass Converter");
            if(e.getSource() == water)
                createFrame(new Water(),"Water Converter");
            this.dispose();
        }
     private void createFrame(JFrame obj,String title){
         JPanel contentPane;

         obj.setSize(500,600);
         obj.setTitle(title);
         obj.setVisible(true);
     }


    
}
