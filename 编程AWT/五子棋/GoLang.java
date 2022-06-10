package Java.编程AWT.五子棋;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.image.BufferedImage;
import java.io.File;

public class GoLang {
    //定义五子棋游戏窗口
    private JFrame f = new JFrame("五子棋游戏");

    //声明四个BufferedImage对象，分别记录四张图片
    BufferedImage table;
    BufferedImage black;
    BufferedImage white;
    BufferedImage selected;

    //声明棋盘的宽和高
    final int TABLE_WIDTH = 560;
    final int TABLE_HEIGHT = 560;

    //声明棋盘横向和纵向分别可以下多少子，他们的值都为14
    final int BOARD_SIZE = 13;

    //声明每个棋子占用棋牌的比率
    final int RATE = TABLE_WIDTH / BOARD_SIZE;

    //声明变量，记录棋子对于x反向和y反向的偏移量
    final int X_OFFSET = TABLE_WIDTH / BOARD_SIZE / 2;
    final int Y_OFFSET = TABLE_WIDTH / BOARD_SIZE / 2;

    //声明一个二维数组，记录棋子，如果索引[i][j]处的值为 0-没有棋子 1-白棋 2-黑棋
    int[][] board = new int[BOARD_SIZE][BOARD_SIZE];

    //声明红色选择框的坐标  该坐标其实就是二维数组中的索引
    int selected_X = -1;
    int selected_Y = -1;

    //自定义类，继承Canvas
    private class ChesBoard extends JPanel {
        @Override
        public void paint(Graphics g) {
            //绘图
            //绘制棋盘
            g.drawImage(table, 0, 0, null);
            //绘制选择框
            if (selected_X > 0 && selected_Y > 0) {
                g.drawImage(selected, selected_X * RATE + X_OFFSET, selected_Y * RATE + Y_OFFSET, null);
            }
            //绘制棋子
            for (int i = 0; i < BOARD_SIZE; i++) {
                for (int j = 0; j < BOARD_SIZE; j++) {

                    //绘制黑棋
                    if (board[i][j] == 2) {
                        g.drawImage(black, i * RATE + X_OFFSET, j * RATE + Y_OFFSET, null);
                    }
                    //绘制白棋
                    if (board[i][j] == 1) {
                        g.drawImage(white, i * RATE + X_OFFSET, j * RATE + Y_OFFSET, null);
                    }
                }
            }
        }
    }

    ChesBoard chesBoard = new ChesBoard();

    //声明变量，记录当前下棋的颜色
    int board_type = 2;

    //声明底部需要用的组件
    Panel p = new Panel();
    Button whiteBtn = new Button("白棋");
    Button blackBtn = new Button("黑棋");
    Button deleteBtn = new Button("删除");

    public void refreshBtuColor(Color whiteBtnColor, Color blackBtnColor, Color deleteBtnColor) {
        whiteBtn.setBackground(whiteBtnColor);
        blackBtn.setBackground(blackBtnColor);
        deleteBtn.setBackground(deleteBtnColor);
    }

    public void init() throws Exception {
        //组装视图，编写逻辑
        whiteBtn.addActionListener(e -> {
            //修改当前要下的棋子的标志为1
            board_type = 1;

            //刷新按钮的颜色
            refreshBtuColor(Color.GREEN, Color.GRAY, Color.GRAY);
        });

        blackBtn.addActionListener(e -> {
            //修改当前要下的棋子的标志为2
            board_type = 2;

            //刷新按钮的颜色
            refreshBtuColor(Color.GRAY, Color.GREEN, Color.GRAY);
        });

        deleteBtn.addActionListener(e -> {
            //修改当前要下的棋子的标志为0
            board_type = 0;

            //刷新按钮的颜色
            refreshBtuColor(Color.GRAY, Color.GRAY, Color.GREEN);
        });

        p.add(whiteBtn);
        p.add(blackBtn);
        p.add(deleteBtn);

        f.add(p, BorderLayout.SOUTH);

        //组装棋盘
        //初始化图片
        table = ImageIO.read(new File("C:\\Users\\86159\\IdeaProjects\\untitled\\src\\编程AWT_Swing\\五子棋\\img\\ban.png"));
        white = ImageIO.read(new File("C:\\Users\\86159\\IdeaProjects\\untitled\\src\\编程AWT_Swing\\五子棋\\img\\bai.jpg"));
        black = ImageIO.read(new File("C:\\Users\\86159\\IdeaProjects\\untitled\\src\\编程AWT_Swing\\五子棋\\img\\hai.jpg"));
        selected = ImageIO.read(new File("C:\\Users\\86159\\IdeaProjects\\untitled\\src\\编程AWT_Swing\\五子棋\\img\\jia.jpg"));
        //处理鼠标移动
        chesBoard.addMouseMotionListener(new MouseMotionAdapter() {
            //当鼠标移动时调用该方法
            @Override
            public void mouseMoved(MouseEvent e) {
                selected_X = (e.getX() - X_OFFSET) / RATE;
                selected_Y = (e.getY() - Y_OFFSET) / RATE;

                chesBoard.repaint();
            }
        });

        //处理鼠标点击
        chesBoard.addMouseListener(new MouseAdapter() {
            //当鼠标被点击后 会调用这个方法
            @Override
            public void mouseClicked(MouseEvent e) {
                int xPos = (e.getX()-X_OFFSET)/RATE;
                int yPos = (e.getY()-Y_OFFSET)/RATE;

                board[xPos][yPos] = board_type;
                chesBoard.repaint();
            }

            //当鼠标移除了棋盘
            @Override
            public void mouseExited(MouseEvent e) {
                selected_X = -1;
                selected_Y = -1;
                chesBoard.repaint();
            }
        });

        chesBoard.setPreferredSize(new Dimension(TABLE_WIDTH, TABLE_HEIGHT));
        f.add(chesBoard);

        //设置frame最佳大小并可见
        f.pack();
        f.setVisible(true);
    }

    public static void main(String[] args) throws Exception {
        new GoLang().init();
    }
}
