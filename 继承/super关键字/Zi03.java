package Java.继承.super关键字;

public class Zi03 extends Fu03 {
    public int age = 20;

    public void show() {
        int age = 30;
        System.out.println(age);   // 局部变量的age

        //我要访问本类的成员变量age
        System.out.println(this.age);  // this 是指本类的成员变量

        //我要访问父类的成员变量age
        System.out.println(super.age);   //super  是指父类的成员变量
    }
}
