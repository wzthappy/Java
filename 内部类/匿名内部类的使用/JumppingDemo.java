package Java.内部类.匿名内部类的使用;
/*
* 测试类
* */
public class JumppingDemo {
    public static void main(String[] args) {
        //需求：创建接口操作类的对象，调用method方法
        JumppingOperator jo = new JumppingOperator();
        Jumpping j = new Cat();
        jo.method(j);

        Jumpping j2 = new Dog();
        jo.method(j2);

        System.out.println("---------");

        jo.method(new Jumpping() {
            @Override
            public void jump() {
                System.out.println("猫可以走路了");
            }
        });

        jo.method(new Jumpping() {
            @Override
            public void jump() {
                System.out.println("狗可以守门了");
            }
        });
    }
}
