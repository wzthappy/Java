package Java.字IO流.特殊操作流.标准输入流;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/*
    public static final InputSteam in;  标准输入流。通常该流对应于键盘输入或由主机环境或用户指定的另一个输入源

 */
public class SystemInDemo {
    public static void main(String[] args) throws IOException {
        //public static final InputSteam in;  标准输入流。
//        1,  InputStream is = System.in;

//        int by;
//        while ((by = is.read()) != -1) {
//            System.out.println((char)by);
//        }

        //如何把字节流转换为字符流? 用转换流
//       2, InputStreamReader isr = new InputStreamReader(is);
        //使用字符流一次读取一行数据
        //但是，一次读取一行数据的方法是字符缓冲输入流的特有方法
//        3,  BufferedReader br = new BufferedReader(isr);
        //1,2,3
        BufferedReader br = new BufferedReader(
          new InputStreamReader(System.in)
        );
        System.out.println("请输入一个字符串:");
        String line = br.readLine();
        System.out.println("你输入的字符串是: " + line);

        System.out.println("请输入一个整数: ");
        int i = Integer.parseInt(br.readLine());
        System.out.println("你输入的整数是: " + i);

        //自己实现键盘录入太麻烦了，所有Java就提供了一个类供我们使用
        Scanner sc = new Scanner(System.in);
    }
}