package Java.编程Swing.JColorChooser颜色选择对话框;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class JColorChooserDemo {
    JFrame jFrame = new JFrame("测试颜色选择器");

    JTextArea jta = new JTextArea("我爱中华", 6, 30);

    //声明按钮
    JButton btn = new JButton(new AbstractAction("改变文本框背景颜色") {
        @Override
        public void actionPerformed(ActionEvent e) {
            //弹出一个颜色选择器，
            Color result = JColorChooser.showDialog(jFrame, "颜色选择器", Color.WHITE);

            //修改文件背景
            jta.setBackground(result);
        }
    });

    public void init() {
        //组装视图

        jFrame.add(jta);
        jFrame.add(btn,BorderLayout.SOUTH);

        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.pack();
        jFrame.setVisible(true);
    }

    public static void main(String[] args) {
        new JColorChooserDemo().init();
    }
}
