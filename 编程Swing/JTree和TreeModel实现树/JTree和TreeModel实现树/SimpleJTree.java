package Java.编程Swing.JTree和TreeModel实现树.JTree和TreeModel实现树;

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;

public class SimpleJTree {
    JFrame jf = new JFrame("简单树");

    public void init() {
        //创建DefaultMutableTreeNode对象代表结点
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("中国");
        DefaultMutableTreeNode guangDong = new DefaultMutableTreeNode("广东");
        DefaultMutableTreeNode guangXi = new DefaultMutableTreeNode("广西");
        DefaultMutableTreeNode foShan = new DefaultMutableTreeNode("佛山");
        DefaultMutableTreeNode shanTou = new DefaultMutableTreeNode("汕头");
        DefaultMutableTreeNode guiLin = new DefaultMutableTreeNode("桂林");
        DefaultMutableTreeNode nanNing = new DefaultMutableTreeNode("南宁");

        //创建结点之间的关系
        root.add(guangDong);
        root.add(guangXi);

        guangDong.add(foShan);
        guangDong.add(shanTou);

        guangXi.add(guiLin);
        guangXi.add(nanNing);

        //创建JTree对象
        JTree tree = new JTree(root);

        //把JTree放入到窗口中进行展示
        jf.add(tree);

        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.pack();
        jf.setVisible(true);
    }

    public static void main(String[] args) {
        new SimpleJTree().init();
    }
}
