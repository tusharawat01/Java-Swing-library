import javax.swing.*;
import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

class myframe6 extends JFrame implements FocusListener{
     JTextField tf;
     JTextArea ta;
     Container c;
    myframe6(){
        c=this.getContentPane();
        c.setLayout(null);

        tf = new JTextField("My label");
        tf.setBounds(50,50,100,20);
        c.add(tf);
        tf.addFocusListener(this);

        ta = new JTextArea("");
        ta.setBounds(150,50,300,150);
        c.add(ta);

    }
    @Override
    public void focusGained(FocusEvent e) {
        ta.setText(ta.getText()+"\n"+"focus gained");

    }

    @Override
    public void focusLost(FocusEvent e) {
        ta.setText(ta.getText()+"\n"+"focus lost");

    }
}
public class MyFocusListener {
    public static void main(String[] args) {
        myframe6 f = new myframe6();
        f.setTitle("FocusListener");
        f.setBounds(100,100,700,500);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        f.setVisible(true);
    }
}
