package Java.多态.成员访问特点;
/*
* 多态：
*   同一个对象，在不同时刻表现出来的不同心态
*
* 举例：猫
*   我们可以说是猫是猫；猫 cat = new 猫();
*   我们也可以说猫是动物；动物 animal = new 猫();
*   这里猫在不同的时刻表现出来了不同的形态，这就是多态
*
* 多态的前提和体现
*   有继承/实现关系
*   有方法重写
*   有父类引用指向子类对象      // 全要满足，才是多态
**/
public class AnimalDemo {
    public static void main(String[] args) {
        //有父类引用指向子类对象
        Animal a = new Cat();  //多态

        System.out.println(a.age);
//        System.out.println(a.weight);

        a.eat();
//        a.playGame();
    }
}
