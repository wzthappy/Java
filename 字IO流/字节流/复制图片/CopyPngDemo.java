package Java.字IO流.字节流.复制图片;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
    需求:
        把F:\\java\\File\\bg.png复制到模块目录下的"mn.png"

    思路:
        1,根据数据源创建字节输入流对象
        2,根据目的地创建字节输出流对象
        3,读写数据,复制图片(一次读取一个字节数组,一次写入一个字节数组)
        4,释放资源
 */
public class CopyPngDemo {
    public static void main(String[] args) throws IOException {
        //1,根据数据源创建字节输入流对象
        FileInputStream fis = new FileInputStream("F:\\java\\File\\bg.png");
        //2,根据目的地创建字节输出流对象
        FileOutputStream fos = new FileOutputStream("untitled1\\mn.png");
        //3,读写数据,复制图片(一次读取一个字节数组,一次写入一个字节数组)
        byte[] bye = new byte[1024];
        int len;
        while ((len = fis.read(bye)) != -1) {
            fos.write(bye,0,len);
        }
        // 4,释放资源
        fos.close();
        fis.close();
    }
}
