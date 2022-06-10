package Java.字IO流.特殊操作流.字节打印流;

import java.io.FileNotFoundException;
import java.io.PrintStream;

/*
    打印流的特点:
        只负责输出数据，不负责读取数据
        有自己的特有方法

    字节打印流:
        PrintStream(String fileName);  使用指定的文件名创建新的打印流
 */
public class PrintStreamDemo {
    public static void main(String[] args) throws FileNotFoundException {
        //PrintStream(String fileName);  使用指定的文件名创建新的打印流
        PrintStream ps = new PrintStream("untitled1\\ps.txt");

        //写数据
        //字节输出流的方法
//        ps.write(97);   //a
        //使用特有的方法写数据
//        ps.print(97);
//        ps.println();
//        ps.print(98);
        ps.println(97);   //97
        ps.println(98);   //78

        //释放资源
        ps.close();
    }
}
