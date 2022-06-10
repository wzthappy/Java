package Java.字IO流.特殊操作流.对象序列化流;

import java.io.Serializable;

public class Student1111 implements Serializable {
    private String name;
    private int age;

    public Student1111() {
    }

    public Student1111(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
