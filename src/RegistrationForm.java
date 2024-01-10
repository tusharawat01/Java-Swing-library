import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Frame extends JFrame implements ActionListener{
    JLabel label1,label2,label3,label4,label5,rs;
    JTextField name,mobile;
    JTextArea address,screen;
    JRadioButton male,female;
    JCheckBox terms;
    JButton submit;
    JComboBox day,month,year;
    Container c;

    Frame(){
        setTitle("Registration Form");
        setSize(700,500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        c=getContentPane();
        c.setLayout(null);
        c.setBackground(Color.CYAN);

        label1 = new JLabel("Name");
        label1.setBounds(20,50,100,20);

        label2 = new JLabel("Mobile");
        label2.setBounds(20,100,100,20);

        label3 = new JLabel("Gender");
        label3.setBounds(20,150,100,20);

        label4 = new JLabel("DOB");
        label4.setBounds(20,200,100,20);

        label5 = new JLabel("Address");
        label5.setBounds(20,250,100,20);

        Font font = new Font("Arial",Font.BOLD,15);

        rs = new JLabel("");
        rs.setBounds(50,400,300,20);
        rs.setFont(font);
        c.add(rs);

        c.add(label1);
        c.add(label2);
        c.add(label3);
        c.add(label4);
        c.add(label5);

        name = new JTextField();
        name.setBounds(100,50,100,20);

        mobile = new JTextField();
        mobile.setBounds(100,100,100,20);

        c.add(name);
        c.add(mobile);

        male = new JRadioButton("Male");
        male.setBounds(100,150,100,20);
        male.setSelected(true);

        female = new JRadioButton("Female");
        female.setBounds(200,150,100,20);

        c.add(male);
        c.add(female);

        ButtonGroup gender = new ButtonGroup();
        gender.add(male);
        gender.add(female);

        String[] Day = {"1","2","3","4","5","6","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21",
                        "22","23","24","25","26","27","28","29","30","31"};
        String[] Month ={"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
        String[] Year ={"2023","2022","2021","2020","2019","2018","2017","2016","2015","2014","2013","2012","2011","2010",
                        "2009","2008","2007","2006","2005","2004","2003","2002","2001","2000","1999","1998"};

        day = new JComboBox(Day);
        day.setBounds(100,200,100,20);

        month = new JComboBox(Month);
        month.setBounds(200,200,100,20);

        year = new JComboBox(Year);
        year.setBounds(300,200,100,20);

        c.add(day);
        c.add(month);
        c.add(year);

        address =  new JTextArea();
        address.setBounds(100,250,300,50);
        c.add(address);

        screen = new JTextArea();
        screen.setBounds(420,50,250,300);
        c.add(screen);


        terms = new JCheckBox("Please accept term and condition");
        terms.setBounds(75,320,300,20);
        c.add(terms);

        submit = new JButton("Submit");
        submit.setBounds(125,350,100,20);
        c.add(submit);

        submit.addActionListener(this);


        setVisible(true);

    }
    public void actionPerformed(ActionEvent e){
        if(terms.isSelected()){
            rs.setForeground(Color.BLACK);
            rs.setText("Registration Sucessfully");
            String Name = name.getText();
            String Mobile = mobile.getText();
            String Gender = "Male";
            if(female.isSelected()){
                Gender = "female";
            }
            String Dob = day.getSelectedItem()+"-"+month.getSelectedItem()+"-"+year.getSelectedItem();
            String Address = address.getText();

            screen.setText("Name :   "+Name+"\n"+"Mobile :   "+Mobile+"\n"+"Gender :   "+
                    Gender+"\n"+"Date Of Birth :   "+Dob+"\n" +"Address :  "+ Address);
        }else{
            rs.setText("Please accept terms and conditions");
            rs.setForeground(Color.RED);
        }

    }
}
public class RegistrationForm {
    public static void main(String[] args) {
        Frame f = new Frame();

    }
}
