package Java.接口.接口的特点;
/*
* 测试类
* */
public class JumppingDemo {
    public static void main(String[] args) {
//        Jumpping j = new Jumpping();   //接口也是抽象的
        Jumpping j = new Cat();
        j.jump();
    }
}
