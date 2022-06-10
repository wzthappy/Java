package Java.编程Swing.使用JList和JComboBox列表框;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DefaultListModelTest {
    JFrame jf = new JFrame("测试DefaultListModel");

    JTextField bookName = new JTextField(20);

    JButton removeBtn = new JButton("删除选中图书");

    JButton addBtn = new JButton("添加指定图书");

    //创建JList
    JList<String> bookList;

    DefaultListModel<String> model = new DefaultListModel<>();

    public void init() {
        //组装视图
        model.addElement("java自学宝典");
        model.addElement("轻量级JavaEE企业应用实战");
        model.addElement("Android基础教程");
        model.addElement("JQuery实战教程");

        bookList = new JList<>(model);

        //设置JList
        bookList.setVisibleRowCount(4);
        //设置单选
        bookList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        jf.add(new JScrollPane(bookList));

        //组装底部
        addBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = bookName.getText();
                if (!name.equals("")) {
                    model.addElement(name);
                }
            }
        });

        removeBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int selectedIndex = bookList.getSelectedIndex();
                if (selectedIndex >= 0) {
                    model.remove(selectedIndex);
                }
            }
        });

        JPanel bottomPanel = new JPanel();
        bottomPanel.add(bookName);
        bottomPanel.add(addBtn);
        bottomPanel.add(removeBtn);

        jf.add(bottomPanel, BorderLayout.SOUTH);

        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.pack();
        jf.setVisible(true);
    }

    public static void main(String[] args) {
        new DefaultListModelTest().init();
    }
}
