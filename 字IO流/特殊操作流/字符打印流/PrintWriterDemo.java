package Java.字IO流.特殊操作流.字符打印流;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/*
    字符打印流的构造方法:
        PrintWriter(String fileName);  使用指定的文件名创建一个新的PrintWriter，而不需要自动执行刷新

        PrintWriter(Writer out, boolean autoFlush);  创建一个新的PrintWriter
                out: 字符输出流
                autoFlush: 一个布尔值，如果为真，则println，printf，或format方法将刷新输出缓冲区
 */
public class PrintWriterDemo {
    public static void main(String[] args) throws IOException {
        // PrintWriter(String fileName);  使用指定的文件名创建一个新的PrintWriter，而不需要自动执行刷新
//        PrintWriter pw = new PrintWriter("untitled1\\pw.txt");
//        pw.write("hello");
//        pw.write("\r\n");
//        pw.flush();
//        pw.write(97);    //a
//        pw.flush();

//        pw.println("hello");  // pw.write("hello");    pw.write("\r\n");
//
//        pw.flush();
//        pw.println(79);
//        pw.flush();
//
        // PrintWriter(Writer out, boolean autoFlush);  创建一个新的PrintWriter
        //      out: 字符输出流
        //      autoFlush: 一个布尔值，如果为真，则println，printf，或format方法将刷新输出缓冲区
        PrintWriter pw = new PrintWriter(new FileWriter("untitled1\\pw.txt"),true);
        pw.println("hello");
        //pw.write("hello");
        //pw.write("\r\n");
        //pw.flush();
        pw.println(97);    //97
        pw.close();
    }
}
