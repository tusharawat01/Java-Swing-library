import javax.swing.*;
import java.awt.*;

public class MyJButton {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setVisible(true);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100,100,1000,500);

        Container c = frame.getContentPane();
        c.setLayout(null);

        ImageIcon icon = new ImageIcon("C:\\Users\\himan\\OneDrive\\Desktop\\download.jpg");


        JButton button = new JButton(icon);
        button.setBounds(100,50,120,30);
        c.add(button);

//        Font font = new Font("Arial",Font.BOLD,20);
//        button.setFont(font);
//
//        button.setText("Click");
//
//        button.setForeground(Color.black);
//        button.setBackground(Color.DARK_GRAY);

        Cursor cursor = new Cursor(Cursor.HAND_CURSOR);
        button.setCursor(cursor);
//
//        button.setEnabled(true);
//        button.setVisible(true);



    }
}
