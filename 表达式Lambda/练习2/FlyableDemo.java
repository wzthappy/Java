package Java.表达式Lambda.练习2;
/*
    lambda表达式的格式: (形式参数) -> {代码块}

    练习2:
        1, 定义一个接口(Flyable), 里面定义一个抽象方法: void fly(String s);
        2, 定义一个测试类(FlyableDemo), 在测试类中提供两个方法
            一个方法是: useEatable(Flyable e);
            一个方法是主方法, 在主方法中调用useFlyable方法
 */
public class FlyableDemo {
    public static void main(String[] args) {
        //在主方法中调用useFlyable方法
        //匿名内部类
        useEatable(new Flyable() {
            @Override
            public void fly(String s) {
                System.out.println(s);
                System.out.println("飞机自驾游1");
            }
        });
        System.out.println("--------");

        //Lambda
        useEatable( (String s) -> {
            System.out.println(s);
            System.out.println("飞机自驾游2");
        } );
    }
    //一个方法是: useEatable(Flyable f);
    public static void useEatable(Flyable f) {
        f.fly("风和日丽,晴空万里");
    }
}