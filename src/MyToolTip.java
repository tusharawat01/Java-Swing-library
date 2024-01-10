import javax.swing.*;

public class MyToolTip extends JFrame {
    JLabel label;
    JPasswordField pf;
    MyToolTip(){
        setTitle("JToolTip");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(100,100,700,500);
        setLayout(null);

        label = new JLabel("Password");
        label.setBounds(100,100,100,20);
        add(label);

        pf = new JPasswordField();
        pf.setBounds(200,100,100,20);
        add(pf);

        String str = "<html>"+"Enter your Password<br/>"+"Special character not allowed"+"</html>";

        pf.setToolTipText(str);

        setVisible(true);

    }

    public static void main(String[] args) {
        new MyToolTip();
    }
}
