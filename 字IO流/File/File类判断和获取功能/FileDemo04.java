package Java.字IO流.File.File类判断和获取功能;

import java.io.File;
import java.io.IOException;

/*
    File类的判断和获取功能:
        public boolean isDirectory();  测试此抽象路径名表示的File是否为目录
        public boolean isFile();  测试此抽象路径名表示的File是否为文件
        public boolean exists();  测试此抽象路径名表示的File是否存在

        public String getAbsolutePath();  返回此抽象路径名的 绝对路径名 字符串
        public String getPath();  将此抽象路径名转换为 路径名 字符串
        public String getName();  返回由此抽象路径名表示的 文件或目录的名称

        public String[] list();  返回此抽象路径名表示的 目录中的文件和目录的名称字符串数组
        public File[] listFiles();  返回此抽象路径名表示的 目录中的文件和目录的File对象数组
 */
public class FileDemo04 {
    public static void main(String[] args) throws IOException {
        //创建一个File对象
        File f = new File("java.txt");
        System.out.println(f.createNewFile());
//        public boolean isDirectory();  测试此抽象路径名表示的File是否为目录
//        public boolean isFile();  测试此抽象路径名表示的File是否为文件
//        public boolean exists();  测试此抽象路径名表示的File是否存在
        System.out.println(f.isDirectory());
        System.out.println(f.isFile());
        System.out.println(f.exists());
        System.out.println("---------");

//        public String getAbsolutePath();  返回此抽象路径名的 绝对路径名 字符串
//        public String getPath();  将此抽象路径名转换为 路径名 字符串
//        public String getName();  返回由此抽象路径名表示的 文件或目录的名称
        System.out.println(f.getAbsolutePath());
        System.out.println(f.getPath());  //  ....//java.txt    封装的路径
        System.out.println(f.getName());
        System.out.println("----------");

//        public String[] list();  返回此抽象路径名表示的 目录中 的文件和目录的名称字符串数组
//        public File[] listFiles();  返回此抽象路径名表示的 目录中 的文件和目录的File对象数组
        File f2 = new File("F:\\java\\File");
        String[] strArray = f2.list();
        for (String str : strArray) {
            System.out.println(str);
        }
        System.out.println("----------");
        File[] fileArray = f2.listFiles();
        for (File file : fileArray) {
            System.out.println(file);
//            System.out.println(file.getName());
            if (file.isFile()) {
//                System.out.println(file.getName());
            }
        }
    }
}
