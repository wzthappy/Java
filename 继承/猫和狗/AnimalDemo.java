package Java.继承.猫和狗;

/*
* 测试类
* */
public class AnimalDemo {
    public static void main(String[] args) {
        //创建猫类对象并进行测试
        Cat c1 = new Cat();
        c1.setName("加菲猫");
        c1.setAge(5);
        System.out.println(c1.getName() + ", " + c1.getAge());
        c1.catchMouse();

        Cat c2 = new Cat("加菲猫",4);
        System.out.println(c2.getName() + ", " + c2.getAge());
        c2.catchMouse();

        System.out.println("--------------");
        //创建狗类对象并进行测试
        Dog g1 = new Dog();
        g1.setName("欧弟");
        g1.setAge(4);
        System.out.println(g1.getName() + ", " + g1.getAge());
        g1.lookDoor();

        Dog g2 = new Dog("欧弟",4);
        System.out.println(g2.getName() + ", " + g2.getAge());
        g2.lookDoor();
    }
}
