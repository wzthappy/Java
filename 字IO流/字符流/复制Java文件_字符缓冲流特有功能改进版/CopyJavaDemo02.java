package Java.字IO流.字符流.复制Java文件_字符缓冲流特有功能改进版;

import java.io.*;

/*
    需求:
        把模块目录下的“。。。.java” 复制到模块目录下的Copy.java

    思路:
        1，根据数据源创建字符缓冲输入流对象
        2，根据目的地创建字符缓冲输出流对象
        3，读写数据，复制文本
            使用字符缓冲流特有功能实现
        4，释放资源
 */
public class CopyJavaDemo02 {
    public static void main(String[] args) throws IOException {
        // 1，根据数据源创建字符缓冲输入流对象
        BufferedReader br = new BufferedReader(new FileReader("src\\字IO流\\字符流\\字符流中的编码解码问题\\ConversionStreamDemo.java"));
        // 2，根据目的地创建字符缓冲输出流对象
        BufferedWriter bw = new BufferedWriter(new FileWriter("untitled1\\Copy.java"));
        //3，读写数据，复制文本
        //      使用字符缓冲流特有功能实现
        String line;
        while ((line = br.readLine()) != null) {
            bw.write(line);
            bw.newLine();
            bw.flush();
        }

        br.close();
        bw.close();
    }
}
