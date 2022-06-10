package Java.编程Swing.JTree和TreeModel实现树.JTree外观设置;

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreeNode;

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

        //putClientProperty("JTree.lineStyle", "None");  设置结点之间没有连接线
//        tree.putClientProperty("JTree.lineStyle", "None");

        //putClientProperty("JTree.lineStyle", "Horizontal");  设置结点之间只有水平分割线
//        tree.putClientProperty("JTree.lineStyle", "Horizontal");

        //把JTree放入到窗口中进行展示
        jf.add(tree);

        //返回此结点的下一个兄弟结点
        DefaultMutableTreeNode nextNode = guangDong.getNextSibling();
        System.out.println(nextNode);

        //返回此结点的父结点
        TreeNode parent = guangDong.getParent();
        System.out.println(parent);

        //该结点是否是叶子结点
        System.out.println(guangDong.isLeaf());
        System.out.println(foShan.isLeaf());

        //返回当前结点是否是根结点
        System.out.println(guangDong.isRoot());
        System.out.println(root.isRoot());

        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.pack();
        jf.setVisible(true);
    }

    public static void main(String[] args) {
        new SimpleJTree().init();
    }
}
