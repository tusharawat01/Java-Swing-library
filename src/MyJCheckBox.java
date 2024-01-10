import javax.swing.*;
import java.awt.*;

public class MyJCheckBox {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("JCheckBox");
        frame.setBounds(100,100,500,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = frame.getContentPane();
        c.setLayout(null);

        JCheckBox c1 = new JCheckBox("High School");
        JCheckBox c2 = new JCheckBox("Intermidiate");
        JCheckBox c3 = new JCheckBox("Graduation");
        JCheckBox c4 = new JCheckBox("Post Graduation");

        c1.setBounds(50,50,100,20);
        c2.setBounds(50,75,100,20);
        c3.setBounds(50,100,100,20);
        c4.setBounds(50,125,100,20);


        c.add(c1);
        c.add(c2);
        c.add(c3);
        c.add(c4);

        ButtonGroup education = new ButtonGroup();
        education.add(c1);
        education.add(c2);
        education.add(c3);
        education.add(c4);

        c1.setSelected(true);
        c4.setEnabled(false);

        frame.setVisible(true);

    }
}
