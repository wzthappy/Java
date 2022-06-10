package Java.形参和返回值.抽象类名作为形参和返回值;
/*
* 测试类
* */
public class AnimalDemo {
    public static void main(String[] args) {
        //创建操作类对象，并调用方法
        AnimalOperator ao = new AnimalOperator();
        Animal a = new Cat();
        ao.useAnimal(a);

        Animal b = ao.getAnimal();  // ao.getAnimal() = new Cat();     Animal b = new Cat();
        b.eat();
    }
}
