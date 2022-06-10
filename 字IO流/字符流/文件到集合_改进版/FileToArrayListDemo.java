package Java.字IO流.字符流.文件到集合_改进版;

import java.io.*;
import java.util.ArrayList;

/*
    需求: 把文本中的数据读取到集合中，并遍历集合。
        要求: 文件中每一行数据是一个学生对象的成员变量值
        举例:it001，卡卡，30，北京

    思路:
        1，定义学生类
        2，创建字符缓冲输入流对象
        3，创建ArrayList集合对象
        4，调用字符缓冲输入流对象的方法读数据
        5，把读取到的字符串数据用 split() 进行分割，得到一个字符串数组
        6，创建学生对象
        7，把字符串数组中的每一个元素取出来对应的赋值给学生的成员变量值
        8，把学生对象添加到集合
        9，释放资源
        10，遍历集合

 */
public class FileToArrayListDemo {
    public static void main(String[] args) throws IOException {
        //文件
        BufferedOutputStream bos = new BufferedOutputStream(
                new FileOutputStream("untitled1\\bos.txt" /*,true*/)
        );
        bos.write("it001,卡卡,19,上海\r\n".getBytes());
        bos.write("it002,频频,29,山西\r\n".getBytes());
        bos.write("it003,多多,10,陕西\r\n".getBytes());
        bos.close();


        //  2，创建字符缓冲输入流对象
        BufferedReader br = new BufferedReader(new FileReader("untitled1\\bos.txt"));
        // 3，创建ArrayList集合对象
        ArrayList<Student> array = new ArrayList<Student>();
        //4，调用字符缓冲输入流对象的方法读数据
        String line;
        while ((line = br.readLine()) != null) {
            //5，把读取到的字符串数据用 split() 进行分割，得到一个字符串数组
            String[] strArray = line.split(",");
            // 6，创建学生对象
            Student s = new Student();
            // 7，把字符串数组中的每一个元素取出来对应的赋值给学生的成员变量值
            s.setSid(strArray[0]);
            s.setName(strArray[1]);
            s.setAge(Integer.parseInt(strArray[2]));
            s.setAddress(strArray[3]);
            //8，把学生对象添加到集合
            array.add(s);
        }
        //9，释放资源
        br.close();
        // 10，遍历集合
        for (Student s : array) {
            System.out.println(s.getSid() + ", " + s.getName() + ", " + s.getAge() + ", " + s.getAddress());
        }
    }
}
