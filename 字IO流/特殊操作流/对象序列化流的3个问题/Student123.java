package Java.字IO流.特殊操作流.对象序列化流的3个问题;

import java.io.Serializable;

public class Student123 implements Serializable {

    private static final long serialVersionUID = 42L;

    private String nemo;

//    private int age;
    private transient int age;

    public Student123() {
    }

    public Student123(String nemo, int age) {
        this.nemo = nemo;
        this.age = age;
    }

    public String getNemo() {
        return nemo;
    }

    public void setNemo(String nemo) {
        this.nemo = nemo;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int nag) {
        this.age = nag;
    }

//    @Override
//    public String toString() {
//        return "Student123{" +
//                "nemo='" + nemo + '\'' +
//                ", age=" + age +
//                '}';
//    }
}
