import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class MyJSlider extends JFrame implements ChangeListener {
    JSlider s;
    JLabel label = new JLabel();
    MyJSlider(){
        setSize(500,400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);

        s= new JSlider();
        s.setBounds(100,100,300,50);
        s.setMinimum(0);
        s.setMaximum(300);

        s.setPaintTicks(true);
        s.setPaintLabels(true);

        s.setMajorTickSpacing(50);
        s.setMinorTickSpacing(5);
        s.addChangeListener(this);

        label.setBounds(100,150,200,20);
        label.setText("The value of Slider is : "+s.getValue());
        add(label);




        add(s);

        setVisible(true);


    }

    public static void main(String[] args) {
        new MyJSlider();
    }

    @Override
    public void stateChanged(ChangeEvent e) {
        label.setText("The value of Slider is : "+s.getValue());

    }
}
