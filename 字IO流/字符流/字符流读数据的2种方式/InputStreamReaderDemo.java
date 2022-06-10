package Java.字IO流.字符流.字符流读数据的2种方式;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/*
    构造方法:
        InputStreamReader(InputStream in);  创建一个使用默认字符集的InputStreamReader

    读数据的2种方法:
        int read();  一次读一个字符数据
        int read(char[] cbuf);  一次读一个字符数组数据
 */
public class InputStreamReaderDemo {
    public static void main(String[] args) throws IOException {
        //InputStreamReader(InputStream in);  创建一个使用默认字符集的InputStreamReader
        InputStreamReader isr = new InputStreamReader(
                new FileInputStream("C:\\Users\\86159\\IdeaProjects\\untitled\\src\\字IO流\\字符流\\字符流写数据的5种方式\\OutputStreamWriterDemo.java")
        );
        // int read();  一次读一个字符数据
//        int ch;
//        while ((ch = isr.read()) != -1) {
//            System.out.print((char) ch);
//        }

        //int read(char[] cbuf);  一次读一个字符数组数据
        char[] chs = new char[1024];
        int ch2;
        while ((ch2 = isr.read(chs)) != -1) {
            System.out.println(new String(chs,0,ch2));
        }

        isr.close();
    }
}
