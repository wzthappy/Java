package Java.字IO流.字符流.字符串中的编码编码问题;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/*
    编码:
        byte[] getBytes();  使用平台的 默认字符集 将该String编码为一系列字节,将结果存储到新的字节数组中
        byte[] getBytes(String charsetName);  使用 指定的字符集 将该String编码为一系列字节,将结果存储到新的字节数组中

    解码:
        String(byte[] bytes);  通过使用平台的 默认字符集解码 指定的字节数组来构造新的 String
        String(byte[] bytes, String charsetName);  通过 指定的字符集编码 指定的字节数组来构造新的 String
 */
public class StringDemo {
    public static void main(String[] args) throws UnsupportedEncodingException {
        //定义一个字符串
        String s = "中国";
        //编码:    byte[] getBytes();  使用平台的 默认字符集 将该String编码为一系列字节,将结果存储到新的字节数组中
        byte[] bys1 = s.getBytes();          //[-28, -72, -83, -27, -101, -67]
        System.out.println(Arrays.toString(bys1));
        //解码:   String(byte[] bytes);  通过使用平台的 默认字符集解码 UTF-8 指定的字节数组来构造新的 String
        String ss = new String(bys1);
        System.out.println(ss);

        String ss1 = new String(bys1,"UTF-8");
        System.out.println(ss1);
        System.out.println("-----------");
        //编码:
        //byte[] getBytes(String charsetName);  使用 指定的字符集 将该String编码为一系列字节,将结果存储到新的字节数组中
//                       byte[] bys2 = s.getBytes("UTF-8");    //[-28, -72, -83, -27, -101, -67]
        byte[] bys2 = s.getBytes("GBK");   //[-42, -48, -71, -6]
        System.out.println(Arrays.toString(bys2));
        //解码:
        //String(byte[] bytes, String charsetName);  通过 指定的字符集编码 指定的字节数组来构造新的 String
        String ss2 = new String(bys2,"GBK");
        System.out.println(ss2);
        System.out.println("-----------");


        String ss3 = new String(bys2,"UTF-8");
        System.out.println("没有编码对应:" + ss3);
    }
}
