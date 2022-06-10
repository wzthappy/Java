package Java.字IO流.File.File类创建功能;

import java.io.File;
import java.io.IOException;

/*
    File类创建功能:
        public boolean createNewFile();  当具有该名称的文件不存在时，创建一个由该抽象路径名命名的新空文件
                如果文件不存在，就创建文件，并返回true
                如果文件存在，就不创建文件，并返回false

        public boolean mkdir();  创建由此抽象路径名命名的目录
                如果目录不存在，就创建目录，并返回true
                如果目录存在，就不创建目录，并返回false

        public boolean mkdirs();  创建由此抽象路径名命名的目录，包含任何必需但不存在的父目录
                如果目录不存在，就创建目录，并返回true     可以创建多个目录
                如果目录存在，就不创建目录，并返回false
 */
public class FileDemo02 {
    public static void main(String[] args) throws IOException {
        //需求1: 我要在 F:\\java\\File 目录下创建一个文件java.txt
        //public boolean createNewFile();  当具有该名称的文件不存在时，创建一个由该抽象路径名命名的新空文件
        File f1 = new File("F:\\java\\File\\java.txt");
        System.out.println(f1.createNewFile());
        System.out.println("---------");

        //需求2: 我要在 F:\\java\\File 目录下创建一个目录JavaSE
        //public boolean mkdir();  创建由此抽象路径名命名的目录
        File f2 = new File("F:\\java\\File\\JavaSE");
        System.out.println(f2.mkdir());
        System.out.println("---------");

        //需求3: 我要在 F:\\java\\File 目录下创建一个多级目录 JavaWEB\\HTML
        // public boolean mkdirs();  创建由此抽象路径名命名的目录，包含任何必需但不存在的父目录
        File f3 = new File("F:\\java\\File\\JavaWEB\\HTML");
//        System.out.println(f3.mkdir());   //创建多级目录它是不能实现的
        System.out.println(f3.mkdirs());
        System.out.println("---------");

        //需求4: 我要在 F:\\java 目录下创建一个文件javaseFile.txt
        File f4 = new File("F:\\java\\javaseFile.txt");
//        System.out.println(f4.mkdir());   //它得到的是一个名为javaseFile.txt的目录
        System.out.println(f4.createNewFile());
    }
}
