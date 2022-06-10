package Java.字IO流.字符流.复制文件的异常处理;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
    复制文件的异常处理
 */
public class CopyFileDemo {
    public static void  main(String[] args) {

    }
    //JDK9的改进方案
//    private static void method4() throws IOException {
//        FileReader fr = new FileReader("fr.txt");
//        FileWriter fw = new FileWriter("fw.txt");
//        try(fr ; fw) {
//            char[] chs = new char[1024];
//            int len;
//            while ((len = fr.read(chs)) != -1) {
//                fw.write(chs,0,len);
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }

    //JDK7的改进方案
    private static void method3() {
        try(FileReader fr = new FileReader("fr.txt");
            FileWriter fw = new FileWriter("fw.txt");) {  //自动释放资源
            char[] chs = new char[1024];
            int len;
            while ((len = fr.read(chs)) != -1) {
                fw.write(chs,0,len);
                fw.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //try...catch...finally
    private static void method2() {
        FileReader fr = null;
        FileWriter fw = null;
        try {
            fr = new FileReader("fr.txt");
            fw = new FileWriter("fw.txt");
            char[] chs = new char[1024];
            int len;
            while ((len = fr.read(chs)) != -1) {
                fw.write(chs, 0, len);
                fw.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fr != null) {
                try {
                    fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fw != null) {
                try {
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    //抛出处理
    private static void method1() throws IOException {
        FileReader fr = new FileReader("fr.txt");
        FileWriter fw = new FileWriter("fw.txt");

        char[] chs = new char[1024];
        int len;
        while ((len = fr.read(chs)) != -1) {
            fw.write(chs,0,len);
            fw.flush();
        }
        fr.close();
        fw.close();
    }
}
