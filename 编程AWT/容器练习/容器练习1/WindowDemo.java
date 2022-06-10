package Java.编程AWT.容器练习.容器练习1;

import java.awt.*;

public class WindowDemo {
    public static void main(String[] args) {
        //1，创建一个窗口对象
        Frame frame = new Frame("这是测试window窗口");

        //2，指定窗口的位置，大小
        frame.setLocation(100,100);
        frame.setSize(500,300);

        //3，设置窗口对象可见
        frame.setVisible(true);
    }
}
