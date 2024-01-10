import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

class myframe4 extends JFrame implements MouseListener{
    JLabel label;
    JTextArea ta;
    Container c;
    myframe4(){
        c = this.getContentPane();
        c.setLayout(null);

        label = new JLabel("Click here");
        label.setBounds(50,50,100,20);
        c.add(label);
        label.addMouseListener(this);

        ta = new JTextArea("");
        ta.setBounds(150,50,300,150);
        c.add(ta);

    }

    @Override
    public void mouseClicked(MouseEvent e) {
        ta.setText(ta.getText()+"\n"+"Mouse is clicked");

    }

    @Override
    public void mousePressed(MouseEvent e) {
        ta.setText(ta.getText()+"\n"+"Mouse is pressed");

    }

    @Override
    public void mouseReleased(MouseEvent e) {
        ta.setText(ta.getText()+"\n"+"Mouse is released");

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        ta.setText(ta.getText()+"\n"+"Mouse is entered");

    }

    @Override
    public void mouseExited(MouseEvent e) {
        ta.setText(ta.getText()+"\n"+"Mouse is exited");

    }
}
public class MyMouseListner {
    public static void main(String[] args) {
        myframe4 f = new myframe4();
        f.setTitle("MouseListner");
        f.setBounds(50,50,700,400);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);


    }
}
