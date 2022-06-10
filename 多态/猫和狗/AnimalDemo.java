package Java.多态.猫和狗;
/*
* 测试类
* */
public class AnimalDemo {
    public static void main(String[] args) {
       //创建猫类对象
       Animal a = new Cat();
       a.setName("加菲猫");
       a.setAge(5);
        System.out.println(a.getName() + ", " + a.getAge());
        a.eat();


        a = new Cat("加菲猫",6);
        System.out.println(a.getName() + ", " + a.getAge());
        a.eat();

        //创建狗类对象
        Animal d = new Dog();
        d.setName("欧弟");
        d.setAge(4);
        System.out.println(d.getName() + ", " + d.getAge());
        d.eat();

        d = new Dog("欧弟",5);
        System.out.println(d.getName() + ", " + d.getAge());
        d.eat();
    }
}
