package Java.编程Swing.JTree和TreeModel实现树.改变结点外观3;

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreeCellRenderer;
import java.awt.*;

public class CustomerTreeNode {
    JFrame jf = new JFrame("定制树的结点");

    JTree tree;

    //定义几个初始化结点
    DefaultMutableTreeNode friends = new DefaultMutableTreeNode("smile1");
    DefaultMutableTreeNode qingzhao = new DefaultMutableTreeNode("smile2");
    DefaultMutableTreeNode suge = new DefaultMutableTreeNode("smile1");
    DefaultMutableTreeNode libai = new DefaultMutableTreeNode("smile2");
    DefaultMutableTreeNode nongyu = new DefaultMutableTreeNode("smile1");
    DefaultMutableTreeNode hutou = new DefaultMutableTreeNode("smile2");

    public void init() {
        //组装视图
        friends.add(qingzhao);
        friends.add(suge);
        friends.add(libai);
        friends.add(nongyu);
        friends.add(hutou);

        tree = new JTree(friends);

        //TODO 设置结点绘制器
        MyRenderer renderer = new MyRenderer();
        tree.setCellRenderer(renderer);

        jf.add(new JScrollPane(tree));
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.pack();
        jf.setVisible(true);
    }

    //自定义类，实现TreeCellRenderer接口，绘制组件
    private class MyRenderer extends JPanel implements TreeCellRenderer {
        private ImageIcon icon;
        private String name;
        private Color background;
        private Color foreground;

        @Override
        public Component getTreeCellRendererComponent(JTree tree, Object value, boolean selected, boolean expanded, boolean leaf, int row, boolean hasFocus) {
            //给成员变量设置值
            this.icon = new ImageIcon("C:\\Users\\86159\\IdeaProjects\\untitled\\untitled1\\src\\" + value.toString() + ".png");
            this.name = value.toString();

            this.background = hasFocus ? new Color(144, 200, 225) : new Color(255, 255, 255);
            this.foreground = hasFocus ? new Color(255, 255, 3) : new Color(0, 0, 0);

            return this;
        }

        //通过重写getPreferredSize方法，指定当前JPanel组件的大小
        @Override
        public Dimension getPreferredSize() {
            return new Dimension(80, 80);
        }

        @Override
        public void paint(Graphics g) {
            //绘制组件内容
            int iconWidth = this.icon.getIconWidth();
            int iconHeight = this.icon.getIconHeight();

            //填充背景
            g.setColor(background);
            g.fillRect(0, 0, getWidth(), getHeight());

            //绘制头像
            g.drawImage(this.icon.getImage(), getWidth() / 2 - iconWidth / 2, 10, null);

            //绘制名称
            g.setColor(foreground);
            g.setFont(new Font("StSong", Font.BOLD, 18));
            g.drawString(this.name, getWidth() / 2 - name.length() * 10 / 2, iconHeight + 30);
        }
    }

    public static void main(String[] args) {
        new CustomerTreeNode().init();
    }
}
