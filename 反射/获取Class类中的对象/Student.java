package Java.反射.获取Class类中的对象;

public class Student {
    //成员变量: 一个私有，一个默认，一个公开
    private String name;
    int age;
    public String address;

    //构造方法: 一个私有，一个默认，两个公开

    public Student() {
    }

    private Student(String name) {
        this.name = name;
    }

    Student(String name,int age) {
        this.name = name;
        this.age = age;
    }

    public Student(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    //成员方法: 一个私有，四个公开

    private void function() {
        System.out.println("function");
    }

    public void method1() {
        System.out.println("method1");
    }

    public void method2(String s) {
        System.out.println("method2:" + s);
    }

    public String method3(String s,int i) {
        return s + ", " + i;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
}
