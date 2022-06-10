package Java.字IO流.字符流.字符缓冲流;

import java.io.*;

/*
    字节缓冲流:
        BufferedWriter: 将文本写入字符输出流，缓冲字符，以提供单个字符，数组和字符串的高效写入，可以指定缓冲区大小，默认的足够大
        BufferedReader: 从字符输入流读取文件，缓冲字符，以提供字符，数组和行的高效读取，可以指定缓冲区大小，默认的足够大

    构造方法:
        BufferedWriter(Writer out);
        BufferedReader(Reader in);
 */
public class BufferedStreamDemo01 {
    public static void main(String[] args) throws IOException {
        // BufferedWriter(Writer out);
        /*
       FileWriter fw = new FileWriter("untitled1\\bw.txt");
       BufferedWriter bw = new BufferedWriter(fw);   ==
         */
        BufferedWriter bw = new BufferedWriter(new FileWriter("untitled1\\bw.txt"));
        bw.write("中国hello\r\n");
        bw.write("world\r\n");
        bw.close();

        // BufferedReader(Reader in);
        BufferedReader br = new BufferedReader(new FileReader("untitled1\\bw.txt"));
        //一次读一个字符数据
//        int by;
//        while ((by = br.read()) != -1) {
//            System.out.print((char) by);
//        }

        //一次读一个字符数组数据
        char[] chs = new char[1024];
        int len;
        while ((len = br.read(chs)) != -1) {
            System.out.println(new String(chs,0,len));
        }

    }
}
