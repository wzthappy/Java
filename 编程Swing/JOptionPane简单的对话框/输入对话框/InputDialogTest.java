package Java.编程Swing.JOptionPane简单的对话框.输入对话框;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class InputDialogTest {
    JFrame jf = new JFrame("测试输入对话框");

    JTextArea jta = new JTextArea(6,30);

    JButton btn = new JButton(new AbstractAction("弹出输入对话框") {
        @Override
        public void actionPerformed(ActionEvent e) {
            //弹出输入对话框
            String result = JOptionPane.showInputDialog(jf, "请填写您的银行账号:", "输入对话框", JOptionPane.INFORMATION_MESSAGE);
            jta.append(result);
        }
    });

    public void init() {
        jf.add(jta);
        jf.add(btn, BorderLayout.SOUTH);

        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.pack();
        jf.setVisible(true);
    }

    public static void main(String[] args) {
        new InputDialogTest().init();

    }
}
