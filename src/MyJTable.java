/*
import javax.swing.*;
import java.awt.*;

public class MyJTable {
    public static void main(String[] args) {


        JFrame f = new JFrame("JTable");
        f.setBounds(100,100,700,500);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        String[][] data = {{"001","RAM","21"},
                {"002","SHYAM","18"},
                {"003","RAJU","23"}};

        String[] columnName ={"Roll No.","Name","Age"};


        JTable table = new JTable(data,columnName);

        f.add(new JScrollPane(table));



        f.setVisible(true);
    }

}
*/


/*
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class MyJTable {
    public static void main(String[] args) {


        JFrame f = new JFrame("JTable");
        f.setBounds(100,100,700,500);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        String[][] data = {{"001","RAM","21"},
                {"002","SHYAM","18"},
                {"003","RAJU","23"}};

        String[] columnName ={"Roll No.","Name","Age"};

        DefaultTableModel tableModel = new DefaultTableModel(data,columnName);


        JTable table = new JTable(tableModel);

        f.add(new JScrollPane(table));



        f.setVisible(true);
    }

}
*/

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MyJTable {
    public static void main(String[] args) {


        JFrame f = new JFrame("JTable");
        f.setBounds(100,100,700,500);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        String[][] data = {{"001","RAM","21"},
                {"002","SHYAM","18"},
                {"003","RAJU","23"}};

        String[] columnName ={"Roll No.","Name","Age"};

        DefaultTableModel tableModel = new DefaultTableModel(data,columnName);


        JTable table = new JTable(tableModel);

       f.setLayout(new GridLayout(3,1));

       JPanel panel1 = new JPanel();
       f.add(new JScrollPane(table));
       f.add(new JPanel());
       f.add(panel1);

       JTextField tf1 = new JTextField();
       JTextField tf2 = new JTextField();
       JTextField tf3 = new JTextField();

       JButton bt1 = new JButton("Add");
       JButton bt2 = new JButton("Update");
       JButton bt3 = new JButton("Delete");

       panel1.setLayout(new GridLayout(3,3));
       panel1.add(new JLabel("ROLL NO."));
       panel1.add(tf1);
       panel1.add(bt1);

        panel1.add(new JLabel("NAME"));
        panel1.add(tf2);
        panel1.add(bt2);

        panel1.add(new JLabel("AGE"));
        panel1.add(tf3);
        panel1.add(bt3);


        bt1.addActionListener(e -> {
            if(tf1.getText().isEmpty() || tf2.getText().isEmpty() || tf3.getText().isEmpty()){
                JOptionPane.showMessageDialog(null,"Please fill all the Fields","Error",JOptionPane.ERROR_MESSAGE);

            }else{
            int roll_no = Integer.parseInt(tf1.getText());
            String name = tf2.getText();
            int age = Integer.parseInt(tf3.getText());

            Object[] newRow = {roll_no,name,age};

            tableModel.addRow(newRow);

            tf1.setText("");
            tf2.setText("");
            tf3.setText("");
        }});
        f.setVisible(true);

        table.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int rowIndex = table.getSelectedRow();

                int rollno = (int)table.getValueAt(rowIndex,0);
                String name = (String)table.getValueAt(rowIndex,1);
                int age = (int)table.getValueAt(rowIndex,2);

                tf1.setText(String.valueOf(rollno));
                tf2.setText(name);
                tf3.setText(String.valueOf(age));
            }
        });
        bt2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(tf1.getText().isEmpty() || tf2.getText().isEmpty() || tf3.getText().isEmpty()){
                    JOptionPane.showMessageDialog(null,"Please fill all the Fields","Error",JOptionPane.ERROR_MESSAGE);

                }else{
                    int roll_no = Integer.parseInt(tf1.getText());
                    String name = tf2.getText();
                    int age = Integer.parseInt(tf3.getText());

                    int row = table.getSelectedRow();


                    tableModel.setValueAt(roll_no,row,0);
                    tableModel.setValueAt(name,row,1);
                    tableModel.setValueAt(age,row,2);

                    tf1.setText("");
                    tf2.setText("");
                    tf3.setText("");
                }
            }
        });

        bt3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if(table.getSelectedRow() == -1){
                    JOptionPane.showMessageDialog(null,"Please select the row first","Error",JOptionPane.ERROR_MESSAGE);


                } else{
                   int selection = JOptionPane.showConfirmDialog(null,"Are you sure","DELETE ROW",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.WARNING_MESSAGE);

                   if(selection == JOptionPane.YES_OPTION){
                  tableModel.removeRow(table.getSelectedRow());
                       tf1.setText("");
                       tf2.setText("");
                       tf3.setText("");
                   }
                   else if(selection == JOptionPane.NO_OPTION){
                       tf1.setText("");
                       tf2.setText("");
                       tf3.setText("");

                   }
                   else if(selection == JOptionPane.CANCEL_OPTION){
                       System.exit(0);
                       tf1.setText("");
                       tf2.setText("");
                       tf3.setText("");
                   }
                }
            }
        });

        table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        f.setVisible(true);
    }

}
