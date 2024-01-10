/*import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyJOptionPane {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setTitle("INPUT DIALOG BOX");
        f.setBounds(100,100,700,500);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(new FlowLayout());

        JButton jb = new JButton("Click me");
        f.add(jb);

        jb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String str = JOptionPane.showInputDialog("Enter your Name");
                if(str.length()>0){
                    System.out.println("The name of user is : "+ str);
                }
            }
        });

        f.setVisible(true);
    }
}*/

/*
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyJOptionPane {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setTitle("INPUT DIALOG BOX");
        f.setBounds(100,100,700,500);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(new FlowLayout());

        JButton jb1 = new JButton("PlAIN");
        f.add(jb1);


        JButton jb2 = new JButton("INFORMATION");
        f.add(jb2);

        JButton jb3 = new JButton("QUESTION");
        f.add(jb3);


        JButton jb4 = new JButton("ERROR");
        f.add(jb4);

        JButton jb5 = new JButton("WARNING");
        f.add(jb5);


        jb1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                 JOptionPane.showMessageDialog(f,"Hello there","Message",JOptionPane.PLAIN_MESSAGE);
            }
        });
        jb2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(f,"Hello there","Message",JOptionPane.INFORMATION_MESSAGE);
            }
        });
        jb3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(f,"Hello there","Message",JOptionPane.QUESTION_MESSAGE);
            }
        });
        jb4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(f,"Hello there","Message",JOptionPane.ERROR_MESSAGE);
            }
        });
        jb5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(f,"Hello there","Message",JOptionPane.WARNING_MESSAGE);
            }
        });

        f.setVisible(true);
    }
}*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyJOptionPane {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setTitle("INPUT DIALOG BOX");
        f.setBounds(100,100,700,500);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(new FlowLayout());

        JButton jb1 = new JButton("Click Here");
        f.add(jb1);


        jb1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               int sel =  JOptionPane.showConfirmDialog(f,"Do you want to exit?","Message",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE);
               if(sel == JOptionPane.YES_OPTION){
                   System.exit(0);
               }else if(sel == JOptionPane.NO_OPTION){
                   System.out.println("NO is Selected");
               }else if(sel == JOptionPane.CANCEL_OPTION){
                   System.out.println("Cancel is selected");
               }
            }
        });

        f.setVisible(true);
    }
}