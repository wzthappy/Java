package Java.面向对象.封装和对象.private关键字;

/*
 * 学生类
 * */
public class Student02 {
    //成员变量
    private String name;
    private int age;

    //  get/set 方法
    public void setName(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }

    public void setAge(int a) {
        age = a;
    }

    public int getAge() {
        return age;
    }

    //  方法
    public void show() {
        System.out.println(name + " ," + age);
    }

}
