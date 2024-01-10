import javax.swing.*;
import java.awt.*;

public class MyTextField {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setVisible(true);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100,100,1000,500);

        Container c = frame.getContentPane();
        c.setLayout(null);

        JTextField jtf = new JTextField();
        jtf.setBounds(100,50,120,30);
        c.add(jtf);

        jtf.setText("mukul saini");

        Font font = new Font("",Font.BOLD,20);
        jtf.setFont(font);

        jtf.setForeground(Color.GREEN);
        jtf.setBackground(Color.YELLOW);

        jtf.setEditable(false);
    }
}
