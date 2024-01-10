import javax.swing.*;
import java.awt.*;

public class MyJRadioButton {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setBounds(100,100,500,300);
        f.setTitle("JRadioButton");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = f.getContentPane();
        c.setLayout(null);

        JRadioButton radio1 = new JRadioButton("male");
        radio1.setBounds(100,50,100,20);
        c.add(radio1);
        radio1.setSelected(true);

        JRadioButton radio2 = new JRadioButton("female");
        radio2.setBounds(200,50,100,20);
        c.add(radio2);

        ButtonGroup gender = new ButtonGroup();
        gender.add(radio1);
        gender.add(radio2);

        JRadioButton gen = new JRadioButton("General");
        JRadioButton st = new JRadioButton("ST");
        JRadioButton sc = new JRadioButton("SC");
        JRadioButton obc = new JRadioButton("OBC");

        gen.setBounds(100,100,100,20);
        st.setBounds(200,100,100,20);
        sc.setBounds(300,100,100,20);
        obc.setBounds(400,100,100,20);

        c.add(gen);
        c.add(st);
        c.add(sc);
        c.add(obc);

        gen.setSelected(true);
        obc.setEnabled(false);

        ButtonGroup caste = new ButtonGroup();
        caste.add(gen);
        caste.add(st);
        caste.add(sc);
        caste.add(obc);



        f.setVisible(true);



    }
}
