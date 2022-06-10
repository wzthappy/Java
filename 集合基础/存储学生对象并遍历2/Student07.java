package Java.集合基础.存储学生对象并遍历2;

//1，定义学生类，为了键盘录入数据方便，把学生类中的成员变量都定义为String类型
public class Student07 {
    private String name;
    private String age;
    public Student07() {}
    public Student07(String name,String age) {
        this.name = name;
        this.age = age;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setAge(String age) {
        this.age = age;
    }
    public String getAge() {
        return age;
    }
}
