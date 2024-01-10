import javax.swing.*;
import java.awt.*;

public class MyJProgressBar {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setTitle("JProgressBar");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setBounds(100,100,700,500);
        f.setLayout(new FlowLayout());
        f.setVisible(true);

        JProgressBar pb = new JProgressBar(0,100);
        f.add(pb);


        pb.setStringPainted(true);

        int i = 0;
        while(i<=100){
            pb.setValue(i);


            i=i+10;
        }

    }
}
