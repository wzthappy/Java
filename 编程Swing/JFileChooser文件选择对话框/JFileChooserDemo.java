package Java.编程Swing.JFileChooser文件选择对话框;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class JFileChooserDemo {
    //创建窗口对象
    JFrame jf = new JFrame("测试JFileChooser");

    //创建菜单条
    JMenuBar jmb = new JMenuBar();
    //创建菜单
    JMenu jMenu = new JMenu("文件");

    JMenuItem open = new JMenuItem(new AbstractAction("打开") {
        @Override
        public void actionPerformed(ActionEvent e) {
            //显示一个文件选择器
            JFileChooser fileChooser = new JFileChooser(".");
            fileChooser.showOpenDialog(jf);

            //获取用户选择的文件
            File file = fileChooser.getSelectedFile();

            //进行显示
            try {
                image = ImageIO.read(file);
                drawAres.repaint();
            } catch (IOException ex) {
                ex.printStackTrace();
            }

        }
    });

    JMenuItem save = new JMenuItem(new AbstractAction("另存为") {
        @Override
        public void actionPerformed(ActionEvent e) {
            //显示一个文件选择器
            JFileChooser fileChooser = new JFileChooser(".");
            fileChooser.showSaveDialog(jf);

            //获取用户选择的保存文件
            File file = fileChooser.getSelectedFile();

            try {
                ImageIO.write(image,"png",file);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    });

    BufferedImage image;

    //swing提供的组件，都提供了图像缓冲区技术
    public class MyCanvas extends JPanel {
        @Override
        public void paint(Graphics g) {
            //把图片绘制到组件上
            g.drawImage(image,0,0,null);
        }
    }

    MyCanvas drawAres = new MyCanvas();

    public void init() {
        //组装视图
        jMenu.add(open);
        jMenu.add(save);

        jmb.add(jMenu);

        jf.setJMenuBar(jmb);

        drawAres.setPreferredSize(new Dimension(740,500));
        jf.add(drawAres);

        //显示jf
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.pack();
        jf.setVisible(true);
    }

    public static void main(String[] args) {
        new JFileChooserDemo().init();
    }
}
