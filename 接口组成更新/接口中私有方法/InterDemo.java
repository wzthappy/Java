package Java.接口组成更新.接口中私有方法;
/*
    需求:
        1，定义一个接口Inter，里面有四个方法: 两个默认方法，两个静态方法
            default void show1() { }
            default void show2() { }
            static void method1() { }
            static void method2() { }
        2，定义接口的一个实现类:
            InterImpl
        3，定义测试类:
            InterDemo
            在主方法中，按照多态的方式创建对象并使用
 */
public class InterDemo {
    public static void main(String[] args) {
        //按照多态的方式创建对象并使用
        Inter i = new InterImpl();
        i.show1();
        System.out.println("------");
        i.show2();
        System.out.println("------");

        Inter.method1();
        System.out.println("-----");
        Inter.method2();
    }
}
