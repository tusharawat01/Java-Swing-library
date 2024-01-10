import javax.swing.*;
import java.awt.*;

public class jframe {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setSize(500,500);
//        frame.setLocation(400,100);
        frame.setBounds(400,100,500,500);
        frame.setTitle("My JFrame");

        Container c = frame.getContentPane();
        c.setBackground(Color.RED);

        frame.setResizable(false);
    }
}
