package Java.编程Swing.表格.TableModel的使用;

import javax.swing.*;
import javax.swing.table.AbstractTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

public class TableModelTest {
    JFrame jf = new JFrame("TableModel演示");

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

    private Vector titlesV = new Vector();  //存储标题
    private Vector<Vector> dataV = new Vector<>(); //存储数据

    public void init() {
        //组装视图
        for (int i = 0; i < titles.length; i++) {
            titlesV.add(titles[i]);
        }

        for (int i = 0; i < data.length; i++) {
            Vector t = new Vector();
            for (int j = 0; j < data[i].length; j++) {
                t.add(data[i][j]);
            }
            dataV.add(t);
        }


        MyTableModel myTableModel = new MyTableModel();
        //JTable jTable = new JTable(dataV,titlesV);
        JTable jTable = new JTable(myTableModel);

        JButton btn = new JButton("获取选中行数组");
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int selectedColumn = jTable.getSelectedColumn();
                int selectedRow = jTable.getSelectedRow();
                System.out.println("当前选中行的索引" + selectedRow);
                System.out.println("当前选中列的索引" + selectedColumn);

                Object value = myTableModel.getValueAt(selectedRow, selectedColumn);
                System.out.println("当前选中行单元格的内容为: " + value);
            }
        });
        jf.add(btn, BorderLayout.SOUTH);

        jf.add(new JScrollPane(jTable));
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.pack();
        jf.setVisible(true);
    }

    private class MyTableModel extends AbstractTableModel {

        @Override
        public int getRowCount() {
            return dataV.size();
        }

        @Override
        public int getColumnCount() {
            return titlesV.size();
        }

        @Override
        public Object getValueAt(int rowIndex, int columnIndex) {
            return dataV.get(rowIndex).get(columnIndex);
        }

        @Override
        public String getColumnName(int column) {
            return (String) titlesV.get(column);
        }

        @Override
        public boolean isCellEditable(int rowIndex, int columnIndex) {
            return false;
        }
    }
    public static void main(String[] args) {
        new TableModelTest().init();
    }
}
