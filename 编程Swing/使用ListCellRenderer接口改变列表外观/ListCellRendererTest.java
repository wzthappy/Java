package Java.编程Swing.使用ListCellRenderer接口改变列表外观;

import javax.swing.*;
import java.awt.*;

public class ListCellRendererTest {
    private JFrame mainWin = new JFrame("好友列表");

    private String[] friends = {
            "smile1",
            "smile2",
            "smile1",
            "smile1",
            "smile2"
    };

    //定义一个JList对象
    JList friendsList = new JList(friends);

    public void init() {
        //组装视图
        //给JList设置ListCellRenderer对象，指定列表项绘制的组件
        friendsList.setCellRenderer(new MyRenderer());

        mainWin.add(friendsList);

        mainWin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainWin.pack();
        mainWin.setVisible(true);
    }

    private class MyRenderer extends JPanel implements ListCellRenderer {
        private String name;
        private ImageIcon icon;

        //记录背景色
        private Color backGround;
        //记录前景色，文字的颜色
        private Color foreGround;

        @Override
        public Component getListCellRendererComponent(JList list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
            //重置成员变量的值
            this.name = value.toString();
            this.icon = new ImageIcon("C:\\Users\\86159\\IdeaProjects\\untitled\\untitled1\\src\\" + name + ".png");

            this.backGround = isSelected ? list.getSelectionBackground() : list.getBackground();
            this.foreGround = isSelected ? list.getSelectionForeground() : list.getForeground();

            return this;
        }

        @Override
        public Dimension getPreferredSize() {
            return new Dimension(60, 80);
        }

        //绘制列表项的内容
        @Override
        public void paint(Graphics g) {
            int imageWidth = icon.getImage().getWidth(null);
            int imageHeight = icon.getImage().getHeight(null);
            //填充背景矩形
            g.setColor(backGround);
            g.fillRect(0,0,getWidth(),getHeight());

            //绘制头像
            g.drawImage(icon.getImage(), this.getWidth() / 2 - imageWidth / 2, 10, null);

            //绘制名称
            g.setColor(foreGround);
            g.setFont(new Font("StSong", Font.BOLD, 18));
            g.drawString(this.name, this.getWidth() / 2 - this.name.length() * 10 / 2, imageHeight + 30);
        }
    }

    public static void main(String[] args) {
        new ListCellRendererTest().init();
    }
}
