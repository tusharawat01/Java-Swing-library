import javax.swing.*;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import java.awt.*;

public class MyJTextPane {
    MyJTextPane(){
        JFrame frame = new JFrame("Tool Bar");
        frame.setSize(600,400);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTextPane  pane = new JTextPane();
        pane.setText("Hello,");

        SimpleAttributeSet attr = new SimpleAttributeSet();
        StyleConstants.setBold(attr,true);
        Document doc = pane.getStyledDocument();

        try {
            doc.insertString(doc.getLength(), "Welcome", attr);
            attr = new SimpleAttributeSet();
            StyleConstants.setItalic(attr,true);
            doc.insertString(doc.getLength(),"to",attr);

            attr = new SimpleAttributeSet();
            StyleConstants.setUnderline(attr,true);
            doc.insertString(doc.getLength(),"Java Swing",attr);

            attr = new SimpleAttributeSet();
            StyleConstants.setForeground(attr, Color.RED);
            StyleConstants.setBackground(attr,Color.YELLOW);
            doc.insertString(doc.getLength(),"Tutorials",attr);




        }catch(BadLocationException e){}


        frame.getContentPane().add(pane);
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        new MyJTextPane();

    }
}
