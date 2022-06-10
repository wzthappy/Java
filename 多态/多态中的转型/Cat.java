package Java.多态.多态中的转型;

public class Cat extends Animal {
    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }
    public void playGame() {
        System.out.println("猫捉迷藏");
    }
}
