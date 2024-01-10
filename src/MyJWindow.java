import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MyJWindow implements ActionListener {
    JFrame frame;
    JPanel panel1;
    JButton button1;
    MyJWindow(){
        frame = new JFrame("MyJWindow");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100,100,700,500);

        panel1 = new JPanel();
        frame.add(panel1);

        button1 = new JButton("Click1");
        panel1.add(button1);

        button1.addActionListener(this);



        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new MyJWindow();

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JWindow w = new JWindow();
        w.setSize(300,200);
        w.setLocationRelativeTo(null);
        w.setVisible(true);

        JPanel panel2 = new JPanel();
        panel2.setBackground(Color.YELLOW);
        panel2.setBorder(BorderFactory.createLineBorder(Color.BLACK));

        panel2.add(new JLabel("This is a window"));
        w.add(panel2);

        w.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if(e.getClickCount() ==2){
                    w.dispose();
                }
            }
        });


    }
}

