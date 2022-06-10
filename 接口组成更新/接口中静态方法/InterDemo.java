package Java.接口组成更新.接口中静态方法;
/*
    需求:
        1，定义一个接口Inter，里面有三个方法: 一个抽象方法，一个默认方法，一个静态方法
            void show();
            default void method(){ }
            public static void test() { }
        2，定义接口的一个实现类:
            InterImpl
        3，定义测试类:
            InterDemo
            在主方法中，按照多态的方式创建对象并使用
 */
public class InterDemo {
    public static void main(String[] args) {
        Inter i = new InterImpl();
        i.show();
        i.method();

//        i.test();    报错

        Inter.test();

//        InterImpl.test();   报错

        Flyable.test();
    }
}
