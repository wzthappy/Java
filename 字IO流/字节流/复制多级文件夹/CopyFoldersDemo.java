package Java.字IO流.字节流.复制多级文件夹;

import java.io.*;

/*
    需求:
        把“F:\\java” 复制到"F:\\英语" 目录下

    思路:
        1，创建数据源File对象，路径是F:\\java
        2，创建目的地File对象，路径是F:\\英语
        3，写方法实现文件夹的复制，参数为数据源File对象和目的地File对象
        4，判断数据源File是否是目录
            是:
                A:在目录的地下创建和数据源File名称一样的目录
                B:获取数据源File下所有文件或者目录的File数组
                C，遍历该File数组，得到每一个File对象
                D，把该File作为数据源File对象，递归调用复制文件夹的方法
            不是:
                说明是文件，直接复制，用字节流
 */
public class CopyFoldersDemo {
    public static void main(String[] args) throws IOException {
        // 1，创建数据源File对象，路径是F:\\java
        File srcFile = new File("F:\\java");
        //2，创建目的地File对象，路径是F:\\英语
        File destFile = new File("F:\\英语");
        // 3，写方法实现 文件夹的复制 ，参数为数据源File对象和目的地File对象
        copyFolder(srcFile,destFile);
    }
    //复制文件夹
    private static void copyFolder(File srcFile, File destFile) throws IOException {
        // 4，判断数据源File是否是目录
        if (srcFile.isDirectory()) {
            //A:在目录的地下创建和数据源File名称一样的目录
            String srcFileName = srcFile.getName();
            File newFolder = new File(destFile,srcFileName);
            if (!newFolder.exists()) {
                newFolder.mkdir();
            }
            //B:获取数据源File下所有文件或者目录的File数组
            File[] fileArray = srcFile.listFiles();
            //  C，遍历该File数组，得到每一个File对象
            for (File file : fileArray) {
                //D，把该File作为数据源File对象，递归调用复制文件夹的方法
                copyFile(file,newFolder);
            }
        } else {
//            说明是文件，直接复制，用字节流
            File newFile = new File(destFile,srcFile.getName());
            copyFile(srcFile,newFile);
        }
    }

    //字节缓冲流复制文件
    private static void copyFile(File srcFile,File destFile) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(
                new FileInputStream(srcFile)
        );
        BufferedOutputStream bos = new BufferedOutputStream(
                new FileOutputStream(destFile)
        );
        byte[] bys = new byte[1024];
        int len;
        while ((len = bis.read()) != -1) {
            bos.write(bys,0,len);
            bos.flush();
        }
        bis.close();
        bos.close();
    }
}
