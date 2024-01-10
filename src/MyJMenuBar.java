import javax.swing.*;

public class MyJMenuBar {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("JMenuBar");
        frame.setBounds(100,100,700,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JMenuBar menubar = new JMenuBar();

        JMenu menu1 = new JMenu("File");
        JMenu menu2 = new JMenu("Edit");
        JMenu menu3 = new JMenu("New");

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

        menu1.add(menu3);

        menubar.add(menu1);
        menubar.add(menu2);

        frame.setJMenuBar(menubar);


        frame.setVisible(true);
    }
}
