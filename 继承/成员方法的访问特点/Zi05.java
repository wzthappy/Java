package Java.继承.成员方法的访问特点;

public class Zi05 extends Fu05 {
    public void method() {
        System.out.println("zi中method()方法被调用");
    }
    public void show() {
        super.show();
        System.out.println("Zi中show()方法被调用");
    }
}
