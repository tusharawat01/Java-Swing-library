import javax.swing.*;
import java.awt.*;

public class MyJInternalFrame extends JFrame {
    MyJInternalFrame(){
        setLayout(null);

        JInternalFrame iframe = new JInternalFrame("My Internal Frame",true,true,true,true);
        initFrame(iframe);
        add(iframe);

        setTitle("MyJInternalFrame");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setBounds(100,100,700,500);
        setVisible(true);



    }
    public static void main(String[] args) {
         new MyJInternalFrame();
    }
    public void initFrame(JInternalFrame iframe){
        iframe.setSize(300,200);
        iframe.setDefaultCloseOperation(JInternalFrame.DISPOSE_ON_CLOSE);
        iframe.setLocation(50,50);
        iframe.setVisible(true);
        iframe.setLayout(new FlowLayout());

        iframe.add(new JButton("Button1"));
    }
}
