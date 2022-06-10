package Java.集合进阶.Set.成绩排序;

import java.util.TreeSet;

public class TreeSetDemo999 {
    public static void main(String[] args) {
        TreeSet<Student> ts = new TreeSet<Student>();
        Student s1 = new Student("ooo",99,12);
        Student s2 = new Student("iii",22,29);
        Student s3 = new Student("iii",22,29);
        Student s4 = new Student("ddd",25,31);
        Student s5 = new Student("fff",28,28);
        Student s6 = new Student("eee",21,28);
        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);
        ts.add(s5);
        ts.add(s6);
        for (Student s : ts) {
            System.out.println(s.getName() + ", " + s.getChinese()+ ", " + s.getMath() + ", " + s.getSum());
        }
    }
}
