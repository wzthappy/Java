package Java.字IO流.字符流.字符流中的编码解码问题;

import java.io.*;

/*
    InputStreamReader: 是从字节流到字符流的桥梁
        它读取字节,并使用指定的编码将其解码为字符
        它使用是字符集可以由名称指定,也可以被明确制定,或者可以接收平台的默认字符集

    OutputStreamWriter: 是从字符流到字节流的桥梁
        是从字符流到字节流的桥梁,使用指定的编码将写入的字符编码为字节
        它使用的字符集可以由名称指定,也可以被明确指定,或者可以接收平台的默认字符集
 */
public class ConversionStreamDemo {
    public static void main(String[] args) throws IOException {
        //OutputStreamWriter(OutputStream out); 创建一个使用默认字符编码的OutputStream.
        //OutputStreamWriter(OutputStream out, String charsetName); 创建一个使用命名字符集的OutputStream.
        /*
        FileOutputStream fos = new FileOutputStream("untitled1\\osw.txt");
        OutputStreamWriter osw = new OutputStreamWriter(fos);  ==
        */
        OutputStreamWriter osw1 = new OutputStreamWriter(
                new FileOutputStream("untitled1\\osw1.txt")      // UTF-8
        );
        osw1.write("中国");
        osw1.close();

        OutputStreamWriter osw2 = new OutputStreamWriter(
                new FileOutputStream("untitled1\\osw2.txt"),"GBK"    //&&& 乱码
        );
        osw2.write("中国");
        osw2.close();

        //InputStreamReadr(InputStream in); 创建一个使用默认字符集的InputStreamReadr.
        //InputStreamReadr(InputStream in, String CharsetName); 创建一个使用命名字符集的InputStreamReadr
        InputStreamReader isr1 = new InputStreamReader(
                new FileInputStream("untitled1\\osw1.txt")
        );
        int ch;
        while ((ch = isr1.read()) != -1) {
            System.out.print((char)ch);
        }
        isr1.close();

        InputStreamReader isr2 = new InputStreamReader(
                new FileInputStream("untitled1\\osw2.txt"),"GBk"   //中国
        );
        int ch1;
        while ((ch1 = isr2.read()) != -1) {
            System.out.print((char)ch1);
        }
        isr2.close();

    }
}
