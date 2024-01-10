import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyJEditorPane extends JFrame {
    JEditorPane pane;
    MyJEditorPane(){

        pane = new JEditorPane();
        pane.setContentType("text/html");
        pane.setText("<html>"
                +"<h1 color ='red'>Hello World</h1>"
                +"<p>This is my paragraph</p>"
                +"<hr>"
                +"<ol>"
                +"<li>item1</li>"
                +"<li>item2</li>"
                +"<li>item3</li>"
                +"<hr>"
                +"</ol>"
                +"</html>");
//        pane.setContentType("text/plain");
//        pane.setText("My name is TusharRawat, i am 23 years old. Tooltip are little pieces of " +
//                "information that comes up when you never objects and most of the time they are automatically controlled" +
//                "Measure performance by using KPI's and the main part is the main part is missing");
        add(pane,BorderLayout.CENTER);

        setTitle("JEditorPane");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(100,100,700,500);

        JButton button = new JButton("Show Code");
        add(button,BorderLayout.PAGE_END);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(pane.getText());
            }
        });

        setVisible(true);

    }
    public static void main(String[] args) {
        new MyJEditorPane();

    }
}
