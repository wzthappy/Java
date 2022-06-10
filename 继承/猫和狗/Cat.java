package Java.继承.猫和狗;

public class Cat extends Animal {
    public Cat() {}

    public Cat(String name, int age) {
        super(name, age);
    }

    public void catchMouse() {
        System.out.println("猫抓老鼠");
    }
}
