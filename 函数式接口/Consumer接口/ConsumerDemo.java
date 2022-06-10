package Java.函数式接口.Consumer接口;

import java.util.function.Consumer;

/*
    ConsumerDemo<T>: 包含两个方法:
        void accept(T t);  对给定的参数执行此操作
        default Consumer<T> andThen(Consumer after);  返回一个集合的 Consumer，依次执行此操作，然后执行 after操作
        Consumer<T>接口也称为消费型接口，它消费的数据的数据类型由泛型指定
 */
public class ConsumerDemo {
    public static void main(String[] args) {
        //1
//        operatorString("卡卡",(String s) -> {
//            System.out.println(s);
//        });
        operatorString("大苏打", s -> System.out.println(s));

        operatorString("大苏打", System.out::println);
        System.out.println("-------");
//        operatorString("大苏打",s -> {
//            System.out.println(new StringBuffer(s).reverse().toString());
//        });
        operatorString("大苏打", s -> System.out.println(new StringBuffer(s).reverse().toString()));
        System.out.println("-----------2");
        //2
        operatorString("可恶的", s -> System.out.println("1: " + s),
                s -> System.out.println("2: " + new StringBuffer(s).reverse().toString()));


    }

    //2
    //定义一个方法，用不同的方式消费同一个字符串数据两次
    private static void operatorString(String name, Consumer<String> con1, Consumer<String> con2) {
//        con1.accept(name);
//        con2.accept(name);
        con1.andThen(con2).accept(name);
    }

    //1
    //定义一个方法，消费一个字符串数据
    private static void operatorString(String name, Consumer<String> con) {
        con.accept(name);
    }
}
