package Java.抽象类.抽象类的特点;

public class Cat extends Animal {
    //要重写抽象方法才可以
    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }
}
