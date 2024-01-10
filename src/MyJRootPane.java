import javax.swing.*;

public class MyJRootPane extends JFrame {
    MyJRootPane(){
        JRootPane rootPane = this.getRootPane();

        JButton button =  new JButton("Press me");
        JMenuBar menubar = new JMenuBar();
        JMenu file = new JMenu("File");

        file.add("New File");
        file.add("Open File");
        file.add("Save File");
        file.add("Close File");

        menubar.add(file);

        rootPane.getContentPane().add(button);
        rootPane.setJMenuBar(menubar);


    }
    public static void main(String[] args) {
       MyJRootPane frame = new MyJRootPane();
        frame.setSize(600,400);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);


    }
}
