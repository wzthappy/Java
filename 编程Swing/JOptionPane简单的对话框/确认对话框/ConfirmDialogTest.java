package Java.编程Swing.JOptionPane简单的对话框.确认对话框;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class ConfirmDialogTest {
    JFrame jf = new JFrame("测试确认对话框");

    JTextArea jta = new JTextArea(6,30);

    JButton btn = new JButton(new AbstractAction("弹出确认对话框") {
        @Override
        public void actionPerformed(ActionEvent e) {
            //TODO 弹出确认对话框
            String text = jta.getText();
            jta.append("\n");
//            int result = JOptionPane.showConfirmDialog(jf, text, "确认对话框", JOptionPane.DEFAULT_OPTION);
//            int result = JOptionPane.showConfirmDialog(jf, text, "确认对话框", JOptionPane.YES_NO_OPTION);
//            int result = JOptionPane.showConfirmDialog(jf, text, "确认对话框", JOptionPane.YES_NO_CANCEL_OPTION);
            int result = JOptionPane.showConfirmDialog(jf, text, "确认对话框", JOptionPane.OK_CANCEL_OPTION);
            if (result == JOptionPane.YES_OPTION) {
                jta.append("用户点击了 是 按钮\n");
            }
            if (result == JOptionPane.NO_OPTION) {
                jta.append("用户点击了 否 按钮\n");
            }
//            if (result == JOptionPane.OK_OPTION) {     //  YES  =  OK
//                jta.append("用户点击了 确认 按钮\n");
//            }
            if (result == JOptionPane.CANCEL_OPTION) {
                jta.append("用户点击了 取消 按钮\n");
            }
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
        new ConfirmDialogTest().init();
    }
}
