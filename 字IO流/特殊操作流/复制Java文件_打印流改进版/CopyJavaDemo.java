package Java.字IO流.特殊操作流.复制Java文件_打印流改进版;

import java.io.*;

/*
    需求:
        把模块目录下的PrintStreamDemo.java 复制到模块目录下的 Copy.java

    思路:
        1，根据数据源创建字符输出流对象
        2，根据目的地创建字符输入流对象
        3，读写数据，复制文件
        4，释放资源
 */
public class CopyJavaDemo {
    public static void main(String[] args) throws IOException {
        /*
        //1，根据数据源创建字符输出流对象
        BufferedReader br = new BufferedReader(
                new FileReader("src\\字IO流\\特殊操作流\\字节打印流\\PrintStreamDemo.java")
        );
        //2，根据目的地创建字符输入流对象
        BufferedWriter bw = new BufferedWriter(
                new FileWriter("untitled1\\Copy.java")
        );

        // 3，读写数据，复制文件
        String line;
        while ((line = br.readLine()) != null) {
            bw.write(line);
            bw.newLine();
            bw.flush();
        }
        //4，释放资源
        br.close();
        bw.close();
    }
         */
        //1，根据数据源创建字符输出流对象
        BufferedReader br = new BufferedReader(
                new FileReader("src\\字IO流\\特殊操作流\\字节打印流\\PrintStreamDemo.java")
        );
        //2，根据目的地创建字符输入流对象
        PrintWriter pw = new PrintWriter(
                new FileWriter("untitled1\\Copy.java"), true
        );
        // 3，读写数据，复制文件
        String line;
        while ((line = br.readLine()) != null) {
            pw.println(line);
        }
        //4，释放资源
        br.close();
        pw.close();
    }
}
