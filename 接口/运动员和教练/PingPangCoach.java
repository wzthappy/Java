package Java.接口.运动员和教练;
//具体的兵乓球教练类
public class PingPangCoach extends Coach implements SpeakEnglish {
    public PingPangCoach() {
    }

    public PingPangCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void teach() {
        System.out.println("兵乓球教练教如何发球和接球");
    }

    @Override
    public void eat() {
        System.out.println("兵乓球教练吃小白菜，喝大米粥");
    }

    @Override
    public void speak() {
        System.out.println("兵乓球教练说英语");
    }
}
