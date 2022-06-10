package Java.接口.运动员和教练;
//具体的篮球教练类
public class BasketballCoah extends Coach {

    public BasketballCoah() {
    }

    public BasketballCoah(String name, int age) {
        super(name, age);
    }

    @Override
    public void teach() {
        System.out.println("篮球教练教如何运球和投篮");
    }

    @Override
    public void eat() {
        System.out.println("篮球教练吃羊肉，喝羊奶");
    }
}
