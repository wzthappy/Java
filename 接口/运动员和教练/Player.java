package Java.接口.运动员和教练;
//抽象运动员类
public abstract class Player extends Person {
    public Player() {
    }

    public Player(String name, int age) {
        super(name, age);
    }
    public abstract void study();
}
