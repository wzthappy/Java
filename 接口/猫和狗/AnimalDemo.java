package Java.接口.猫和狗;
/*
* 测试类
* */
public class AnimalDemo {
    public static void main(String[] args) {
        //创建对象，调用方法
        Jumpping j = new Cat();
        j.jump();
        System.out.println("--------");

        Animal a = new Cat();
        a.setName("加菲猫");
        a.setAge(5);
        System.out.println(a.getName() + ", " + a.getAge());
        a.eat();

        a = new Cat("加菲猫",4);
        System.out.println(a.getName() + ", " + a.getAge());
        a.eat();
        System.out.println("--------");


        Cat c = new Cat();   //具体的，好一点
        c.setName("加菲猫");
        c.setAge(5);
        System.out.println(c.getName() + ", " + c.getAge());
        c.eat();
        c.jump();

        Jumpping j1 = new Dog();
        j1.jump();
        Animal j2 = new Dog("欧弟",3);
        System.out.println(j2.getName() + ", " + j2.getAge());
        j2.eat();

        Dog d = new Dog("欧弟",4);
        System.out.println(d.getName() + ", " + d.getAge());
        d.eat();
        d.jump();
    }
}
