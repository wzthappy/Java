package Java.接口.接口的成员特点;
/*
* 测试类
* */
public class InterfaceDemo {
    public static void main(String[] args) {
        Inter i = new InterImpl();
//        i.num = 20;    报错
        System.out.println(i.num);
//        i.num2 = 40;    报错
        System.out.println(i.num2);
        System.out.println(Inter.num);
        i.method();
        i.show();
    }
}
