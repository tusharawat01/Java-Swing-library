import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

class myframe5 extends JFrame implements MouseMotionListener{
    JLabel label;
    JTextArea ta;
    Container c;
    myframe5(){
        c=this.getContentPane();
        c.setLayout(null);

        label = new JLabel("My Label");
        label.setBounds(50,50,100,20);
        c.add(label);
        label.addMouseMotionListener(this);

        ta = new JTextArea("");
        ta.setBounds(100,50,500,300);
        c.add(ta);

    }
    @Override
    public void mouseDragged(MouseEvent e) {
        ta.setText(ta.getText()+"\n"+"Mouse is Dragged");

    }

    @Override
    public void mouseMoved(MouseEvent e) {
        ta.setText(ta.getText()+"\n"+"Mouse is moved");

    }
}
public class MyMouseMotionListner {
    public static void main(String[] args) {
        myframe5 f = new myframe5();
        f.setTitle("MouseMotionListener");
        f.setBounds(100,100,700,500);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);

    }
}
