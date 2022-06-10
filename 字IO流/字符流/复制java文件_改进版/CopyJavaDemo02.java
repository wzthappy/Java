package Java.字IO流.字符流.复制java文件_改进版;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
    需求:
        把模块目录下的“。。。。.java” 复制到模块目录下的“Copy.java”

    数据源和目的地的分析:
        数据源: ".....java" \\  ...java --- 读数据 --- Reader --- InputStreamReader --- FileReader
        目的地: "Copy.java" \\ Copy.java --- 写数据 --- Writer --- OutputStreamWriter --- FileWriter

    思路:
        1，根据数据源创建字符输入流对象
        2，根据目的地创建字符输出流对象
        3，读写数据，复制文件
        4，释放资源
 */
public class CopyJavaDemo02 {
    public static void main(String[] args) throws IOException {
        //1，根据数据源创建字符输入流对象
        FileReader fr = new FileReader("C:\\Users\\86159\\IdeaProjects\\untitled\\src\\字IO流\\字符流\\字符串中的编码编码问题\\StringDemo.java");
        //  2，根据目的地创建字符输出流对象
        FileWriter fw = new FileWriter("untitled1\\Copy.java");
        //3，读写数据，复制文件
//        int ch;
//        while ((ch = fr.read()) != -1) {
//            fw.write(ch);
//        }
        char[] chs = new char[1024];
        int len;
        while ((len = fr.read(chs)) != -1) {
            fw.write(chs,0,len);
        }

        //  4，释放资源
        fr.close();
        fw.close();
    }
}
