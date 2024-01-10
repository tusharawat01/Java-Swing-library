import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class MyJFileChooser {
    JFileChooser filechooser;
    public MyJFileChooser(){
        JFrame f = new JFrame("Tree Example");
        f.setSize(500,400);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        f.add(panel);

        JButton bt1 = new JButton("OPEN");
        JButton bt2 = new JButton("Save");

        panel.add(bt1);
        panel.add(bt2);

        filechooser = new JFileChooser();
       // filechooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);

        filechooser.setMultiSelectionEnabled(true);
        FileNameExtensionFilter filter = new FileNameExtensionFilter("ONLY text file(.txt)","txt");
        filechooser.addChoosableFileFilter(filter);

        filechooser.setAcceptAllFileFilterUsed(false);

        bt1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                int selectedOption =filechooser.showDialog(null,"Open my file");
                int selectedOption = filechooser.showOpenDialog(null);
                if(selectedOption == JFileChooser.APPROVE_OPTION){
                    System.out.println("selected file is : "+ filechooser.getSelectedFile().getAbsolutePath());

                }else{
                    System.out.println("user cancelled the dialog");
                }
            }
        });

        bt2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int selectedOption = filechooser.showSaveDialog(null);
                if(selectedOption == JFileChooser.APPROVE_OPTION){
                    File[] files = filechooser.getSelectedFiles();
                    for(int i = 0;i< files.length;i++) {
                        File file = files[i];

                        System.out.println("\nselected file is : " + file.getAbsolutePath());
                    }

                }else{
                    System.out.println("user cancelled the dialog");
                }

            }
        });


        f.setVisible(true);


    }

    public static void main(String[] args) {
        new MyJFileChooser();
    }
}
