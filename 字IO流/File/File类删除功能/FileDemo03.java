package Java.字IO流.File.File类删除功能;

import java.io.File;
import java.io.IOException;

/*
    File类删除功能:
        public boolean delete();  删除由此抽象路径名表示的文件或目录
*/
public class FileDemo03 {
    public static void main(String[] args) throws IOException {
//        File f1 = new File("F:\\java\\File\\java.txt");
        //需求1:在当前模块目录下创建java.txt文件
        File f1 = new File("java.txt");
//        System.out.println(f1.createNewFile());
        //需求2：删除当前模块目录下的java.txt文件
        System.out.println(f1.delete());
        System.out.println("------");


        //需求3:在当前模块目录下创建itcast目录
        File f2 = new File("itcast");
//        System.out.println(f2.mkdir());
        //需求4: 删除当前模块目录下的itcast目录
        System.out.println(f2.delete());
        System.out.println("-------");


        //需求5: 在当前模块下创建一个目录itcast,然后在该目录下创建一个文件java.txt
        File f3 = new File("itcast");
//        System.out.println(f3.mkdir());
        File f4 = new File("itcast\\java.txt");
//        System.out.println(f4.createNewFile());
        //需求6: 删除在当前模块下的目录itcast
        System.out.println(f4.delete());
        System.out.println(f3.delete());   // 要把里面的文件删除才可以
    }
}
