package Java.集合进阶.泛型.可变参数的使用;

import java.util.Arrays;
import java.util.List;

/*
    Arrays工具类中有一个静态方法:
        public static <T> List<T> asList(T... a);  返回由指定数组支持的固定大小的列表

    List接口中有一个静态方法:
        public static <E> List<E> of(E... elements);  返回包含任意数量元素的不可变列表

    Set接口中有一个静态方法:
        public static <E> Set<E> of(E... elements);  返回一个包含任意数量元素的不可变集合
 */
public class ArgsDemo02 {
    public static void main(String[] args) {
        // public static <T> List<T> asList(T... a);   返回由指定数组支持的固定大小的列表
        List<String> list = Arrays.asList("hello", "world", "java");
        System.out.println(list);
//        list.add("javaee");  //UnsupportedOperationException
//        list.remove("world");  //UnsupportedOperationException
        list.set(1,"javaee");   //修改方法
        System.out.println(list);

        // public static <E> List<E> of(E... elements);  返回包含任意数量元素的不可变列表
        //没有

        //  public static <E> Set<E> of(E... elements);  返回一个包含任意数量元素的不可变集合
//        Set.of   无。。。
    }
}
