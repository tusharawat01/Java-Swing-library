import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyJCheckBoxMenuItem {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("JMenuBar");
        frame.setBounds(100,100,700,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTextArea ta = new JTextArea("");
        frame.add(ta);

        JMenuBar menubar = new JMenuBar();

        JMenu menu1 = new JMenu("File");
        JMenu menu2 = new JMenu("Edit");
        JMenu menu3 = new JMenu("New");
        JMenu menu4 = new JMenu("Format");

        JMenuItem menuitem1 = new JMenuItem("New");
        JMenuItem menuitem2 = new JMenuItem("Open");
        JMenuItem menuitem3 = new JMenuItem("Save");
        JMenuItem menuitem4 = new JMenuItem("Exit");
        JMenuItem menuitem5 = new JMenuItem("Copy");
        JMenuItem menuitem6 = new JMenuItem("Paste");
        JMenuItem menuitem7 = new JMenuItem("Delete");
        JMenuItem menuitem8 = new JMenuItem("File");
        JMenuItem menuitem9 = new JMenuItem("Project");
        JMenuItem menuitem10 = new JMenuItem("Package");
        JCheckBoxMenuItem menuItem11 = new JCheckBoxMenuItem("Wrap");

        menu1.add(menuitem1);
        menu1.add(menuitem2);
        menu1.add(menuitem3);
        menu1.add(menuitem4);

        menu2.add(menuitem5);
        menu2.add(menuitem6);
        menu2.add(menuitem7);

        menu3.add(menuitem8);
        menu3.add(menuitem9);
        menu3.add(menuitem10);

        menu4.add(menuItem11);

        menu1.add(menu3);

        menubar.add(menu1);
        menubar.add(menu2);
        menubar.add(menu4);

        frame.setJMenuBar(menubar);

        menuItem11.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(menuItem11.isSelected()){
                    ta.setLineWrap(true);
                    ta.setWrapStyleWord(true);
                }else{
                    ta.setLineWrap(false);
                    ta.setWrapStyleWord(false);
                }
            }
        });


        frame.setVisible(true);
    }
}
