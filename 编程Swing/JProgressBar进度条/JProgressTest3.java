package Java.编程Swing.JProgressBar进度条;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JProgressTest3 {
    JFrame jf = new JFrame("测试进度条");

    JCheckBox indeterminate = new JCheckBox("不确认进度");
    JCheckBox noBorder = new JCheckBox("不绘制边框");

    //创建进度条
    JProgressBar bar = new JProgressBar(JProgressBar.HORIZONTAL,0,100);

    //获取出进度条内置的数据模型对象
    BoundedRangeModel model = bar.getModel();

    public void init() {
        //组装视图
        //处理复选框的点击行为
        indeterminate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //获取一下indeterminate复选框有没有选中？
                boolean selected = indeterminate.isSelected();
                //设置当前进度条不确定进度
                bar.setIndeterminate(selected);

                bar.setStringPainted(!selected);
            }
        });

        noBorder.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //获取一下indeterminate复选框有没有选中？
                boolean selected = noBorder.isSelected();

                bar.setBorderPainted(!selected);
            }
        });

        Box vBox = Box.createVerticalBox();
        vBox.add(indeterminate);
        vBox.add(noBorder);

        //设置进度条的属性
        bar.setStringPainted(true);
        bar.setBorderPainted(true);

        //把当前窗口的布局方法修改为FlowLayout
        jf.setLayout(new FlowLayout());
        jf.add(vBox);
        jf.add(bar);

        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.pack();
        jf.setVisible(true);

        //开启子线程，模拟耗时操作
        SimulateActivity simulateActivity = new SimulateActivity(bar.getMaximum());
        new Thread(simulateActivity).start();

        //设置一个定时任务
        Timer timer = new Timer(200, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //读取线程任务对象的完成量，设置给进度条
                int current = simulateActivity.getCurrent();
//                bar.setValue(current);
                model.setValue(current);
            }
        });
        timer.start();

        //监听进度条的任务变化
        model.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                int value = model.getValue();
                if (value == simulateActivity.getAmount()) {
                    timer.stop();
                }
            }
        });
    }
    public class SimulateActivity implements Runnable {
        //记录任务总量
        private int amount;

        //记录当前任务的完成量
        private volatile int current;

        public SimulateActivity(int amount) {
            this.amount = amount;
        }

        public int getAmount() {
            return amount;
        }

        public void setAmount(int amount) {
            this.amount = amount;
        }

        public int getCurrent() {
            return current;
        }

        public void setCurrent(int current) {
            this.current = current;
        }

        @Override
        public void run() {
            //子线程的任务   模拟耗时操作
            while (current < amount) {
                try {
                    Thread.currentThread().sleep(50);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                current++;
            }
        }
    }

    public static void main(String[] args) {
        new JProgressTest3().init();
    }
}
