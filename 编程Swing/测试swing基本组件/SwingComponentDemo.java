package Java.编程Swing.测试swing基本组件;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingComponentDemo {

    JFrame f = new JFrame("测试Swing基本组件");

    //生命中菜单相关的组件
    JMenuBar menuBar = new JMenuBar();
    JMenu fileMenu = new JMenu("文件");
    JMenu editMenu = new JMenu("编辑");

    JMenuItem auto = new JMenuItem("自动换行");
    JMenuItem copy = new JMenuItem("复制",new ImageIcon("C:\\Users\\86159\\IdeaProjects\\untitled\\src\\编程Swing\\测试swing基本组件\\img\\a.img"));
    JMenuItem paste = new JMenuItem("粘贴",new ImageIcon("C:\\Users\\86159\\IdeaProjects\\untitled\\src\\编程Swing\\测试swing基本组件\\img\\a2.img"));

    JMenu formatMenu = new JMenu("格式");
    JMenuItem comment = new JMenuItem("注释");
    JMenuItem cancelComment = new JMenuItem("取消注释");

    //声明文本域
    JTextArea ta = new JTextArea(8, 20);

    //声明列表框
    String[] colors = {"红色", "绿色", "蓝色"};
    JList<String> colorList = new JList<String>(colors);

    //声明选择相关组件
    JComboBox<String> colorSelect = new JComboBox<String>();

    ButtonGroup bg = new ButtonGroup();
    JRadioButton male = new JRadioButton("男", false);
    JRadioButton female = new JRadioButton("女", true);

    JCheckBox isMarried = new JCheckBox("是否已婚?", true);

    //声明底部
    JTextField tf = new JTextField(40);
    JButton ok = new JButton("确定",new ImageIcon("C:\\Users\\86159\\IdeaProjects\\untitled\\src\\编程Swing\\测试swing基本组件\\img\\a3.png"));

    //声明右键菜单
    JPopupMenu jPopupMenu = new JPopupMenu();

    ButtonGroup poupButtonBg = new ButtonGroup();

    JRadioButtonMenuItem metalItem = new JRadioButtonMenuItem("Metal 风格");
    JRadioButtonMenuItem nimbusItem = new JRadioButtonMenuItem("Nimbus 风格");
    JRadioButtonMenuItem windowsItem = new JRadioButtonMenuItem("Windows 风格", true);
    JRadioButtonMenuItem windowsClassicItem = new JRadioButtonMenuItem("Windows 经典风格");
    JRadioButtonMenuItem motifItem = new JRadioButtonMenuItem("Motif 风格");

    //初始化界面
    public void init() {
        //组装视图
        //组装底部
        JPanel bottomPanel = new JPanel();
        bottomPanel.add(tf);
        bottomPanel.add(ok);

        f.add(bottomPanel, BorderLayout.SOUTH);

        //组装选择相关的组件
        JPanel selectPanel = new JPanel();
        colorSelect.addItem("红色");
        colorSelect.addItem("绿色");
        colorSelect.addItem("蓝色");
        selectPanel.add(colorSelect);
        bg.add(male);
        bg.add(female);
        selectPanel.add(male);
        selectPanel.add(female);

        selectPanel.add(isMarried);

        //组装文本域和选择相关组件
        Box topLeft = Box.createVerticalBox();
        topLeft.add(ta);
        topLeft.add(selectPanel);

        //组装顶部
        Box top = Box.createHorizontalBox();
        top.add(topLeft);
        top.add(colorList);

        f.add(top);

        //组装顶部菜单
        formatMenu.add(comment);
        formatMenu.add(cancelComment);

        editMenu.add(auto);
        editMenu.addSeparator();
        editMenu.add(copy);
        editMenu.add(paste);
        editMenu.addSeparator();
        editMenu.add(formatMenu);

        menuBar.add(fileMenu);
        menuBar.add(editMenu);

        f.setJMenuBar(menuBar);

        //组装右键菜单
        poupButtonBg.add(metalItem);
        poupButtonBg.add(nimbusItem);
        poupButtonBg.add(windowsItem);
        poupButtonBg.add(windowsClassicItem);
        poupButtonBg.add(motifItem);

        ActionListener listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //当前选择的是哪一个风格
                String actionCommand = e.getActionCommand();
                try {
                    changFlavor(actionCommand);
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        };
        metalItem.addActionListener(listener);
        nimbusItem.addActionListener(listener);
        windowsItem.addActionListener(listener);
        windowsClassicItem.addActionListener(listener);
        motifItem.addActionListener(listener);

        jPopupMenu.add(metalItem);
        jPopupMenu.add(nimbusItem);
        jPopupMenu.add(windowsItem);
        jPopupMenu.add(windowsClassicItem);
        jPopupMenu.add(motifItem);

        //不需要再监听鼠标事件了fu
        ta.setComponentPopupMenu(jPopupMenu);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.pack();
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new SwingComponentDemo().init();
    }

    //定义一个方法，用于改变界面风格
    private void changFlavor(String command) throws Exception {
        switch (command) {
            case "Metal 风格":
                UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
                break;
            case "Nimbus 风格":
                UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
                break;
            case "Windows 风格":
                UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
                break;
            case "Windows 经典风格":
                UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsClassicLookAndFeel");
                break;
            case "Motif 风格":
                UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");
                break;
        }
        //刷新组件的外观
        SwingUtilities.updateComponentTreeUI(f.getContentPane());
        SwingUtilities.updateComponentTreeUI(menuBar);
        SwingUtilities.updateComponentTreeUI(jPopupMenu);
    }
}
