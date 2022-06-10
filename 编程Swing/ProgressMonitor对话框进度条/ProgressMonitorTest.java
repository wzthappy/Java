package Java.编程Swing.ProgressMonitor对话框进度条;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ProgressMonitorTest {
    Timer timer;

    public void init() {
        //创建进度对话框
        ProgressMonitor monitor = new ProgressMonitor(null,"等待任务完成","已完成",0,100);

        SimulaterActivity simulaterActivity = new SimulaterActivity(100);
        new Thread(simulaterActivity).start();

        //设置定时任务
        timer = new Timer(200, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //读取当前任务量，修改进度
                int current = simulaterActivity.getCurrent();
                monitor.setProgress(current);

                //判断用户是否点击了取消按钮，停止定时任务，关闭对话框，退出程序
                if (monitor.isCanceled()) {
                    timer.stop();
                    monitor.close();
                    System.exit(0);
                }
            }
        });
        timer.start();
    }

    public static void main(String[] args) {
        new ProgressMonitorTest().init();
    }

    //定义一个线程任务，模拟耗时操作
    private class SimulaterActivity implements Runnable {
        //内存可见
        private volatile int current = 0;
        private int amount;

        public SimulaterActivity(int amount) {
            this.amount = amount;
        }

        public int getCurrent() {
            return current;
        }

        public void setCurrent(int current) {
            this.current = current;
        }

        public int getAmount() {
            return amount;
        }

        public void setAmount(int amount) {
            this.amount = amount;
        }

        @Override
        public void run() {
            //通过循环，不断的修改current的值，模拟任务完成量
            while (current < amount) {
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                current++;
            }
        }
    }
}
