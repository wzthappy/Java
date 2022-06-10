package Java.函数式接口.Supplier接口;

import java.util.function.Supplier;

/*
    Supplier<T>: 包含一个无参的方法
        T get();  获得结果
        该方法不需要参数，它会按照某种实现逻辑(由Lambda表达式实现)返回一个数据
        Supplier<T>接口也称为生产型接口，如果我们指定了接口的泛型是什么类型，那么接口中的get方法就会产生什么类型的数据
 */
public class SupplierDemo {
    public static void main(String[] args) {
//        String s = getString(() -> {
//            return "卡卡";
//        });
        String s = getString( () -> "卡卡" );

        System.out.println(s);

        Integer i = getInteger( () -> 20 );
        System.out.println(i);

    }
    //定义一个方法，返回整数数据
    private static Integer getInteger(Supplier<Integer> sup) {
//        Integer integer = sup.get();
        return sup.get();
    }


    //定义一个方法，返回字符串数据
    private static String getString(Supplier<String> sup) {
//        String s = sup.get();
        return sup.get();
    }
}