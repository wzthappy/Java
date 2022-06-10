package Java.流Stream.Stream流的常见中间操作方法4;

import java.util.ArrayList;

/*
    Stream<T> sorted();  返回由此流的元素组成的流，根据自然顺序排序
    Stream<T> sorted(Comparator comparator);  返回由该流的元素组成的流，跟据提供的Comparator进行排序
        Comparator接口中的方法    int compare(T o1, T o2)
 */
public class StreamDemo04 {
    public static void main(String[] args) {
        //创建一个集合，存储多个字符串元素
        ArrayList<String> list = new ArrayList<String>();

        list.add("lingqingxia");
        list.add("zhangmanyu");
        list.add("eangzuxian");
        list.add("liuyan");
        list.add("zhangmin");
        list.add("zhangwuji");

        //需求1: 按照字母顺序把数据在控制台输出
        list.stream().sorted().forEach(System.out::println);
        System.out.println("------");

        //需求2: 按照字符串长度把数据在控制台输出
//        list.stream().sorted(new Comparator<String>() {
//            @Override
//            public int compare(String s1, String s2) {
//                return s1.length()-s2.length();
//            }
//        }).forEach(System.out::println);  ==
        list.stream().sorted((s1,s2) -> s1.length() - s2.length()).forEach(System.out::println);
        System.out.println("------");

        list.stream().sorted((s1,s2) -> {
            int num = s1.length() - s2.length();
            int num2 = num == 0 ? s1.compareTo(s2) : num;  //compareTo(s2)   自然排序的方法
            return num2;
        }).forEach(System.out::println);
    }
}
