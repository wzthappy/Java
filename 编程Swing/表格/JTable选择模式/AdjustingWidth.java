package Java.编程Swing.表格.JTable选择模式;

import javax.swing.*;
import javax.swing.table.TableColumn;

public class AdjustingWidth {
    JFrame jf = new JFrame("简单表格");

    //创建一维数组，存储标题
    Object[] titles = {"姓名","年龄","性别"};

    //创建二维数组，作为列数据
    Object[][] data = {
           new Object[]{"李清 照","29","女"},
            new Object[]{"苏格拉底","56","男"},
            new Object[]{"李白","35","男"},
            new Object[]{"弄玉","18","女"},
            new Object[]{"虎头","2","男"},
    };

    public void init() {
        //创建JTable对象
        JTable table = new JTable(data,titles);

        //TODO 设置选择模式
//        table.getSelectionModel().setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);//默认没有限制
//        table.getSelectionModel().setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);//选择单个连续范围
        table.getSelectionModel().setSelectionMode(ListSelectionModel.SINGLE_SELECTION);//只能选择单行

        //TODO 设置列宽
        TableColumn column_1 = table.getColumn(titles[0]);
        column_1.setMinWidth(40);

        TableColumn column_3 = table.getColumn(titles[2]);
        column_3.setMaxWidth(50);

        jf.add(new JScrollPane(table));
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.pack();
        jf.setVisible(true);
    }

    public static void main(String[] args) {
        new AdjustingWidth().init();
    }
}
