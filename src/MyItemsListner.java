/*import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

class myframe1 extends JFrame implements ItemListener{
    JTextField jtf;
    JComboBox jcb;
    myframe1(){
        setTitle("ItemListner");
        setBounds(100,100,700,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        Container c = this.getContentPane();
        c.setLayout(null);

        String[] values = {"1","2","3","4"};
        jcb = new JComboBox(values);
        jcb.setBounds(50,50,100,20);
        c.add(jcb);
        jcb.addItemListener(this);

        jtf =new JTextField();
        jtf.setBounds(150,50,200,20);
        c.add(jtf);



        setVisible(true);

    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        String str = jcb.getSelectedItem().toString();
        jtf.setText(str);


    }
}
public class MyItemsListner {
    public static void main(String[] args) {
        myframe1 f = new myframe1();


    }
}*/

/*
import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

class myframe1 extends JFrame implements ItemListener{
    JTextField jtf;
    JRadioButton jrb1;
    JRadioButton jrb2;
    myframe1(){
        setTitle("ItemListner");
        setBounds(100,100,700,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        Container c = this.getContentPane();
        c.setLayout(null);

        jrb1 = new JRadioButton("Male");
        jrb1.setBounds(50,50,100,20);
        jrb2 = new JRadioButton("Female");
        jrb2.setBounds(50,100,100,20);

        jrb1.addItemListener(this);
        jrb2.addItemListener(this);

        ButtonGroup btn = new ButtonGroup();
        btn.add(jrb1);
        btn.add(jrb2);

        c.add(jrb1);
        c.add(jrb2);


        jtf =new JTextField();
        jtf.setBounds(300,50,200,20);
        c.add(jtf);



        setVisible(true);

    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        if(jrb1.isSelected()){
            jtf.setText("Male is selected");
        }else if(jrb2.isSelected()){
            jtf.setText("Female is Selected");

        }


    }
}
public class MyItemsListner {
    public static void main(String[] args) {
        myframe1 f = new myframe1();


    }
}*/

/*
import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

class myframe1 extends JFrame implements ItemListener{
    JTextField jtf;
    JRadioButton jrb1;
    JRadioButton jrb2;
    myframe1(){
        setTitle("ItemListner");
        setBounds(100,100,700,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        Container c = this.getContentPane();
        c.setLayout(null);

        jrb1 = new JRadioButton("Male");
        jrb1.setBounds(50,50,100,20);
        jrb2 = new JRadioButton("Female");
        jrb2.setBounds(50,100,100,20);

        jrb1.addItemListener(this);
        jrb2.addItemListener(this);

        ButtonGroup btn = new ButtonGroup();
        btn.add(jrb1);
        btn.add(jrb2);

        c.add(jrb1);
        c.add(jrb2);


        jtf =new JTextField();
        jtf.setBounds(300,50,200,20);
        c.add(jtf);



        setVisible(true);

    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        if(jrb1.isSelected()){
            jtf.setText("Male is selected");
        }else if(jrb2.isSelected()){
            jtf.setText("Female is Selected");

        }


    }
}
public class MyItemsListner {
    public static void main(String[] args) {
        myframe1 f = new myframe1();


    }
}*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

class myframe2 extends JFrame implements ItemListener {
    JMenuBar menubar;
    JMenu menu;
    JCheckBoxMenuItem c1;
    JTextField t1;
    Container c;
    myframe2(){
        c= this.getContentPane();
        c.setLayout(null);

        menubar = new JMenuBar();
        menu = new JMenu("File");

        c1 = new JCheckBoxMenuItem("print");
        c1.addItemListener(this);

        t1 = new JTextField("");
        t1.setBounds(300,50,200,100);

        c.add(t1);

        menu.add(c1);
        menubar.add(menu);
        this.setJMenuBar(menubar);


    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        if(c1.isSelected()){
            t1.setText("Print is selected");
        }else{
            t1.setText("Print is not selected");
        }
    }
}
public class MyItemsListner {
    public static void main(String[] args) {
        myframe2 f = new myframe2();
        f.setTitle("ItemListner");
        f.setBounds(100,100,700,500);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);

    }
}


