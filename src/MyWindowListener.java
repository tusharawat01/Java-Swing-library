import javax.swing.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

class myframe8 extends JFrame implements WindowListener{
    myframe8(){
        this.addWindowListener(this);

    }

    @Override
    public void windowOpened(WindowEvent e) {
        System.out.println("Window Opened");
    }

    @Override
    public void windowClosing(WindowEvent e) {
        System.out.println("Window Closing");

    }

    @Override
    public void windowClosed(WindowEvent e) {
        System.out.println("Window Closed");

    }

    @Override
    public void windowIconified(WindowEvent e) {
        System.out.println("Window Iconified");

    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        System.out.println("Window Deiconified");

    }

    @Override
    public void windowActivated(WindowEvent e) {
        System.out.println("Window Activated");

    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        System.out.println("Window Deactivated");

    }
}
public class MyWindowListener {
    public static void main(String[] args) {
    myframe8 f = new myframe8();
        f.setTitle("FocusListener");
        f.setBounds(100,100,700,500);
        f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        f.setVisible(true);
    }
}
