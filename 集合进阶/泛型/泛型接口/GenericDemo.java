package Java.集合进阶.泛型.泛型接口;
/*
* 测试类
* */
public class GenericDemo {
    public static void main(String[] args) {
        Generic<String> g1 = new GenericImpl<String>();
        g1.show("卡卡");

        Generic<Integer> g2 = new GenericImpl<Integer>();
        g2.show(30);

    }
}
