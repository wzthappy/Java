package Java.编程Swing.JTabbedPane标签页面板;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class JTabbedPaneTest {
    JFrame jf = new JFrame("测试JTabbedPane");

    JTabbedPane tabbedPane = new JTabbedPane(SwingConstants.LEFT,JTabbedPane.SCROLL_TAB_LAYOUT);


    public void init() {
        //组装视图
        //添加标签
        tabbedPane.addTab("用户管理",new ImageIcon("C:\\Users\\86159\\IdeaProjects\\untitled\\untitled1\\src\\smile1.png")
                ,new JList<String>(new String[]{"用户一","用户二","用户三"}),"用户管理"
        );
        tabbedPane.addTab("商品管理",new JList<String>(new String[]{"商品一","商品二","商品三"}));
        tabbedPane.addTab("订单管理",new ImageIcon("C:\\Users\\86159\\IdeaProjects\\untitled\\untitled1\\src\\smile2.png")
                ,new JList<String>(new String[]{"订单一","订单二","订单三","订单四"}));

        //完全设置
        tabbedPane.setEnabledAt(0,false);
        tabbedPane.setSelectedIndex(1);

        //监听当前标签面板的选中情况
        tabbedPane.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                int selectedIndex = tabbedPane.getSelectedIndex();
                String name = tabbedPane.getName();
                JOptionPane.showMessageDialog(jf,"当前选中了第" +(selectedIndex + 1) + "个标签",name,JOptionPane.PLAIN_MESSAGE);
            }
        });

        jf.add(tabbedPane);

        //设置窗口的位置和大小
        jf.setBounds(400,400,400,400);

        //固定窗口大小
        jf.setResizable(false);

        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setVisible(true);
    }

    public static void main(String[] args) {
        new JTabbedPaneTest().init();
    }
}
