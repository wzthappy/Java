package Java.修饰符.static修饰的特点;

public class Student {
    public String name;  //姓名
    public int age;  //年龄
    //    public String university;  //学校
    public static String university;  //学校

    public void show() {
        System.out.println(name + ", " + age + ", " + university);
    }
}