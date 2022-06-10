package Java.字IO流.字节流.字节流写数据加入异常处理;

import java.io.FileOutputStream;
import java.io.IOException;

/*
    字节流写数据加入异常处理
 */
public class FileOutputStreamDemo04 {
    public static void main(String[] args) {
//        try {
//            FileOutputStream fos = new FileOutputStream("untitled1\\fos.txt");
//            fos.write("hello".getBytes());
//            fos.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        //加入finally来实现释放资源
        FileOutputStream fos = null ;   // 要初始化
        try {
//            fos = new FileOutputStream("P:\\untitled1\\fos.txt");   //错误的
            fos = new FileOutputStream("untitled1\\fos.txt");
            fos.write("hello".getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fos != null) {
                try {
                    fos.close();     // 要防止空指针异常
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
