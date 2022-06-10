package Java.面向对象.封装和对象.private关键字;

/*
 * 多个对象指向相同
 * */
public class StudentTest03 {
    public static void main(String[] args) {
        //创建第一个对象并使用
        Student s1 = new Student();
        System.out.println("s1的地址：" + s1);
        s1.name = "卡卡";
        s1.age = 19;
        System.out.println(s1.name + " ," + s1.age);
        //把第一个对象的地址赋值给第二个对象
        Student s2 = s1;
        System.out.println("s2的地址：" + s2);
        s2.name = "帆帆";
        s2.age = 30;
        System.out.println("s2: " + s2.name + " ," + s2.age);
        System.out.println("s1: " + s1.name + " ," + s1.age);
    }
}
