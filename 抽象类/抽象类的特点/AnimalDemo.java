package Java.抽象类.抽象类的特点;
/*
* 测试类
* */
public class AnimalDemo {
    public static void main(String[] args) {
//       Animal a = new Animal();   //报错

        Animal a = new Cat();
        a.eat();
        a.sleep();

    }
}
