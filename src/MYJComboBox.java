import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MYJComboBox  {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("JComboBox");
        frame.setBounds(100,100,700,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = frame.getContentPane();
        c.setLayout(null);

        String[] values = {"A","B","C","D","E"};
        JComboBox c1 = new JComboBox(values);
        c1.setBounds(100,100,100,30);
        c.add(c1);

//        c1.setEditable(true);
//        c1.setSelectedItem("B");

//        c1.setSelectedIndex(2);

        JButton btn = new JButton("Ok");
        btn.setBounds(300,100,100,20);
        c.add(btn);

        JLabel label = new JLabel("");
        label.setBounds(100,300,100,20);
        c.add(label);

        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                String item =(String)c1.getSelectedItem();
                String item = String.valueOf(c1.getSelectedIndex());
                label.setText(item);
            }
        });

        c1.addItem("F");
        c1.removeItem("B");

        frame.setVisible(true);
    }
}
