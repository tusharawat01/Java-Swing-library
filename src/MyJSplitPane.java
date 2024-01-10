import javax.swing.*;

public class MyJSplitPane {
    public static void main(String[] args) {
        JFrame f =  new JFrame();
        f.setTitle("JSplitPane");
        f.setBounds(100,100,700,500);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JSplitPane jsp = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT);

        JButton bt1 = new JButton("Button1");
        JButton bt2 = new JButton("Button2");

        jsp.setTopComponent(bt1);
        jsp.setBottomComponent(bt2);

        jsp.setDividerSize(10);
        jsp.setDividerLocation(100);
        jsp.setOneTouchExpandable(true);
        f.add(jsp);

        f.setVisible(true);
    }
}
