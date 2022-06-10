package Java.集合进阶.Set.成绩排序;

import java.util.Comparator;
import java.util.TreeSet;

/*
* 需求:
*   用TreeSet集合存储多个学生信息(姓名，语文成绩，数学成绩)，并遍历该集合
*   要求: 按照总分从高到低出现
*
* 思路:
*   1，定义学生类
*   2，创建TreeSet集合对象，通过比较器排序进行排序
*   3，创建学生对象
*   4，把学生对象添加到集合
*   5，遍历集合
* */
public class TreeSetDemo {
    public static void main(String[] args) {
        //2，创建TreeSet集合对象，通过比较器排序进行排序
        TreeSet<Student> ts = new TreeSet<Student>(new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
//                int num = (s2.getChinese() + s2.getMath()) - (s1.getChinese() + s1.getMath());
                //主要条件
                int num = s2.getSum() - s1.getSum();            //比较总分
                //次要条件
                int num2 = num == 0 ? s2.getChinese() - s1.getChinese() : num;   //比较语文成绩
                int num3 = num2 == 0 ? s1.getName().compareTo(s2.getName()) : num2;  //姓名
                return num3;
            }
        });
//        3，创建学生对象
        Student s1 = new Student("卡卡",98,100);
        Student s2 = new Student("晓晓",95,95);
        Student s3 = new Student("零零",100,93);
        Student s4 = new Student("多多",100,97);
        Student s5 = new Student("洋洋",98,98);

        Student s6 = new Student("静静",97,99);
        Student s7 = new Student("静静",97,99);
        Student s8 = new Student("赵云",97,99);

        //4，把学生对象添加到集合
        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);
        ts.add(s5);
        ts.add(s6);
        ts.add(s7);
        ts.add(s8);

        // 5，遍历集合
        for (Student s : ts) {
            System.out.println(s.getName() + ", " + s.getChinese() + ", " + s.getMath() + ", " + s.getSum());
        }
    }
}
