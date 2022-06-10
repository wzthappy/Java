package Java.修饰符.static访问特点;
/*
* static访问特点
* */
public class Student {
    //非静态成员变量
    private String name = "卡卡";
    //静态成员变量
    public static String university = "湖北科技";
    //非静态成员方法
    public void show1() {

    }
    //非静态成员方法
    public void show2() {
        System.out.println(name);
        System.out.println(university);
        show1();
        show3();
    }
    //静态成员方法
    public static void show3() {

    }
    //静态成员方法
    public static void show4() {
//        System.out.println(name);
        System.out.println(university);
//        show1();
        show3();
    }
}
