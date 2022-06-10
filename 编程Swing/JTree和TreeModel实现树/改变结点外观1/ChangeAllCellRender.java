package Java.编程Swing.JTree和TreeModel实现树.改变结点外观1;

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeCellRenderer;
import java.awt.*;

public class ChangeAllCellRender {
    JFrame jf = new JFrame("改变所有结点外观");

    JTree tree;

    //定义几个初始化结点
    DefaultMutableTreeNode root = new DefaultMutableTreeNode("中国");
    DefaultMutableTreeNode guangDong = new DefaultMutableTreeNode("广东");
    DefaultMutableTreeNode guangXi = new DefaultMutableTreeNode("广西");
    DefaultMutableTreeNode foShan = new DefaultMutableTreeNode("佛山");
    DefaultMutableTreeNode shanTou = new DefaultMutableTreeNode("汕头");
    DefaultMutableTreeNode guiLin = new DefaultMutableTreeNode("桂林");
    DefaultMutableTreeNode nanNing = new DefaultMutableTreeNode("南宁");

    public void init() {
        //通过add()方法建立父子层级关系
        guangDong.add(foShan);
        guangDong.add(shanTou);
        guangXi.add(guiLin);
        guangXi.add(nanNing);
        root.add(guangDong);
        root.add(guangXi);

        //创建JTree对象
        tree = new JTree(root);

        DefaultTreeCellRenderer renderer = new DefaultTreeCellRenderer();
        //设置非选定结点的背景颜色
        renderer.setBackgroundNonSelectionColor(new Color(220,220,220));

        //设置选中结点的背景颜色
        renderer.setBackgroundSelectionColor(new Color(140,140,140));

        //设置选中状态下结点的边框颜色
        renderer.setBorderSelectionColor(Color.BLUE);

        //设置处于折叠状态下非叶子结点图标
        renderer.setClosedIcon(new ImageIcon("C:\\Users\\86159\\IdeaProjects\\untitled\\untitled1\\src\\smile1.png"));

        //设置结点文本的字体
        renderer.setFont(new Font("StSong",Font.BOLD,16));

        //设置叶子结点图标
        renderer.setLeafIcon(new ImageIcon("C:\\Users\\86159\\IdeaProjects\\untitled\\untitled1\\src\\smile2.png"));

        //设置处于展开状态下非叶子结点图标
        renderer.setOpenIcon(new ImageIcon("C:\\Users\\86159\\IdeaProjects\\untitled\\untitled1\\src\\smile2.png"));

        //设置绘制非选中状态下文本颜色
        renderer.setTextNonSelectionColor(new Color(255,0,0));

        //设置绘制选中状态下文本颜色
        renderer.setTextSelectionColor(new Color(0,0,255));

        //把结点绘制器设置给树对象
        tree.setCellRenderer(renderer);

        jf.add(new JScrollPane(tree));
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.pack();
        jf.setVisible(true);
    }

    public static void main(String[] args) {
        new ChangeAllCellRender().init();
    }
}
