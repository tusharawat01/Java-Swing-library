/*
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Myframe extends JFrame implements ActionListener {

    Container c;
    JButton btn;
    Myframe(){
        c = this.getContentPane();
        c.setLayout(null);

        btn = new JButton("Click me");
        btn.setBounds(100,100,100,50);
        c.add(btn);
        Cursor cur = new Cursor(Cursor.HAND_CURSOR);
        btn.setCursor(cur);
        btn.addActionListener(this);

    }
    public void actionPerformed(ActionEvent e){
        c.setBackground(Color.MAGENTA);

    }
}
public class MyActionListner {
    public static void main(String[] args) {
        Myframe f = new Myframe();
        f.setTitle("Action Demo");
        f.setBounds(100,100,700,500);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
*/


/*import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Myframe extends JFrame implements ActionListener {

    Container c;
    JButton btn1;
    JButton btn2;
    JButton btn3;
    Myframe(){
        c = this.getContentPane();
        c.setLayout(null);

        btn1 = new JButton("RED");
        btn1.setBounds(100,100,100,50);
        c.add(btn1);
        Cursor cur = new Cursor(Cursor.HAND_CURSOR);
        btn1.setCursor(cur);
        btn1.addActionListener(this);

        btn2 = new JButton("YELLOW");
        btn2.setBounds(250,100,100,50);
        c.add(btn2);
        btn2.setCursor(cur);
        btn2.addActionListener(this);

        btn3 = new JButton("GREEN");
        btn3.setBounds(400,100,100,50);
        c.add(btn3);
        btn3.setCursor(cur);
        btn3.addActionListener(this);

    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == btn1){
            c.setBackground(Color.RED);
        }else if(e.getSource() == btn2){
            c.setBackground(Color.YELLOW);
        }else if(e.getSource() == btn3){
            c.setBackground(Color.GREEN);
        }

    }
}
public class MyActionListner {
    public static void main(String[] args) {
        Myframe f = new Myframe();
        f.setTitle("Action Demo");
        f.setBounds(100,100,700,500);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}*/

/*
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyActionListner{
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setTitle("Anonymous inner class");
        f.setBounds(100,100,700,500);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = f.getContentPane();
        c.setLayout(null);

        JButton btn = new JButton("CLICK HERE");
        btn.setBounds(100,100,200,50);
        c.add(btn);

        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                c.setBackground(Color.MAGENTA);
            }
        });



    }
}*/

/*
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyActionListner{
    public static Container c;
    public static void main(String[] args) {
        JButton btn1;
        JButton btn2;
        JButton btn3;
        JFrame f = new JFrame();
        f.setTitle("Anonymous inner class");
        f.setBounds(100,100,700,500);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        c = f.getContentPane();
        c.setLayout(null);

        btn1 = new JButton("RED");
        btn1.setBounds(100,100,100,50);
        c.add(btn1);


        btn2 = new JButton("YELLOW");
        btn2.setBounds(250,100,100,50);
        c.add(btn2);


        btn3 = new JButton("GREEN");
        btn3.setBounds(400,100,100,50);
        c.add(btn3);

        btn1.addActionListener(new RedClass());
        btn3.addActionListener(new GreenClass());
        btn2.addActionListener(new YellowClass());


    }
}
class RedClass implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        MyActionListner.c.setBackground(Color.RED);

    }
}
class GreenClass implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        MyActionListner.c.setBackground(Color.GREEN);

    }
}
class YellowClass implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        MyActionListner.c.setBackground(Color.YELLOW);

    }
}*/


