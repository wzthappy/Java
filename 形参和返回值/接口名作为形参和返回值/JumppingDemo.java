package Java.形参和返回值.接口名作为形参和返回值;
/*
* 测试类
* */
public class JumppingDemo {
    public static void main(String[] args) {
        //创建操作类对象，并调用方法
        JumppingOperator jo = new JumppingOperator();
        Jumpping j = new Cat();
        jo.useJumpping(j);

        Jumpping j2 = jo.getJumpping();  // jo.getJumpping() = new 继承.猫和狗.Cat();      Jumpping j2 = new 继承.猫和狗.Cat();
        j2.jump();
    }
}
