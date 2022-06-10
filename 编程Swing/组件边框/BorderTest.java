package Java.编程Swing.组件边框;

import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;

public class BorderTest {
    JFrame jf = new JFrame("测试边框");


    public void init() {
        //组装视图
        //1，JFrame的布局修改为GridLayout
        jf.setLayout(new GridLayout(2,4));

        //2，往网格中填充不同的JPanel组件，并设置边框和内容
        //创建BevelBorder
        Border bevelBorder = BorderFactory.createBevelBorder(BevelBorder.RAISED, Color.RED, Color.GREEN, Color.BLUE, Color.GRAY);
        jf.add(getJPanelWithBorder(bevelBorder,"BevelBorder"));

        //创建LineBorder
        Border lineBorder = BorderFactory.createLineBorder(Color.ORANGE, 10);
        jf.add(getJPanelWithBorder(lineBorder,"LineBorder"));

        //创建EmptyBorder
        Border emptyBorder = BorderFactory.createEmptyBorder(10, 5, 20, 10);
        jf.add(getJPanelWithBorder(emptyBorder,"EmptyBorder"));

        //创建EtchedBorder
        Border etchedBorder = BorderFactory.createEtchedBorder(EtchedBorder.RAISED, Color.RED, Color.GREEN);
        jf.add(getJPanelWithBorder(etchedBorder,"EtchedBorder"));

        //创建TitledBorder
        TitledBorder titledBorder = new TitledBorder(new LineBorder(Color.ORANGE,10),"测试标题",TitledBorder.LEFT,TitledBorder.BOTTOM,new Font("StSong",Font.BOLD,18),Color.BLUE);
        jf.add(getJPanelWithBorder(titledBorder,"TitledBorder"));

        //创建MatteBorder
        MatteBorder matteBorder = new MatteBorder(10,5,20,10,Color.GREEN);
        jf.add(getJPanelWithBorder(matteBorder,"MatteBorder"));

        //创建CompoundBorder
        CompoundBorder compoundBorder = new CompoundBorder(new LineBorder(Color.RED,10),titledBorder);
        jf.add(getJPanelWithBorder(compoundBorder,"CompoundBorder"));

        //3，设置窗口最佳大小，设置窗口可见，设置关闭操作
        jf.pack();
        jf.setVisible(true);

        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public JPanel getJPanelWithBorder(Border border,String content) {
        JPanel jPanel = new JPanel();
        jPanel.add(new JLabel(content));

        //设置边框
        jPanel.setBorder(border);
        return jPanel;
    }

    public static void main(String[] args) {
        new BorderTest().init();
    }
}
