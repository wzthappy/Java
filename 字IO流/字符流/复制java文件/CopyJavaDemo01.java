package Java.字IO流.字符流.复制java文件;

import java.io.*;

/*
    需求:
        把模块目录下的"。。。。.java" 复制到模块目录下的Copy.java

    思路:
        1,根据数据源创建字符输入流对象
        2,根据目的地创建字符输出流对象
        3,读写数据，复制文件
        4,释放资源
 */
public class CopyJavaDemo01 {
    public static void main(String[] args) throws IOException {
        //1,根据数据源创建字符输入流对象
        InputStreamReader isr = new InputStreamReader(
                new FileInputStream("C:\\Users\\86159\\IdeaProjects\\untitled\\src\\字IO流\\字符流\\字符流写数据的5种方式\\OutputStreamWriterDemo.java")
        );
//        2,根据目的地创建字符输出流对象
        OutputStreamWriter osw = new OutputStreamWriter(
                new FileOutputStream("untitled1\\Copy.java")
        );
        //3,读写数据，复制文件
        //一次读 一个字符 数据
//        int ch;
//        while ((ch = isr.read()) != -1) {
//            osw.write(ch);
//        }
        //一次读写一个 字符数组 数据
        char[] chs = new char[1024];
        int len;
        while ((len = isr.read(chs)) != -1) {
            osw.write(chs,0,len);
        }

        //4,释放资源
        isr.close();
        osw.close();
    }
}
