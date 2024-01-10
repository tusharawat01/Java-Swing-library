import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

class myframe3 extends JFrame implements KeyListener{
    JTextArea t1;
    Container c;
    myframe3(){
        c = this.getContentPane();
        c.setLayout(null);

        t1 = new JTextArea("");
        t1.setBounds(100,50,300,200);
        c.add(t1);
        t1.addKeyListener(this);


    }
    @Override
    public void keyTyped(KeyEvent e) {
        t1.setText(t1.getText()+"\n"+e.getKeyChar()+" Key is typed");

    }

    @Override
    public void keyPressed(KeyEvent e) {
        t1.setText(t1.getText()+"\n"+e.getKeyChar()+" Key is pressed");

    }

    @Override
    public void keyReleased(KeyEvent e) {
        t1.setText(t1.getText()+"\n"+e.getKeyChar()+" Key is released");

    }
}
public class MyKeyListner {
    public static void main(String[] args) {
        myframe3 f= new myframe3();
        f.setTitle("KeyListner");
        f.setBounds(100,100,700,500);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);

    }
}
