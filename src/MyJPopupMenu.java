import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MyJPopupMenu extends JFrame {
    JPopupMenu pop;
    JMenuItem m1,m2,m3;

    MyJPopupMenu(){


        setBounds(100,100,700,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

       pop = new JPopupMenu();

        m1 = new JMenuItem("New");
        m2 = new JMenuItem("Rename");
        m3 = new JMenuItem("Refresh");

        pop.add(m1);
        pop.add(m2);
        pop.add(m3);

        add(pop);
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {

                if(e.getButton() == MouseEvent.BUTTON3){
                    int x = e.getX();
                    int y = e.getY();
                    pop.show(MyJPopupMenu.this,x,y);
                }
            }
        });

        setVisible(true);
    }
    public static void main(String[] args) {
        MyJPopupMenu jp = new MyJPopupMenu();
    }

}
