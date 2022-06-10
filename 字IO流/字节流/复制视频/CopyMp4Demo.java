package Java.字IO流.字节流.复制视频;

import java.io.*;

/*
    需求:
        把"F:\\视频\\a1.mp4" 复制到模块目录下的 "字节流复制图片.mp4"

    思路:
        1,根据数据源创建字节输入流对象
        2,根据目的地创建字节输出流对象
        3,读写数据,复制图片(一次读取一个字节数组,一次写入一个数组)
        4,释放资源

    四种方式实现复制视频,并记录每种方式复制视频的时间
        1,基本字节流一次读写一个字节          // 共耗时: 111918毫秒
        2,基本字节流一次读写一个字节数组        //共耗时: 194毫秒
        3,字节缓冲流一次读写一个字节           //共耗时: 1002毫秒
        4,字节缓冲流一次读写一个字节数组           //共耗时: 67毫秒
 */
public class CopyMp4Demo {
    public static void main(String[] args) throws IOException {
        //记录开始时间
        long startTime = System.currentTimeMillis();

        //复制视频
//        method1();   //共耗时: 111918毫秒    1 ,  非常慢
//        method2();      //共耗时: 194毫秒
//        method3();    //共耗时: 1002毫秒
//        method4();      //共耗时: 67毫秒

        //记录结束时间
        long endTime = System.currentTimeMillis();
        System.out.println("共耗时: " + (endTime - startTime) + "毫秒");
    }
    //1,基本字节流一次读写一个字节
    public static void method1() throws IOException {
        FileInputStream fis = new FileInputStream("F:\\视频\\a1.mp4");
        FileOutputStream fos = new FileOutputStream("untitled1\\字节流复制图片.mp4");
        int by;
        while ((by = fis.read()) != -1) {
            fos.write(by);
        }
        fos.close();
        fis.close();
    }

    //2,基本字节流一次读写一个字节数组
    public static void method2() throws IOException {
        FileInputStream fis = new FileInputStream("F:\\视频\\a1.mp4");
        FileOutputStream fos = new FileOutputStream("untitled1\\字节流复制图片.mp4");
        byte[] bts = new byte[1024];
        int len;
        while ((len = fis.read(bts)) != -1) {
            fos.write(bts,0,len);
        }
        fos.close();
        fis.close();
    }

     //3,字节缓冲流一次读写一个字节
     public static void method3() throws IOException {
         BufferedInputStream bis = new BufferedInputStream(
                 new FileInputStream("F:\\视频\\a1.mp4"));
         BufferedOutputStream bos = new BufferedOutputStream(
                 new FileOutputStream("untitled1\\字节流复制图片.mp4"));
         int by;
         while ((by = bis.read()) != -1) {
             bos.write(by);
         }
         bis.close();
         bos.close();
     }

     //4,字节缓冲流一次读写一个字节数组
     public static void method4() throws IOException {
         BufferedInputStream bis = new BufferedInputStream(
                 new FileInputStream("F:\\视频\\a1.mp4"));
         BufferedOutputStream bos = new BufferedOutputStream(
                 new FileOutputStream("untitled1\\字节流复制图片.mp4"));
         byte[] bys = new byte[1024];
         int len;
         while ((len = bis.read(bys)) != -1) {
             bos.write(bys,0,len);
         }
         bis.close();
         bos.close();
     }
}
