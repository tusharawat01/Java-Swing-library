import javax.swing.*;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;
import java.awt.*;
import java.awt.event.FocusListener;

class myframe7 extends JFrame implements CaretListener {
    JTextField tf;
    JTextArea ta;
    Container c;
    myframe7(){
        c=this.getContentPane();
        c.setLayout(null);

        tf = new JTextField();
        tf.setBounds(50,50,100,20);
        c.add(tf);
        tf.addCaretListener(this);

        ta = new JTextArea("");
        ta.setBounds(150,50,300,150);
        c.add(ta);

    }

    @Override
    public void caretUpdate(CaretEvent e) {
        ta.setText(ta.getText()+"\n"+"Caret Updated : "+e.getDot()+" : "+e.getMark()+" : " +e.getClass());

    }
}
public class MyCaretListener {
    public static void main(String[] args) {
        myframe7 f = new myframe7();
        f.setTitle("FocusListener");
        f.setBounds(100,100,700,500);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        f.setVisible(true);
    }
}
