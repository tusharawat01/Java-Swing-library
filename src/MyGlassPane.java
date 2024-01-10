import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;

public class MyGlassPane {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Glass Pane Example");
        frame.setSize(400,400);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel =new JPanel();
        JLabel label = new JLabel("Glass Pane Example");
        JButton bt1 = new JButton("Click me");
        JButton bt2 = new JButton("Show");

        panel.add(label);
        panel.add(bt1);
        panel.add(bt2);
        frame.getContentPane().add(panel);

        bt1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setVisible(!label.isVisible());
            }
        });

        frame.setGlassPane(new JComponent() {
            @Override
            protected void paintComponent(Graphics g) {
                g.setColor(new Color(0,0,0,150));
                g.fillRect(0,0,getWidth(),getHeight());
            }
        });
        final Container glassPane = (Container) frame.getGlassPane();
        glassPane.setLayout(new GridLayout());

        JButton bt3 = new JButton("Hide");
        glassPane.add(bt3);

        glassPane.addMouseListener(new MouseAdapter() {});

        bt2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                glassPane.setVisible(true);
            }
        });

        bt3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                glassPane.setVisible(false);
            }
        });

        frame.setVisible(true);
    }
}
