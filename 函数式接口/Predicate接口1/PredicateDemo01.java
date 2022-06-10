package Java.函数式接口.Predicate接口1;

import java.util.function.Predicate;

/*
    Predicate<T>: 常用的四个方法
        boolean test(T t);  对给定的参数进行判断(判断逻辑由Lambda表达式实现)，返回一个布尔值
        default predicate<T> negate();  返回一个逻辑非
        predicate<T>接口通常用于判断参数是否指定的条件
 */
public class PredicateDemo01 {
    public static void main(String[] args) {

//        boolean b1 = checkString("hello", (String s) -> {
//            return s.length() > 8;
//        });
        boolean b1 = checkString("hello", s -> s.length() > 8);
        System.out.println(b1);

        boolean b2 = checkString("helloworld",s -> s.length() > 8);
        System.out.println(b2);
    }

    //判断给定的字符串是否满足要求
    private static boolean checkString(String s, Predicate<String> pre) {
//        return pre.test(s);  //false
//        return !pre.test(s);  //true  逻辑非  一般不这样写   !
        return pre.negate().test(s);  //true  逻辑非
    }
}