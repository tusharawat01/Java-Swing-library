import javax.swing.*;
import java.awt.*;


public class MyJDesktopPane extends JFrame {
    JDesktopPane dp;
    MyJDesktopPane(){
        setTitle("JDesktopPane");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(100,100,700,500);


        dp = new JDesktopPane();
        display(dp);

        add(dp, BorderLayout.CENTER);


        setVisible(true);

    }

    private void display(JDesktopPane dp) {
        int numFrame = 3,x=30,y=30;
        for(int i = 0; i<numFrame; i++){
            JInternalFrame iframe = new JInternalFrame("MY FRAME "+(i+1),true,true,true,true);

            iframe.setBounds(x,y,250,100);
            iframe.setDefaultCloseOperation(JInternalFrame.DISPOSE_ON_CLOSE);
            iframe.add(new JLabel("I LOVE JAVA"));

            iframe.setVisible(true);
            dp.add(iframe);

            y = y+100;
        }

    }

    public static void main(String[] args) {
        new MyJDesktopPane();
    }
}
