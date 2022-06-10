package Java.集合进阶.Map.HashMap集合存储学生对象并遍历_02;

import java.util.HashMap;
import java.util.Set;

/*
    需求:
        创建一个HashMap集合，键是学生对象(Student),值是居住地(String)。存储多个键值对元素，并遍历。

     思路:
        1，定义学生类
        2，创建HashMap集合对象
        3，创建学生对象
        4，把学生添加到集合
        5，遍历集合
        6，在学生类中重写两个方法
            hashCode()
            equals()
 */
public class HashMapDemo {
    public static void main(String[] args) {
        // 2，创建HashMap集合对象
        HashMap<Student,String> hm = new HashMap<Student,String>();

        //3，创建学生对象
        Student s1 = new Student("林青霞",30);
        Student s2 = new Student("张曼玉",35);
        Student s3 = new Student("王祖贤",33);
        Student s4 = new Student("王祖贤",33);

        //4，把学生添加到集合
        hm.put(s1,"西安");
        hm.put(s2,"武汉");
        hm.put(s3,"郑州");
        hm.put(s4,"北京");

        // 5，遍历集合
        Set<Student> keySet = hm.keySet();
        for (Student key : keySet) {
            String value = hm.get(key);
            System.out.println(key.getName() + ", " + key.getAge() + ", " +value);
        }
    }
}
