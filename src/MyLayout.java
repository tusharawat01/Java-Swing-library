/*import javax.swing.*;
import java.awt.*;

class nullLayout extends JFrame{
    nullLayout(){
        Container c =this.getContentPane();
        c.setLayout(null);

        JButton jb1 = new JButton("button1");
        JButton jb2 = new JButton("button2");
        JButton jb3 = new JButton("button3");
        JButton jb4 = new JButton("button4");
        JButton jb5 = new JButton("button5");

        jb1.setBounds(50,50,100,20);
        jb2.setBounds(150,50,100,20);
        jb3.setBounds(250,50,100,20);
        jb4.setBounds(50,150,100,20);
        jb5.setBounds(150,150,100,20);

        c.add(jb1);
        c.add(jb2);
        c.add(jb3);
        c.add(jb4);
        c.add(jb5);
    }
}
public class MyLayout {
    public static void main(String[] args) {
        nullLayout nl = new nullLayout();
        nl.setTitle("Null Layout");
        nl.setBounds(100,100,700,500);
        nl.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        nl.setVisible(true);

    }
}*/

/*
import javax.swing.*;
import java.awt.*;

class borderLayout extends JFrame{
    borderLayout(){
        Container c =this.getContentPane();

        BorderLayout bl = new BorderLayout(10,5);
        c.setLayout(bl);

        JButton jb1 = new JButton("Start");
        JButton jb2 = new JButton("end");
        JButton jb3 = new JButton("left");
        JButton jb4 = new JButton("right");
        JButton jb5 = new JButton("center");


        c.add(jb1,BorderLayout.NORTH);
        c.add(jb2,BorderLayout.SOUTH);
        c.add(jb3,BorderLayout.WEST);
        c.add(jb4,BorderLayout.EAST);
        c.add(jb5,BorderLayout.CENTER);
    }
}
public class MyLayout {
    public static void main(String[] args) {
        borderLayout bl = new borderLayout();
        bl.setTitle("Null Layout");
        bl.setBounds(100,100,700,500);
        bl.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        bl.setVisible(true);

    }
}*/

/*
import javax.swing.*;
import java.awt.*;

class flowLayout extends JFrame{
    flowLayout(){
        Container c =this.getContentPane();

        FlowLayout fl = new FlowLayout(FlowLayout.LEFT,10,5);
        fl.set
        c.setLayout(fl);

        JButton jb1 = new JButton("Start");
        JButton jb2 = new JButton("end");
        JButton jb3 = new JButton("left");
        JButton jb4 = new JButton("right");
        JButton jb5 = new JButton("center");


        c.add(jb1);
        c.add(jb2,1);
        c.add(jb3,0);
        c.add(jb4);
        c.add(jb5);
    }
}
public class MyLayout {
    public static void main(String[] args) {
        flowLayout fl = new flowLayout();
        fl.setTitle("Null Layout");
        fl.setBounds(100,100,700,500);
        fl.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        fl.setVisible(true);

    }
}*/

/*
import javax.swing.*;
import java.awt.*;

class gridLayot extends JFrame{
    gridLayot(){
        Container c =this.getContentPane();

        GridLayout gl = new GridLayout(3,2);
        gl.setHgap(10);
        gl.setVgap(5);
        
        c.setLayout(gl);

        JButton jb1 = new JButton("Start");
        JButton jb2 = new JButton("end");
        JButton jb3 = new JButton("left");
        JButton jb4 = new JButton("right");
        JButton jb5 = new JButton("center");


        c.add(jb1);
        c.add(jb2,1);
        c.add(jb3,0);
        c.add(jb4);
        c.add(jb5);
    }
}
public class MyLayout {
    public static void main(String[] args) {
        gridLayot gl = new gridLayot();
        gl.setTitle("Null Layout");
        gl.setBounds(100,100,700,500);
        gl.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        gl.setVisible(true);

    }
}*/

/*
import javax.swing.*;
import java.awt.*;

class gridBagLayot extends JFrame{
    JButton jb1 = new JButton("Start");
    JButton jb2 = new JButton("end");
    JButton jb3 = new JButton("left");
    JButton jb4 = new JButton("right");
    JButton jb5 = new JButton("center");
    gridBagLayot(){
        Container c =this.getContentPane();


        GridBagLayout gbl = new GridBagLayout();

        c.setLayout(gbl);

        GridBagConstraints gbc = new GridBagConstraints();


        gbc.gridx = 0;
        gbc.gridy = 0;
        c.add(jb1,gbc);

        gbc.gridx = 1;
        gbc.gridy = 0;
        c.add(jb2,gbc);

        gbc.gridx = 2;
        gbc.gridy = 0;
        c.add(jb3,gbc);

        pack();

    }
}
public class MyLayout {
    public static void main(String[] args) {
        gridBagLayot gl = new gridBagLayot();
        gl.setTitle("Null Layout");
        gl.setBounds(100,100,700,500);
        gl.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        gl.setVisible(true);

    }
}*/

/*
import javax.swing.*;
import java.awt.*;

public class MyLayout {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setTitle("CARD LAYOUT");
        f.setBounds(100,100,700,500);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);

        Container c = f.getContentPane();
        CardLayout cl = new CardLayout();
        c.setLayout(cl);

        JButton button1 = new JButton("Card1");
        JButton button2 = new JButton("Card2");
        JButton button3 = new JButton("Card3");
        JButton button4 = new JButton("Card4");
        JButton button5 = new JButton("Card5");

        c.add(button1,"1");
        c.add(button2,"2");
        c.add(button3,"3");
        c.add(button4,"4");
        c.add(button5,"5");

        //cl.next(c);
//        cl.last(c);
//        cl.previous(c);
//        cl.first(c);

        cl.show(c,"3");

    }
}
*/

import javax.swing.*;
import java.awt.*;

public class MyLayout {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setTitle("BOX LAYOUT");
        f.setBounds(100,100,700,500);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        Container c = f.getContentPane();
        BoxLayout bl = new BoxLayout(c,BoxLayout.Y_AXIS);
        c.setLayout(bl);

        JButton button1 = new JButton("Card1");
        JButton button2 = new JButton("Card2");
        JButton button3 = new JButton("Card3");
        JButton button4 = new JButton("Card4");
        JButton button5 = new JButton("Card5");

        button1.setAlignmentX(c.CENTER_ALIGNMENT);



        c.add(button1);
        c.add(Box.createRigidArea(new Dimension(0,10)));
        c.add(button2);
        c.add(button3);
        c.add(button4);
        c.add(button5);
        f.setVisible(true);

    }
}

