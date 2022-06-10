package Java.编程Swing.表格.JTable实现;

import javax.swing.*;

public class SimpleTable {
    JFrame jf = new JFrame("简单表格");

    //创建一维数组，存储标题
    Object[] titles = {"姓名","年龄","性别"};

    //创建二维数组，创建数据
    Object[][] data = {
            {"李清照","29","女"},
            {"苏格拉底","56","男"},
            {"李白","35","男"},
            {"弄玉","18","女"},
            {"虎头","2","男"},
    };

    public void init() {
        //组装视图
        JTable jTable = new JTable(data,titles);

        jf.add(new JScrollPane(jTable));
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.pack();
        jf.setVisible(true);
    }

    public static void main(String[] args) {
        new SimpleTable().init();
    }
}
