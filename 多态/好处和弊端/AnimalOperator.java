package Java.多态.好处和弊端;
/*
* 动物操作类
* */
public class AnimalOperator {
//    public void useAnimal(Cat c) {   //Cat c = new Cat();   就相当于创建了一个猫的对象
//        c.eat();
//    }
//
//    public void useAnimal(Dog d) {  //   Dog d = new Dog();
//        d.eat();
//    }

    public void useAnimal(Animal a) {  //1  a = new Cat();   //2 a = new Dog();
        // 1 Animal a = new Cat();    //2  Animal a = new Dog();
        a.eat();
//        a.lookDoor(); 错误
    }
}
