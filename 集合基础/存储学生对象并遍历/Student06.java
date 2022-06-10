package Java.集合基础.存储学生对象并遍历;

//1，定义学生类
public class Student06 {
    private String name;
    private int age;

    public Student06() {}

    public Student06(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
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
}
