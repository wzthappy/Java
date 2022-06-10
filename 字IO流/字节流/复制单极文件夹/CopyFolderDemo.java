package Java.字IO流.字节流.复制单极文件夹;

import java.io.*;

//import static com.sun.deploy.cache.Cache.copyFile;

/*
    需求:
        把"F:\\英语" 这个文件夹复制到模块目录下

    思路:
        1，创建数据源目录File对象，路径是F:\\英语
        2，获取数据源目录File对象的名称(英语)
        3，创建目的地目录File对象，路径名是模块名+英语 组成(untitled1\\英语)
        4，判断目的地目录对应的File是否存在，如果不存在，就创建
        5，获取数据源目录下所有文件的File数组
        6，遍历File数组，得到每一个File对象，该File对象，其实就是数据源文件
        7，获取数据源文件File对象的名称
        8,创建目的地文件File对象，路径名是目的地+File对象名
        9，复制文件
            由于文件不仅仅是文本文件，还有图片，视频等文件，所以采用字节流复制文件
 */
public class CopyFolderDemo {
    public static void main(String[] args) throws IOException {
        //1，创建数据源目录File对象，路径是F:\\英语
        File srcFolder = new File("F:\\英语");
        //2，获取数据源目录File对象的名称(英语)
        String srcFolderName = srcFolder.getName();
        //3，创建目的地目录File对象，路径名是模块名+英语 组成(untitled1\\英语)
        File destFolder = new File("untitled1",srcFolderName);
        //4，判断目的地目录对应的File是否存在，如果不存在，就创建
        if (!destFolder.exists()) {
            destFolder.mkdir();
        }
        //5，获取数据源目录下所有文件的File数组
        File[] listFiles = srcFolder.listFiles();
        // 6，遍历File数组，得到每一个File对象，该File对象，其实就是数据源文件
        for (File srcFile : listFiles) {
            //7，获取数据源文件File对象的名称
            String srcFileName = srcFile.getName();
            //8,创建目的地文件File对象，路径名是目的地+File对象名
            File destFile = new File(destFolder,srcFileName);
            //9，复制文件     字节流复制文件
            copyFile(srcFile,destFile);
        }
    }
    private static void copyFile(File srcFile,File destFile) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(
                new FileInputStream(srcFile)
        );
        BufferedOutputStream bos = new BufferedOutputStream(
                new FileOutputStream(destFile)
        );
        byte[] bys = new byte[1024];
        int len;
        while ((len = bis.read(bys)) != -1) {
            bos.write(bys,0,len);
            bos.flush();
        }
        bis.close();
        bos.close();
    }
}