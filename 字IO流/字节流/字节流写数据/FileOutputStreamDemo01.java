package Java.字IO流.字节流.字节流写数据;

import java.io.FileOutputStream;
import java.io.IOException;

/*
     FileOutputStream: 文件输出流用于将数据写入File。
            FileOutStream(String name);  创建文件输出流以指定的名称写入文件
 */
public class FileOutputStreamDemo01 {
    public static void main(String[] args) throws IOException {
        //创建字节输出流对象
        //FileOutStream(String name);  创建文件输出流以指定的名称写入文件
        FileOutputStream fos = new FileOutputStream("FileOutputStream.txt");
        /*
            做了三件事情:
                A:调用系统功能创建了文件
                B:创建了字节流输出对象
                C:让字节输出流对象指向创建好的文件
         */
        //void write(int b);  将指定的字节写入此文件输出流
        fos.write(97);    //97  ==  'a'
        fos.write(57);    //57  ==  '9'
        fos.write(55);    //55  ==  '7'

        //最后都要释放资源
        //void close();   关闭此文件输出流并释放与此流相关联的任何系统资源
        fos.close();
    }
}