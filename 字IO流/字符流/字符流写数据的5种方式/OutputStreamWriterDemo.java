package Java.字IO流.字符流.字符流写数据的5种方式;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/*
                       //void flush(); 刷新流
                       //void close();  关闭流，先刷新
    构造方法:
        OutputStreamWriter(OutputStream out);  创建一个使用默认字符编码的OutputStreamWriter

     写数据的5种方式:
        void write(int c);  写一个字符
        void write(char[] cbuf);  写入一个字符数组
        void write(char[] cbuf, int off, int len);  写入字符数组的一部分
        void write(String str);  写一个字符串
        void write(String str, int off, int len);  写一个字符串的一部分
 */
public class OutputStreamWriterDemo {
    public static void main(String[] args) throws IOException {
        OutputStreamWriter osw = new OutputStreamWriter(
                new FileOutputStream("untitled1\\osw.txt")
        );
        //  void write(int c);  写一个字符
        osw.write(97);
        //void flush(); 刷新流
        osw.flush();
        osw.write(98);
        osw.flush();
        osw.write(99);

        // void write(char[] cbuf);  写入一个字符数组
        char[] chs = {'a','b','c','d','e','\r','\n'};
        osw.write(chs);
        //void write(char[] cbuf, int off, int len);  写入字符数组的一部分
        osw.write(chs,0,chs.length); // 0 开始到 chs.length
        osw.write(chs,1,3);    //1  开始到  3   bcd

        //void write(String str);  写一个字符串
        osw.write("中国aaa\r\n");

        //void write(String str, int off, int len);  写一个字符串的一部分
        osw.write("中国adddd",0,"中国adddd".length());
        osw.write("中国adddd",1,3);            //国ad

        //释放资源
        osw.close();
//        osw.write(99);   //Exception in thread "main" java.io.IOException: Stream closed
    }
}
