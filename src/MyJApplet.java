import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyJApplet extends JApplet {
    JTextField tf;
    JButton bt;
    public void init(){
        setLayout(null);
        tf = new JTextField("");
        bt = new JButton("Press me");

        tf.setBounds(20,20,100,30);
        bt.setBounds(20,60,100,20);

        add(tf);
        add(bt);
        bt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tf.setText("BooM!!!");

            }
        });
    }


}
