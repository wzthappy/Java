package Java.字IO流.字节流.复制文本文件;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
    需求:
        把"F:\\java\\pp.txt" 复制到模块目录下的"窗里窗外.txt"

        数据源:
            F:\\java\\pp.txt ---- 读数据 --- InputStream ----  FileInputStream
        目的地:
            untitled1\\窗里窗外.txt --- 写数据 --- OutputStream --- FileOutputStream

    思路:
        1,根据数据源创建字节输入流对象
        2,根据目的地创建字节输出流对象
        3,读写数据,复制文本文件(一次读取一个字节,一次写入一个字节)
        4,释放资源
 */
public class CopyTxtDemo {
    public static void main(String[] args) throws IOException {
        //1,根据数据源创建字节输入流对象
        FileInputStream fis = new FileInputStream("F:\\java\\pp.txt");
       // 2,根据目的地创建字节输出流对象
        FileOutputStream fos = new FileOutputStream("untitled1\\窗里窗外.txt");
        //3,读写数据,复制文本文件(一次读取一个字节,一次写入一个字节)
        int by;
        while ((by = fis.read()) != -1) {
            fos.write(by);
        }
        fis.close();
        fos.close();
    }
}
