import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;

public class MyJTree {
    public static void main(String[] args) {
        JFrame f = new JFrame("Tree Example");
        f.setSize(500,500);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        DefaultMutableTreeNode rootnode = new DefaultMutableTreeNode("TOP");
        DefaultMutableTreeNode A = new DefaultMutableTreeNode("A");
        DefaultMutableTreeNode B = new DefaultMutableTreeNode("B");
        DefaultMutableTreeNode A1 = new DefaultMutableTreeNode("A1");
        DefaultMutableTreeNode A2 = new DefaultMutableTreeNode("A2");
        DefaultMutableTreeNode B1 = new DefaultMutableTreeNode("B1");
        DefaultMutableTreeNode B2 = new DefaultMutableTreeNode("B2");
        DefaultMutableTreeNode B3 = new DefaultMutableTreeNode("B3");

        A.add(A1);
        A.add(A2);

        B.add(B1);
        B.add(B2);
        B.add(B3);

        rootnode.add(A);
        rootnode.add(B);

        JTree tree  = new JTree(rootnode);
        f.add(tree);

        f.setVisible(true);
    }
}
