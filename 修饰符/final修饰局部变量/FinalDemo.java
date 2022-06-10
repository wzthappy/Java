package Java.修饰符.final修饰局部变量;
/*
* 测试类
* */
public class FinalDemo {
    public static void main(String[] args) {
        //final修饰基本类型变量
        final int age = 20;
//        age = 100;
        System.out.println(age);
        //final修饰引用类型变量
        final Student s = new Student();   // s 不能变 s是地址值
        s.age = 100;
        System.out.println(s.age);

//        s = new Student();
    }
}
