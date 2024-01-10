import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyWelcomeScreen extends JFrame {
    Timer timer;
    MyWelcomeScreen(){

        displayWelcomeScreen();

        setSize(600,400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JLabel label = new JLabel("Welcome to JAVA");
        label.setHorizontalAlignment(SwingConstants.CENTER);
        add(label);
//        setVisible(true);

    }
    public static void main(String[] args) {
        new MyWelcomeScreen();

    }
    private void displayWelcomeScreen(){
        JWindow w = new JWindow();
        w.setSize(600,400);
        w.setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setBackground(Color.GREEN);
        panel.setBorder(BorderFactory.createLineBorder(Color.RED));

        panel.add(new JLabel(new ImageIcon("C:\\Users\\himan\\OneDrive\\Desktop\\download")));
        w.add(panel);


        JProgressBar bar = new JProgressBar(0,100);
        bar.setForeground(Color.ORANGE);
        w.add(BorderLayout.PAGE_END,bar);

        timer = new Timer(100, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int x =bar.getValue();
                if(x==100){
                    w.dispose();
                    MyWelcomeScreen.this.setVisible(true);
                    timer.stop();
                }else{
                    bar.setValue(x+4);
                }

            }
        });
        w.setVisible(true);
        timer.start();
    }
}
