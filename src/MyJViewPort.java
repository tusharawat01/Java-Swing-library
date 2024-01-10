import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyJViewPort {
    public static void main(String[] args) {
        JFrame f = new JFrame("Tree Example");
        f.setSize(200,200);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null);

        ImageIcon icon = new ImageIcon("C:\\Users\\himan\\OneDrive\\Desktop\\download.jpg");
        JLabel label = new JLabel(icon);
        JScrollPane scroll = new JScrollPane(label);
        scroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_NEVER);

        JViewport viewport =scroll.getViewport();
        JButton up = new JButton("Move UP");
        JButton down = new JButton("Move Down");
        JButton left = new JButton("Move Left");
        JButton right = new JButton("Move Right");

        JPanel panel = new JPanel();
        panel.add(up);
        panel.add(down);
        panel.add(left);
        panel.add(right);
        f.add(panel, BorderLayout.NORTH);

        up.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Point origin = viewport.getViewPosition();
                Point newOrigin = new Point(origin.x,origin.y+10);
                viewport.setViewPosition(newOrigin);
            }
        });
        down.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Point origin = viewport.getViewPosition();
                Point newOrigin = new Point(origin.x,origin.y-10);
                viewport.setViewPosition(newOrigin);
            }
        });
        left.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Point origin = viewport.getViewPosition();
                Point newOrigin = new Point(origin.x-10,origin.y);
                viewport.setViewPosition(newOrigin);
            }
        });
        right.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Point origin = viewport.getViewPosition();
                Point newOrigin = new Point(origin.x+10,origin.y);
                viewport.setViewPosition(newOrigin);
            }
        });

        f.add(scroll);
        f.setVisible(true);

    }
}
