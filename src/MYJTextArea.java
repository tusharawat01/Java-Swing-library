import javax.swing.*;
import java.awt.*;

public class MYJTextArea {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("MyTextArea");
        frame.setBounds(100,100,500,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = frame.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.black);

        JTextArea textArea = new JTextArea();
        textArea.setBounds(25,25,200,200);
        textArea.setLineWrap(true);
        c.add(textArea);

        frame.setVisible(true);
    }
}
