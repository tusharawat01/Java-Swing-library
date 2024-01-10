import javax.swing.*;
import java.awt.*;

public class MyJToolBar {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Tool Bar");
        frame.setSize(600,400);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JToolBar toolbar = new JToolBar();
        JButton button1= new JButton("b1");
        JButton button2= new JButton("b2");
        JTextField tf = new JTextField("");
        String[] str = {"item1","item2","item3","item4"};
        JComboBox cb = new JComboBox(str);

        toolbar.add(cb);
        toolbar.add(tf);
        toolbar.add(button1);
        toolbar.addSeparator();
        toolbar.add(button2);

        frame.add(BorderLayout.NORTH,toolbar);



        frame.setVisible(true);



    }
}
