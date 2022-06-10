package Java.修饰符.static修饰的特点;

/*
 * 测试类
 * */
public class StaticDemo {
    public static void main(String[] args) {
        Student.university = "湖北科技";
        Student s1 = new Student();
        s1.name = "卡卡";
        s1.age = 20;
//        s1.university = "湖北科技";
        s1.show();

        Student s2 = new Student();
        s2.name = "晓晓";
        s2.age = 19;
//       s2.university = "湖北科技";
        s2.show();
    }
}
