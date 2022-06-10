package Java.接口.运动员和教练;
/*
* 测试类
* */
public class PersonDemo {
    public static void main(String[] args) {
        //创建兵乓球运动员对象   无参构造
        PingPangPlayer ppp = new PingPangPlayer();
        ppp.setName("王浩");
        ppp.setAge(30);
        System.out.println(ppp.getName() + ", " + ppp.getAge());
        ppp.eat();
        ppp.study();
        ppp.speak();
        //带参构造
        ppp = new PingPangPlayer("王家",29);
        System.out.println(ppp.getName() + ", " + ppp.getAge());
        ppp.eat();
        ppp.study();
        ppp.speak();
        System.out.println("---------");

        //创建篮球运动员对象  无参构造
        BasketballPlayer bp = new BasketballPlayer();
        bp.setName("姚明");
        bp.setAge(35);
        System.out.println(bp.getName() + ", " + bp.getAge());
        bp.eat();
        bp.study();
        //带参构造
        bp = new BasketballPlayer("晓晓",29);
        System.out.println(bp.getName() + ", " + bp.getAge());
        bp.eat();
        bp.study();
        System.out.println("--------");

        //创建兵乓球教练对象  无参构造
        PingPangCoach bp1 = new PingPangCoach();
        bp1.setName("大明");
        bp1.setAge(40);
        System.out.println(bp1.getName() + ", " + bp1.getAge());
        bp1.eat();
        bp1.teach();
        bp1.speak();
        //带参构造
        bp1 = new PingPangCoach("小爱",42);
        System.out.println(bp1.getName() + ", " + bp1.getAge());
        bp1.eat();
        bp1.teach();
        bp1.speak();
        System.out.println("-------");

        //创建篮球教练对象  无参构造
        BasketballCoah ppp1 = new BasketballCoah();
        ppp1.setName("帆帆");
        ppp1.setAge(50);
        System.out.println(ppp1.getName() + ", " + ppp1.getAge());
        ppp1.eat();
        ppp1.teach();
        //带参构造
        ppp1 = new BasketballCoah("水水",49);
        System.out.println(ppp1.getName() + ", " + ppp1.getAge());
        ppp1.eat();
        ppp1.teach();
    }
}
