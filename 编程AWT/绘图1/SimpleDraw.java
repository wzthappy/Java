package Java.编程AWT.绘图1;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class SimpleDraw {
    private final String RECT_SHAPE="rect";
    private final String OVAL_SHAPE="oval";

    private Frame frame = new Frame("这里测试绘图");

    Button btnReact = new Button("绘制矩形");
    Button btnOval = new Button("绘制椭圆");

    //定义一个变量，记录当前要绘制椭圆还是矩形
    private String shape = "";

    //自定义类，继承Canvas类，重写paint(Graphics g);方法完成画图;
    private class MyCanvas extends Canvas {
        @Override
        public void paint(Graphics g) {
            //绘制不同的图形
            if (shape.equals(RECT_SHAPE)) {
                //绘制矩形
                g.setColor(Color.BLACK);  //设置当前画笔的颜色为黑色
                g.drawRect(100,100,150,100);
            } else if(shape.equals(OVAL_SHAPE)) {
                //绘制椭圆
                g.setColor(Color.red);
                g.drawOval(100,100,150,100);
            }
        }
    }

    //创建自定义的画布对象
    MyCanvas drawArea = new MyCanvas();

    public void init() {
        //组装视图
        btnReact.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //修改标记的值为rect
                shape = RECT_SHAPE;
                drawArea.repaint();
            }
        });
        btnOval.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //修改标记的值为oval
                shape = OVAL_SHAPE;
                drawArea.repaint();
            }
        });

        //创建Panel，承载按钮
        Panel p = new Panel();
        p.add(btnReact);
        p.add(btnOval);
        frame.add(p,BorderLayout.SOUTH);

        //drawArea的大小需要设置
        drawArea.setPreferredSize(new Dimension(300,200));

        frame.add(drawArea);


        frame.pack();
        frame.setVisible(true);

        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        new SimpleDraw().init();
    }
}
