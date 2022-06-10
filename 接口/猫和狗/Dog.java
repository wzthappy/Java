package Java.接口.猫和狗;

public class Dog extends Animal implements Jumpping {
    public Dog() {
    }

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("狗吃骨头");
    }

    @Override
    public void jump() {
        System.out.println("狗可以跳高了");
    }
}
