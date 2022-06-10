package Java.接口组成更新.接口中默认方法;
/*
    需求:
        1: 定义一个接口MyInterface,里面有两个抽象方法:
            void show1();
            void show2();
        2: 定义接口的两个实现类:
            MyInterfaceImplOne
            MyInterfaceImplTwo
        3: 定义测试类:
            MyInterfaceDemo1
            在主方法中，按照多态的方式创建对象并使用
 */
public class MyInterfaceDemo {
    public static void main(String[] args) {
        //在主方法中，按照多态的方式创建对象并使用
        MyInterface my = new MyInterfaceImplOne();
        my.show1();
        my.show2();
        my.show3();

    }
}
