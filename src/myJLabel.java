import javax.swing.*;
import java.awt.*;

public class myJLabel {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setVisible(true);

        frame.setBounds(100,50,500,500);
        frame.setTitle("JLabel");

        Container c = frame.getContentPane();
        c.setLayout(null);

//        JLabel label = new JLabel("User Name");
//        c.add(label);
//        label.setBounds(0,0,100,50);
//
//        label.setText("Password");
//        Font font = new Font("Arial",Font.PLAIN,15);
//        label.setFont(font);

        ImageIcon icon = new ImageIcon("C:\\Users\\himan\\OneDrive\\Desktop\\download.jpg");
        JLabel label = new JLabel("Icon",icon, JLabel.CENTER);

        label.setBounds(0,0,600,600);
        c.add(label);

    }
}
