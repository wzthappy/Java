package Java.编程AWT.GUI事件处理机制;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventDemo01 {

    Frame frame = new Frame("这里测试事件处理");

    TextField tf = new TextField(30);

    //事件源
    Button ok = new Button("确定");

    public void init() {
        //组装视图
        //监听器
//        MyListener myListener = new MyListener();

        //注册监听
        ok.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("ok被点击了...");
                tf.setText("Hello World");
            }
        });

        //把tf和ok放入Frame中
        frame.add(tf,BorderLayout.NORTH);
        frame.add(ok);

        frame.pack();
        frame.setVisible(true);
    }

//    private class MyListener implements ActionListener {
//
//        @Override
//        public void actionPerformed(ActionEvent e) {
//            tf.setText("Hello World");
//        }
//    }

    public static void main(String[] args) {
        new EventDemo01().init();
    }
}
