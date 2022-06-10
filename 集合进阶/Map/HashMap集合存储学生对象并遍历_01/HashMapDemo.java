package Java.集合进阶.Map.HashMap集合存储学生对象并遍历_01;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
    需求:
        创建一个HashMap集合，键是学号(String)，值是学生对象(Student)。存储三个键值对元素，并遍历

    思路:
        1，定义学生类
        2，创建HashMap集合对象
        3，创建学生对象
        4，把学生添加到集合
        5，遍历集合
            方式1: 键找值
            方式2: 键值对对象找键和值
 */
public class HashMapDemo {
    public static void main(String[] args) {
        // 2，创建HashMap集合对象
        HashMap<String,Student> hm = new HashMap<String,Student>();

        // 3，创建学生对象
        Student s1 = new Student("林青霞",30);
        Student s2 = new Student("张曼玉",25);
        Student s3 = new Student("王祖贤",33);

        //4，把学生添加到集合
        hm.put("it001",s1);
        hm.put("it002",s2);
        hm.put("it003",s3);

        //5，遍历集合
        // 方式1: 键找值
        Set<String> keySet = hm.keySet();
        for (String key : keySet) {
            Student value = hm.get(key);
            System.out.println(key + ", " + value.getName() + ", " + value.getAge());
        }
        System.out.println("------------");
        //方式2: 键值对对象找键和值
        Set<Map.Entry<String, Student>> entrySet = hm.entrySet();
        for (Map.Entry<String,Student> ma : entrySet) {
            String key = ma.getKey();
            Student value = ma.getValue();
            System.out.println(key + ", " + value.getName() + ", " + value.getAge());
        }

    }
}
