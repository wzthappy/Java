package Java.面向对象.封装和对象.this关键字;

/*
 *   学生类
 */
public class Student03 {
    private String name;
    private int age;

    public void setName(String name) {
//        name = name 有误
        this.name = name;  // this
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }

    public void show() {
        System.out.println(name + " ," + age);
    }
}
