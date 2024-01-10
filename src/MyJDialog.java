import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyJDialog implements ActionListener {
    JFrame frame;
    JPanel panel1,panel2,panel3;
    JButton button1,button2;
    JDialog jd1,jd2;
    MyJDialog(){
        frame = new JFrame("MYJDialog");
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
        new MyJDialog();
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("Click1")){
            showFirstDialog();
        }else if(e.getActionCommand().equals("Click2")){
            showSecondDialog();
        }

    }
    private void showFirstDialog(){
        jd1 = new JDialog(frame,"JDialog1");
        jd1.setSize(200,200);
        jd1.setVisible(true);

        panel2 = new JPanel();
        jd1.add(panel2);

        button2 = new JButton("Click2");
        button2.addActionListener(this);
        panel2.add(button2);

    }
    private void showSecondDialog() {
        jd2 = new JDialog(frame, "JDialog2");
        jd2.setSize(200, 200);
        jd2.setVisible(true);
    }

}
