/*import javax.swing.*;
import java.awt.*;

public class MyJList {
    public static void main(String[] args) {
        JFrame frame = new JFrame("J LIST");
        frame.setSize(600,400);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        String[] items ={"i1","i2","i3","i4","i5","i6","i7","i8","19","i10","i11"} ;


        JList list = new JList(items);
        list.setVisibleRowCount(5);

        JPanel panel = new JPanel();
        panel.add(new JScrollPane(list));

        frame.add(panel);


        frame.setVisible(true);

    }
}*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MyJList {

    public static void main(String[] args) {


        JFrame frame = new JFrame("J LIST");
        frame.setSize(600,400);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setLayout(new GridLayout(1,2));

        JList list = new JList();
        JPanel panel = new JPanel();
        panel.add(new JScrollPane(list));
        frame.add(panel);

        DefaultListModel model = new DefaultListModel();
        model.addElement("i1");
        model.addElement("i2");


        list.setModel(model);

        JTextField tf = new JTextField(20);
        JButton bt1 = new JButton("ADD");
        JButton bt2 = new JButton("UPDATE");
        JButton bt3 = new JButton("DELETE");

        JPanel panel2 = new JPanel();

        panel2.add(tf);
        panel2.add(bt1);
        panel2.add(bt2);
        panel2.add(bt3);
        frame.add(panel2);

        bt1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = tf.getText().toString();
                if(text.isEmpty()){
                    JOptionPane.showMessageDialog(panel2,"PLEASE ENTER SOMETHING TO ADD",null,JOptionPane.ERROR_MESSAGE);
                }else{
                model.addElement(text);

                tf.setText("");
                }
            }
        });

        list.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if(e.getClickCount()==2){
                int a = list.getSelectedIndex();
                tf.setText((String)model.get(a));
                }
            }
        });

        bt2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int a = list.getSelectedIndex();

                String text = tf.getText().toString();
                if(text.isEmpty()){
                    JOptionPane.showMessageDialog(panel2,"PLEASE ENTER SOMETHING TO UPDATE",null,JOptionPane.ERROR_MESSAGE);
                }else{
                    model.set(a,text);

                    tf.setText("");
                }


            }
        });

        bt3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int a = list.getSelectedIndex();
                String text = tf.getText().toString();
                if(text.isEmpty()){
                    JOptionPane.showMessageDialog(panel2,"PLEASE SELECT SOMETHING TO DELETE",null,JOptionPane.ERROR_MESSAGE);
                }else{
                    int sel = JOptionPane.showConfirmDialog(panel2,"Are you Sure","WARNING",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.WARNING_MESSAGE);
                    if(sel == JOptionPane.YES_OPTION) {

                        model.remove(a);

                        tf.setText("");
                    }else if(sel == JOptionPane.NO_OPTION){
                        tf.setText("");

                    }
                    
                }

            }
        });



        frame.setVisible(true);

    }
}