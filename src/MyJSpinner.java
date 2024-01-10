import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;


public class MyJSpinner extends JFrame implements ChangeListener {
    JSpinner s1,s2,s3;
    SpinnerModel sm1,sm2,sm3;
    JLabel label1 = new JLabel();
    String[] month = {"JAN","FEB","MAR","APR","MAY","JUN","JUL","AUG","SEP","OCT","NOV","DEC"};
    public MyJSpinner(){
        setSize(700,500);
        setTitle("JSpinner");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        String year = String.valueOf(java.time.Year.now());
        int y = Integer.parseInt(year);

        sm1 = new SpinnerNumberModel(1,1,31,1);
        sm2 = new SpinnerListModel(month);
        sm3 = new SpinnerNumberModel(y,y-100,y,1);

        s1 = new JSpinner(sm1);
        s2 = new JSpinner(sm2);
        s3 = new JSpinner(sm3);

        s1.addChangeListener(this);
        s2.addChangeListener(this);
        s3.addChangeListener(this);

        s1.setBounds(100,20,100,50);
        s2.setBounds(100,100,100,50);
        s3.setBounds(100,200,100,50);



        add(s1);
        add(s2);
        add(s3);

        setDOB();

        label1.setBounds(100,300,200,50);
        add(label1);



        setVisible(true);



    }

    public static void main(String[] args) {
        new MyJSpinner();
    }
    public void setDOB(){
        int date = (Integer) s1.getValue();
        int year = (Integer) s3.getValue();
        String month = (String) s2.getValue();

        label1.setText(" DOB is : "+date+"-"+month+"-"+year);

    }

    @Override
    public void stateChanged(ChangeEvent e) {
        setDOB();
    }
}
