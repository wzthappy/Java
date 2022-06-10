package Java.综合案例.黑马案例.ui;

import Java.综合案例.黑马案例.component.BackGroundPanel;
import Java.综合案例.黑马案例.util.PathUtils;
import Java.综合案例.黑马案例.util.ScreenUtils;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class RegisterInterface {
    JFrame jf = new JFrame("注册");

    final int WIDTH = 500;
    final int HEIGHT = 400;

    //组装视图
    public void init() throws Exception {
        //设置窗口属性
        jf.setBounds((ScreenUtils.getScreenWidth() - WIDTH) / 2, (ScreenUtils.getScreenHeight() - HEIGHT) / 2, WIDTH, HEIGHT);
        jf.setResizable(false);
        jf.setIconImage(ImageIO.read(new File(PathUtils.getRealPath("smile2.png"))));

        BackGroundPanel bgPanel = new BackGroundPanel(ImageIO.read(new File(PathUtils.getRealPath("bg.png"))));
        bgPanel.setBounds(0,0,WIDTH,HEIGHT);

        Box vBox = Box.createVerticalBox();

        //组装用户名
        Box uBox = Box.createHorizontalBox();
        JLabel uLabel = new JLabel("用户名:");
        JTextField uField = new JTextField(15);

        uBox.add(uLabel);
        uBox.add(Box.createHorizontalStrut(20));
        uBox.add(uField);

        //组装密码
        Box pBox = Box.createHorizontalBox();
        JLabel pLabel = new JLabel("密    码:");
        JTextField pField = new JTextField(15);

        pBox.add(pLabel);
        pBox.add(Box.createHorizontalStrut(20));
        pBox.add(pField);

        //组装手机号
        Box tBox = Box.createHorizontalBox();
        JLabel tLabel = new JLabel("手机号:");
        JTextField tField = new JTextField(15);

        tBox.add(tLabel);
        tBox.add(Box.createHorizontalStrut(20));
        tBox.add(tField);

        //组装性别
        Box gBox = Box.createHorizontalBox();
        JLabel gLabel = new JLabel("性    别:");
        JRadioButton maleBtn = new JRadioButton("男",true);
        JRadioButton femaleBtn = new JRadioButton("女",false);
        //实现单选的效果
        ButtonGroup bg = new ButtonGroup();
        bg.add(maleBtn);
        bg.add(femaleBtn);

        gBox.add(gLabel);
        gBox.add(Box.createHorizontalStrut(20));
        gBox.add(maleBtn);
        gBox.add(femaleBtn);
        gBox.add(Box.createHorizontalStrut(120));

        //组装验证码
        Box cBox = Box.createHorizontalBox();
        JLabel cLabel = new JLabel("验证码:");
        JTextField cField = new JTextField(4);
        JLabel cImg = new JLabel("无资源...");
        cImg.setForeground(Color.RED);
        //给某个组件设置提示消息
        cImg.setToolTipText("点击刷新");

        cImg.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                cImg.setText("无图片...");
                cImg.updateUI();
            }
        });

        cBox.add(cLabel);
        cBox.add(Box.createHorizontalStrut(20));
        cBox.add(cField);
        cBox.add(cImg);

        //组装按钮
        Box btnBox = Box.createHorizontalBox();
        JButton registBtn = new JButton("注册");
        JButton backBtn = new JButton("返回登录页面");

        registBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //获取用户录入的消息
                String username = uField.getText().trim();
                String password = pField.getText().trim();
                String phone = tField.getText().trim();
                String gender = bg.isSelected(maleBtn.getModel()) ? maleBtn.getText() : femaleBtn.getText();
                String checkCode = cField.getText().trim();


                Map<String,String> params = new HashMap<>();
                params.put("usermame",username);
                params.put("password",password);
                params.put("phone",phone);
                params.put("gender",gender);
                params.put("checkCode",checkCode);
                //访问后台接口
                //...............
                //无资源
                JOptionPane.showMessageDialog(jf,"注册成功，即将返回登录页面");
                try {
                    new MainInterface().init();
                    jf.dispose();
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });

        backBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //返回到登录页面
                try {
                    new MainInterface().init();
                    jf.dispose();
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });

        btnBox.add(registBtn);
        btnBox.add(Box.createHorizontalStrut(80));
        btnBox.add(backBtn);


        vBox.add(Box.createVerticalStrut(50));
        vBox.add(uBox);
        vBox.add(Box.createVerticalStrut(20));
        vBox.add(pBox);
        vBox.add(Box.createVerticalStrut(20));
        vBox.add(tBox);
        vBox.add(Box.createVerticalStrut(20));
        vBox.add(gBox);
        vBox.add(Box.createVerticalStrut(20));
        vBox.add(cBox);
        vBox.add(Box.createVerticalStrut(20));
        vBox.add(btnBox);


        bgPanel.add(vBox);

        jf.add(bgPanel);

        jf.setVisible(true);
    }

//    public static void main(String[] args) {
//        try {
//            new RegisterInterface().init();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
}
