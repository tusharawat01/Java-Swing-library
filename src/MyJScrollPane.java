import javax.swing.*;
import java.awt.*;

public class MyJScrollPane {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("MyTextArea");
        frame.setBounds(100,100,700,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setLayout(new FlowLayout());


        JTextArea textArea = new JTextArea(10,15);



        JScrollPane js = new JScrollPane(textArea,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);

        frame.add(js);

        frame.setVisible(true);
    }
}
