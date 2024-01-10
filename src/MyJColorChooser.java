import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyJColorChooser {
    public static void main(String[] args) {


        JFrame frame = new JFrame("JCOLOR CHOOSER");
        frame.setSize(400,400);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        Container c = frame.getContentPane();
        c.setLayout(new GridLayout());

        JButton bt1 = new JButton("Change ");
        c.add(bt1);

        bt1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                 Color color = JColorChooser.showDialog(null,"SELECT A COLOR",Color.BLACK);
                c.setBackground(color);
            }
        });

        frame.revalidate();
        frame.setVisible(true);

    }
}
