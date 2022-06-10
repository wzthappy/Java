package Java.编程AWT.BoxLayout_盒子布局;

import javax.swing.*;
import java.awt.*;

public class BoxLayoutDemo01 {
    public static void main(String[] args) {
        Frame frame = new Frame();

        //1，基于frane容器，创建一个BoxLayout对象，并且，该对象存放组件是垂直存放
        BoxLayout boxLayout = new BoxLayout(frame, BoxLayout.Y_AXIS);

        //2，把BoxLayout对象设置给Frame
        frame.setLayout(boxLayout);

        //3，frame中添加两个按钮组件
        frame.add(new Button("按钮1"));
        frame.add(new Button("按钮2"));

        frame.pack();
        frame.setVisible(true);
    }
}
