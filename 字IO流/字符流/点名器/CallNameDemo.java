package Java.字IO流.字符流.点名器;

import java.io.*;
import java.util.ArrayList;
import java.util.Random;

/*
    需求:
        我有一个文件里面存储了班级同学的姓名，每一个姓名占一行，要求通过程序实现随机点名

    思路:
        1，创建字符缓冲输出流对象
        2，创建ArrayList集合对象
        3，调用字符缓冲输入流对象的方法读数据
        4，把读取到的数据存储到集合中
        5，释放资源
        6，使用Random 产生一个随机数，随机数的范围在:[0，集合的长度)
        7，把第6步产生的随机数作为索引到ArrayList集合中获取值
        8，把第7步得到的数据输出在控制台
 */
public class CallNameDemo {
    public static void main(String[] args) throws IOException {
        //文件   字节缓冲流
        BufferedOutputStream bos = new BufferedOutputStream(
                new FileOutputStream("untitled1\\bos.txt")
        );
        String[] a = {"王","说","将","的"};
        String[] b = {"开始","多级","绝对","不断"};
        for (String s : a){
            for (String k : b) {
                bos.write((s+k).getBytes());
                bos.write("\r\n".getBytes());
                bos.flush();
            }
        }

        //  1，创建字符缓冲输出流对象
        BufferedReader br = new BufferedReader(new FileReader("untitled1\\bos.txt"));
        // 2，创建ArrayList集合对象
        ArrayList<String> array = new ArrayList<String>();
        //3，调用字符缓冲输入流对象的方法读数据
        String line;
        while ((line = br.readLine()) != null) {
            // 4，把读取到的数据存储到集合中
            array.add(line);
        }
        //5，释放资源
        br.close();
        // 6，使用Random 产生一个随机数，随机数的范围在:[0，集合的长度)
        Random r = new Random();
        int index = r.nextInt(array.size());
        //7，把第6步产生的随机数作为索引到ArrayList集合中获取值
        String name = array.get(index);
        //8，把第7步得到的数据输出在控制台
        System.out.println("幸运者是: " + name);
    }
}
