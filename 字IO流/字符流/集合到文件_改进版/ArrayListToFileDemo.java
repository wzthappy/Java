package Java.字IO流.字符流.集合到文件_改进版;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/*
    需求:
        把ArrayList集合中的学生数据写入到文本文件。要求: 每一个写生对象的数据作为文件中的一行数据
        格式:学号，姓名，年龄，居住地

    思路:
        1，定义学生类
        2，创建ArrayList集合
        3，创建学生对象
        4，把学生对象添加到集合中
        5，创建字符缓冲输出流对象
        6，遍历集合，得到每一个学生对象
        7，把学生对象的数据并接成指定格式的字符串
        8，调用字符缓冲输出流对象的方法写数据
        9，释放资源
 */
public class ArrayListToFileDemo {
    public static void main(String[] args) throws IOException {
        //2，创建ArrayList集合
        ArrayList<Student> array = new ArrayList<Student>();
        //3，创建学生对象
        Student s1 = new Student("it001", "卡卡", 19, "上海");
        Student s2 = new Student("it002", "频频", 29, "山西");
        Student s3 = new Student("it003", "多多", 10, "陕西");
        Student s4 = new Student("it004", "帆帆", 20, "广东");
        //4，把学生对象添加到集合中
        array.add(s1);
        array.add(s2);
        array.add(s3);
        array.add(s4);
        //5，创建字符缓冲输出流对象
        BufferedWriter bw = new BufferedWriter(new FileWriter("untitled1\\bw.txt"));
        // 6，遍历集合，得到每一个学生对象
        for (Student s : array) {
            // 7，把学生对象的数据并接成指定格式的字符串
            StringBuilder sb = new StringBuilder();
            sb.append(s.getSid()).append(", ").append(s.getName()).append(", ")
                    .append(s.getAge()).append(", ").append(s.getAddress());
//            8，调用字符缓冲输出流对象的方法写数据
                       //  String string = sb.toString();
            bw.write(sb.toString());
            bw.newLine();
            bw.flush();
        }
        //9，释放资源
        bw.close();
    }
}
