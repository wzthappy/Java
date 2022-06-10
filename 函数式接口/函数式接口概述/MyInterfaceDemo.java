package Java.函数式接口.函数式接口概述;
/*
    函数式接口: 有且仅有一个抽象方法的接口
 */
public class MyInterfaceDemo {
    public static void main(String[] args) {
        MyInterface my = () -> System.out.println("Java/函数式接口");
        my.show();
    }
}
