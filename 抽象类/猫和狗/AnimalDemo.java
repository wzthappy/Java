package Java.抽象类.猫和狗;
/*
* 测试类
* */
public class AnimalDemo {
    public static void main(String[] args) {
        //创建对象，按照多态的方式
        Animal a = new Cat();
        a.setName("加菲猫");
        a.setAge(5);
        System.out.println(a.getName() + ", " + a.getAge());
        a.eat();
        System.out.println("---------");
        a = new Cat("加菲猫",4);
        System.out.println(a.getName() + ", " + a.getAge());
        a.eat();

        System.out.println("---------");

        //创建狗类对象，多态的方式
        Animal d = new Dog();
        d.setName("欧弟");
        d.setAge(4);
        System.out.println(d.getName() + ", " + d.getAge());
        d.eat();
        System.out.println("---------");
        d  = new Dog("欧弟",3);
        System.out.println(d.getName() + ", " + d.getAge());
        d.eat();
    }
}
