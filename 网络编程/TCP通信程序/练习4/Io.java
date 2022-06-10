package Java.网络编程.TCP通信程序.练习4;

import java.io.*;

public class Io {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(
                new FileReader("C:\\Users\\86159\\IdeaProjects\\untitled\\src\\字IO流\\字符流\\复制java文件_字符缓冲改进版\\CopyJavaDemo01.java")
        );
        BufferedWriter bw = new BufferedWriter(
                new FileWriter("untitled1\\CopyJavaDemo01.java")
        );
        String len;
        while ((len = br.readLine()) != null) {
            bw.write(len);
            bw.newLine();
            bw.flush();
        }
        bw.close();
        br.close();
    }
}
