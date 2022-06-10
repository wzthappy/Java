package Java.集合基础.存储学生对象并遍历;

import java.util.ArrayList;

/*
 * 需求：
 *   创建一个存储学生对象集合，存储3个学生对象，使用程序实现在控制台遍历集合
 *
 * 思路：
 *   1，定义学生类
 *   2，创建集合对象
 *   3，创建学生对象
 *   4，添加学生对象到集合中
 *   5，遍历集合，采用通用遍历格式实现
 * */
public class ArrayListTest02 {
    public static void main(String[] args) {
        //2，创建集合对象
        ArrayList<Student06> array = new ArrayList<Student06>();
        //3，创建学生对象
        Student06 s1 = new Student06("卡卡", 19);
        Student06 s2 = new Student06("晓晓", 20);
        Student06 s3 = new Student06("漫漫", 30);

        //4，添加学生对象到集合中
        array.add(s1);
        array.add(s2);
        array.add(s3);
        //5，遍历集合，采用通用遍历格式实现
        for (int i = 0; i < array.size(); i++) {
            Student06 s = array.get(i);
            System.out.println(s.getName() + "，" + s.getAge());
        }
    }
}
