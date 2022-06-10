package Java.字IO流.字符流.复制java文件_字符缓冲改进版;

import java.io.*;

/*
    需求:
        把模块目录下的“。。。.java” 复制到模块目录下的 Copy.java

    思路:
        1，根据数据源创建字符缓冲输入流对象
        2，根据目的地创建字符缓冲输出流对象
        3，读写数据，复制文件
        4，释放资源
 */
public class CopyJavaDemo01 {
    public static void main(String[] args) throws IOException {
        //1，根据数据源创建字符缓冲输入流对象
        BufferedReader br = new BufferedReader(new FileReader("src\\字IO流\\字符流\\复制java文件_改进版\\CopyJavaDemo02.java"));
        //2，根据目的地创建字符缓冲输出流对象
        BufferedWriter bw = new BufferedWriter(new FileWriter("untitled1\\Copy.java"));
        // 3，读写数据，复制文件
        //一次读写一个字符数据
//        int ch;
//        while ((ch = br.read()) != -1) {
//            bw.write(ch);
//        }


        //一次读写一个字符数组数据
        char[] cha = new char[1024];
        int len;
        while ((len = br.read(cha)) != -1) {
            bw.write(cha,0,len);
        }

        br.close();
        bw.close();
    }
}
