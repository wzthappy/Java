package Java.编程Swing.JOptionPane简单的对话框.消息对话框;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class MessageDialogTest {
    JFrame jf = new JFrame("测试消息对话框");

    JTextArea jta = new JTextArea(6,30);

    //声明按钮
    JButton btn = new JButton(new AbstractAction("弹出消息对话框") {
        @Override
        public void actionPerformed(ActionEvent e) {
            //弹出一个消息对话框，并且显示，文本域中输入的内容
            String text = jta.getText();

            // 参数: int messageType 指定消息对话框的类型: 错误消息，警告消息，问题消息...
//            JOptionPane.showMessageDialog(jf,text,"消息对话框",JOptionPane.ERROR_MESSAGE);
//            JOptionPane.showMessageDialog(jf,text,"消息对话框",JOptionPane.INFORMATION_MESSAGE);
//            JOptionPane.showMessageDialog(jf,text,"消息对话框",JOptionPane.WARNING_MESSAGE);
//            JOptionPane.showMessageDialog(jf,text,"消息对话框",JOptionPane.QUESTION_MESSAGE);
//            JOptionPane.showMessageDialog(jf,text,"消息对话框",JOptionPane.PLAIN_MESSAGE);
            JOptionPane.showMessageDialog(jf,text,"消息对话框",JOptionPane.WARNING_MESSAGE,new ImageIcon("C:\\Users\\86159\\IdeaProjects\\untitled\\untitled1\\src\\smile1.png"));

        }
    });

    public void init() {
        //组装视图
        jf.add(jta);
        jf.add(btn, BorderLayout.SOUTH);

        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.pack();
        jf.setVisible(true);
    }

    public static void main(String[] args) {
        new MessageDialogTest().init();
    }
}
