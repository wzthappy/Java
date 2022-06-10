package Java.编程Swing.表格.DefaultTableModel编辑;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

public class DefaultTableModelTest {
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

        //通过DefaultTableModel创建JTable
        DefaultTableModel model = new DefaultTableModel(dataV,titlesV);
        JTable jTable = new JTable(model);

        //创建按钮
        JButton addRow = new JButton("添加一行");
        JButton addColum = new JButton("添加一列");
        JButton deleteRow = new JButton("删除一行");

        addRow.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //需要给表格添加一行
                model.addRow(new Object[]{"柳岩",18,"女"});
            }
        });
        addColum.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                model.addColumn("职业");
            }
        });
        deleteRow.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int selectedRow = jTable.getSelectedRow();
                model.removeRow(selectedRow);
            }
        });

        JPanel panel = new JPanel();
        panel.add(addRow);
        panel.add(addColum);
        panel.add(deleteRow);

        jf.add(panel,BorderLayout.SOUTH);

        jf.add(new JScrollPane(jTable));
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.pack();
        jf.setVisible(true);
    }

    public static void main(String[] args) {
        new DefaultTableModelTest().init();
    }
}
