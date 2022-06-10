package Java.字IO流.字节流.字节流读数据_一次读一个字节数据;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
    需求:
        把文件fos.txt中的内容读取出来在控制台输出

    FileInputStream: 从文件系统中的文件获取输入字节
        FileInputStream(String name);  通过打开与实际文件的连续来创建一个FileInputStream，
                                                        该文件由文件系统中的路径名name

    使用字节输入流读数据的步骤:
        1，创建字节输入流对象
        2，调用字节输入流对象的读数据方法
        3，释放资源
 */
public class FileInputStreamDemo01 {
    public static void main(String[] args) throws IOException {
        //1，创建字节输入流对象
        //  FileInputStream(String name);
        FileOutputStream fil = new FileOutputStream("untitled1\\fos.txt");
        fil.write("henl\neee".getBytes());

        FileInputStream fis = new FileInputStream("untitled1\\fos.txt");

        //2，调用字节输入流对象的读数据方法
        //int redd();  从该输入流读取一个字节的数据
        //第一次读取数据
//        int by = fis.read();
//        System.out.println(by);
//        System.out.println((char) by);
//        //第二次读取数据
//        by = fis.read();
//        System.out.println(by);
//        System.out.println((char) by);
//        //最后没有数据的读取     返回值是 -1
//        by = fis.read();
//        System.out.println(by);

        /*
            如果到达文件的末尾  -1
         */
//        int by2 = fis.read();
//        while (by2 != -1) {
//            System.out.print((char) by2);
//            by2 = fis.read();
//        }
        //优化
        int by3;
        /*
            fis.read();  读数据
            by3 = fis.read();  把读到的数据赋值给by3
            by3 != -1;   判断读取到的数据是否是 -1
         */
        while ((by3 = fis.read()) != -1) {
            System.out.print((char) by3);
        }

        // 3，释放资源
        fis.close();
    }
}
