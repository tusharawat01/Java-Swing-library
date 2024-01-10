import javax.swing.*;
import java.awt.*;

public class MyJComponent extends JComponent {
    @Override
    protected void paintComponent(Graphics g) {
        g.setColor(Color.blue);
        g.fillRect(10,10,200,200);
    }

    public static void main(String[] args) {
        JFrame f = new JFrame("Example");
        f.setSize(400,400);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);

        MyJComponent comp = new MyJComponent();
        f.getContentPane().add(comp);
    }
}
