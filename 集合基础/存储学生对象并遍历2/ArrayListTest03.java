package Java.集合基础.存储学生对象并遍历2;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * 需求：创建一个存储学生对象的集合，存储3个学生对象，使用程序实现在控制台遍历该集合
 *       学生的姓名和年龄来自于键盘录入
 *
 * 思路：
 *   1，定义学生类，为了键盘录入数据方便，把学生类中的成员变量都定义为String类型
 *   2,创建集合对象
 *   3，键盘录入学生对象所需要的数据
 *   4，创建学生对象，把键盘录入的数据赋值给学生对象的成员变量
 *   5，往集合中添加学生对象
 *   6，遍历集合，采用通用遍历格式实现
 * */
public class ArrayListTest03 {
    public static void main(String[] args) {
//        2,创建集合对象
        ArrayList<Student07> array = new ArrayList<Student07>();
////        3，键盘录入学生对象所需要的数据
//        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入学生姓名：");
//        String name = sc.nextLine();
//        System.out.println("请输入学生年龄：");
//        String  age = sc.nextLine();
//
//        //4，创建学生对象，把键盘录入的数据赋值给学生对象的成员变量
//        Student07 s = new Student07();
//        s.setName(name);
//        s.setAge(age);
//
//        // 5，往集合中添加学生对象
//        array.add(s);

        //为了提高代码的复用性，我们用方法来改进程序
        addStuent07(array);
        addStuent07(array);
        addStuent07(array);
        //6，遍历集合，采用通用遍历格式实现
        for (int i = 0; i < array.size(); i++) {
            Student07 s = array.get(i);   //指定索引的元素
            System.out.println(s.getName() + "," +s.getAge());
        }
    }

    /*
     * 俩个明确：
     *   返回值类型：void
     *   参数：ArrayList<集合.存储学生对象并遍历2.Student07> array
     * */
    public static void addStuent07(ArrayList<Student07> array) {
        //        3，键盘录入学生对象所需要的数据
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学生姓名：");
        String name = sc.nextLine();
        System.out.println("请输入学生年龄：");
        String age = sc.nextLine();

        //4，创建学生对象，把键盘录入的数据赋值给学生对象的成员变量
        Student07 s = new Student07();
        s.setName(name);
        s.setAge(age);

        // 5，往集合中添加学生对象
        array.add(s);
    }
}
