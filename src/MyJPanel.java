import javax.swing.*;
import java.awt.*;

public class MyJPanel {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setTitle("JPanel");
        f.setBounds(100,100,700,500);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = f.getContentPane();
        c.setLayout(null);

        JPanel j1 = new JPanel();
        j1.setBounds(0,0,300,300);
        j1.setBackground(Color.DARK_GRAY);
        j1.setLayout(null);
        c.add(j1);

        JPanel j2 = new JPanel();
        j2.setBounds(0,0,200,200);
        j2.setBackground(Color.RED);
        j1.add(j2);

        JButton jb = new JButton("BUTTON");
        j2.add(jb);



        f.setVisible(true);
    }
}
