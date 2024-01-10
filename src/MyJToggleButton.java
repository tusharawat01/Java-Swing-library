import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyJToggleButton extends JFrame implements ActionListener {
    private Color defaultColor;
    private JToggleButton toggle;
    Container c;
    MyJToggleButton(){


        setTitle("JEditorPane");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(100,100,700,500);

        c = getContentPane();
        c.setLayout(null);

        defaultColor = c.getBackground();


       toggle = new JToggleButton("OFF");
        toggle.setBounds(200,200,100,50);

        c.add(toggle);
        toggle.addActionListener(this);
        setVisible(true);

    }
    public static void main(String[] args) {
        new MyJToggleButton();

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(toggle.isSelected()){
            c.setBackground(Color.YELLOW);
            toggle.setText("ON");

        }else{
            c.setBackground(defaultColor);
            toggle.setText("OFF");
        }

    }
}
