package Java.继承.构造方法的访问特点;

public class Zi04 extends Fu04 {
    public Zi04() {
//        super();
        System.out.println("Zi中无参构造方法被调用");
    }

    public Zi04(int age) {
        super(20);
        System.out.println("Zi中带参构造方法被调用");
    }
}
