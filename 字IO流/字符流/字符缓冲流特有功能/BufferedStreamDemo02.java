package Java.字IO流.字符流.字符缓冲流特有功能;

import java.io.*;

/*
    字符缓冲流的特有功能
        BufferedWriter:
            void newLine();  写一行行分隔符，行分隔符字符串由系统属性定义

        BufferedReader:
            public String readLine();  读一行文字。
                结果包含行的内容的字符串，不包含任何行终止字符，如果流的结尾已经达到，则为null
 */
public class BufferedStreamDemo02 {
    public static void main(String[] args) throws IOException {
        //创建字符缓冲输出流
        BufferedWriter bw = new BufferedWriter(new FileWriter("untitled1\\bw.txt"));

        //写数据
        for (int i = 0; i < 10; i++) {
            bw.write("hello"+i);
//            bw.write("\r\n");
            // void newLine();  写一行行分隔符，行分隔符字符串由系统属性定义
            bw.newLine();
            bw.flush();
        }

        bw.close();

        //创建字符缓冲输入流
        BufferedReader br = new BufferedReader(new FileReader("untitled1\\bw.txt"));

        //读数据
        //public String readLine();  读一行文字。
//        //第一次读写数据
//        System.out.println(br.readLine());
//        //第二次读写数据
//        System.out.println(br.readLine());
//        //最后一次读写数据                           null
//        System.out.println(br.readLine());
        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }

        br.close();
    }
}
