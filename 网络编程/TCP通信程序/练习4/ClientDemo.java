package Java.网络编程.TCP通信程序.练习4;

import java.io.*;
import java.net.Socket;

/*
    客户端: 数据来自于文本文件
 */
public class ClientDemo {
    public static void main(String[] args) throws IOException {
        //创建客户端Socket对象
        Socket s = new Socket("192.168.1.103",10000);

        //封装文本文件的数据
        BufferedReader br = new BufferedReader(
                new FileReader("untitled1\\CopyJavaDemo01.java")
        );
        //封装输出流写数据
        BufferedWriter bw = new BufferedWriter(
                new OutputStreamWriter(s.getOutputStream())
        );
        String line;
        while ((line = br.readLine()) != null) {
            bw.write(line);
            bw.newLine();
            bw.flush();
        }
        //释放资源
        br.close();
        s.close();
    }
}
