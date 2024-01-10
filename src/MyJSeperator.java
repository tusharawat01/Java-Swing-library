import javax.swing.*;
import java.awt.*;

public class MyJSeperator extends JFrame {
    MyJSeperator(){
        setSize(400,400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);


        JPanel panel1 = new JPanel();
        panel1.setLayout(new GridLayout(0,1));

        panel1.add(new JLabel("My First Label"));
        panel1.add(new JSeparator());
        panel1.add(new JLabel("My Second Label"));

        add(panel1);

        JMenuBar menubar = new JMenuBar();
        add(menubar,BorderLayout.PAGE_START);

        JMenu file = new JMenu("File");
        JMenu edit = new JMenu("Edit");

        JMenuItem m1 = new JMenuItem("new");
        JMenuItem m2 = new JMenuItem("copy");
        JMenuItem m3 = new JMenuItem("paste");
        JMenuItem m4 = new JMenuItem("cut");
        JMenuItem m5 = new JMenuItem("delete");

        file.add(m1);
        file.add(new JSeparator());
        file.add(m2);
        file.add(m3);

        edit.add(m4);
        edit.addSeparator();
        edit.add(m5);

        menubar.add(file);
        menubar.add(edit);


        setVisible(true);
    }
    public static void main(String[] args) {
        MyJSeperator js = new MyJSeperator();

    }
}
