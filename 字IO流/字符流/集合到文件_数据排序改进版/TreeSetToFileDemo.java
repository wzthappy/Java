package Java.字IO流.字符流.集合到文件_数据排序改进版;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

/*
    需求: 键盘录入5个学生信息(姓名，语文成绩，数学成绩，英语成绩)。
        要求: 按照成绩总分从高到低写入文件

    思路:
        1.定义学生类
        2，创建TreeSet集合，通过比较器排序进行排行
        3，键盘录入学生数据
        4，创建学生对象，把键盘录入的数据对应赋值给学生对象的成员变量
        5，把学生对象添加到TreeSet集合
        6，创建字符缓冲输出流对象
        7，遍历集合，得到每一个学生对象
        8，把学生对象的数据拼接成指定格式的字符串
        9，调用字符缓冲输出流对象的方法写数据
        10，释放资源
 */
public class TreeSetToFileDemo {
    public static void main(String[] args) throws IOException {
        // 2，创建TreeSet集合，通过比较器排序进行排行
        TreeSet<Student> ts = new TreeSet<Student>(new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                //按照成绩总分从高到低写入文件
                int num = s2.getSum() - s1.getSum();
                //次要条件
                int num2 = num == 0 ? s2.getChinese() - s1.getChinese() : num;
                int num3 = num2 == 0 ? s2.getMath() - s1.getMath() : num2;
                int num4 = num3 == 0 ? s2.getName().compareTo(s1.getName()) : num2;
                return num4;
            }
        });
        //3，键盘录入学生数据   // 键盘录入5个学生信息
        for (int i = 0; i < 5; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.println("请录入第" + (i + 1) + "个学生信息: ");
            System.out.println("姓名: ");
            String name = sc.nextLine();
            System.out.println("语文成绩: ");
            int chinese = sc.nextInt();
            System.out.println("数学成绩: ");
            int math = sc.nextInt();
            System.out.println("英语成绩: ");
            int english = sc.nextInt();
            // 4，创建学生对象，把键盘录入的数据对应赋值给学生对象的成员变量
            Student s = new Student();
            s.setName(name);
            s.setChinese(chinese);
            s.setMath(math);
            s.setEnglish(english);
            // 5，把学生对象添加到TreeSet集合
            ts.add(s);
        }
        //6，创建字符缓冲输出流对象
        BufferedWriter bw = new BufferedWriter(new FileWriter("untitled1\\bw.txt"));
        //7，遍历集合，得到每一个学生对象
        for (Student s : ts) {
            //8，把学生对象的数据拼接成指定格式的字符串    姓名，语文成绩，数学成绩，英语成绩,  总分
            StringBuilder sb = new StringBuilder();
            sb.append(s.getName()).append(", ").append(s.getChinese()).append(", ")
                    .append(s.getMath()).append(", ").append(s.getEnglish())
                    .append(", ").append(s.getSum());
            //9，调用字符缓冲输出流对象的方法写数据
            bw.write(sb.toString());
            bw.newLine();
            bw.flush();
        }
        // 10，释放资源
        bw.close();
    }
}
