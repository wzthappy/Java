package Java.编程Swing.JTree和TreeModel实现树.改变结点外观2;

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeCellRenderer;
import java.awt.*;

public class ExtendsDefaultCellTreeRenderer {
    JFrame jf = new JFrame("根据结点类型定义图标");

    JTree tree;

    //初始化2个图标
    ImageIcon icon1 = new ImageIcon("C:\\Users\\86159\\IdeaProjects\\untitled\\untitled1\\src\\smile1.png");
    ImageIcon icon2 = new ImageIcon("C:\\Users\\86159\\IdeaProjects\\untitled\\untitled1\\src\\smile2.png");

    //定义一个NodeData类，用于封装结点数据
    class NodeData {
        public ImageIcon icon;
        public String name;

        public NodeData(ImageIcon icon, String name) {
            this.icon = icon;
            this.name = name;
        }
    }

    //定义几个初始化结点
    DefaultMutableTreeNode root = new DefaultMutableTreeNode(new NodeData(icon1,"数据导航"));
    DefaultMutableTreeNode salaryDb = new DefaultMutableTreeNode(new NodeData(icon2,"公司工资数据库"));
    DefaultMutableTreeNode customerDb = new DefaultMutableTreeNode(new NodeData(icon2,"公司客户数据库"));
    DefaultMutableTreeNode employee = new DefaultMutableTreeNode(new NodeData(icon1,"员工表"));
    DefaultMutableTreeNode attend = new DefaultMutableTreeNode(new NodeData(icon1,"考勤表"));
    DefaultMutableTreeNode concat = new DefaultMutableTreeNode(new NodeData(icon2,"联系方式"));
    DefaultMutableTreeNode id = new DefaultMutableTreeNode(new NodeData(icon1,"员工ID"));
    DefaultMutableTreeNode name = new DefaultMutableTreeNode(new NodeData(icon2,"姓名"));
    DefaultMutableTreeNode gender = new DefaultMutableTreeNode(new NodeData(icon2,"性别"));

    public void init() {
        //通过结点的add方法，建立结点的父子关系
        root.add(salaryDb);
        root.add(customerDb);

        salaryDb.add(employee);
        salaryDb.add(attend);

        customerDb.add(concat);

        concat.add(id);
        concat.add(name);
        concat.add(gender);

        //创建树
        tree = new JTree(root);

        //TODO 通过扩展DefaultTreeCellRenderer修改外观
        tree.setCellRenderer(new MyRenderer());

        jf.add(new JScrollPane(tree));
        jf.pack();
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setVisible(true);
    }

    //自定义类，继承DefaultTreeCellRenderer，完成结点的绘制
    private class MyRenderer extends DefaultTreeCellRenderer {
        //重写方法

        @Override
        public Component getTreeCellRendererComponent(JTree tree, Object value, boolean sel, boolean expanded, boolean leaf, int row, boolean hasFocus) {
            //当前类间接的继承了JLabel这个组件类，展示一张图片和一些套装的文字
            //Object value 这个参数，代表的就是即将要绘制的结点
            //获取当前结点
            DefaultMutableTreeNode node = (DefaultMutableTreeNode) value;

            //获取到当前即将绘制的结点的名称和图标
            NodeData nodeData = (NodeData) node.getUserObject();

            //通过setText方法和setIcon方法完成设置
            this.setText(nodeData.name);
            this.setIcon(nodeData.icon);

            return this;
        }
    }

    public static void main(String[] args) {
        new ExtendsDefaultCellTreeRenderer().init();
    }
}
