import javax.swing.*;
import java.awt.*;

public class MyJLayeredPane extends JFrame {
    MyJLayeredPane(){
        JLayeredPane pane = this.getLayeredPane();

        JButton bt1 = new JButton("RED");
        bt1.setBackground(Color.RED);
        bt1.setBounds(20,20,50,50);

        JButton bt2 = new JButton("GREEN");
        bt2.setBackground(Color.GREEN);
        bt2.setBounds(40,40,50,50);

        JButton bt3 = new JButton("BLUE");
        bt3.setBackground(Color.BLUE);
    bt3.setBounds(60,60,50,50);

        pane.add(bt1,new Integer(10));
        pane.add(bt2,new Integer(20));
        pane.add(bt3,new Integer(30));

    }
    public static void main(String[] args) {
        MyJLayeredPane frame =new MyJLayeredPane();
        frame.setSize(400,400);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }
}
