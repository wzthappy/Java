package Java.抽象类.成员特点;
/*
* 抽象类
* */
public abstract class Animal {
    private int age = 20;    //变量
    private final String city = "北京";  //  常量

    public Animal() {}

    public Animal(int age) {
        this.age = age;
    }

    public void show() {
        age = 40;
        System.out.println(age);
//        city = "ss";     final 最终   常量  报错   不能改变
        System.out.println(city);
    }

    public abstract void eat();
}