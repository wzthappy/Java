package Java.内部类.匿名内部类的使用;
/*
* 接口操作类，里面有一个方法，方法的参数是接口名
* */
public class JumppingOperator {
    public void method(Jumpping j) {   //  Jumpping j = new Cat();      // Jumpping j2 = new Dog();
        j.jump();
    }
}
