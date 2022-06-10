package Java.流Stream.Stream流的常见生成方式;

import java.util.*;
import java.util.stream.Stream;

/*
    Stream流的常见生成方式:
        1，collection体系的集合可以使用默认方法stream()生成流
            default Stream<E> stream();
        2，Map体系的集合间接的生成流
        3，数组可以通过Stream接口的静态方法of(T... values)生成流
 */
public class StreamDemo {
    public static void main(String[] args) {
        //1，collection体系的集合可以使用默认方法stream()生成流
        List<String> list = new ArrayList<String>();
        Stream<String> listStream = list.stream();

        Set<String> set = new HashSet<String>();
        Stream<String> setStream = set.stream();

        //2，Map体系的集合间接的生成流
        Map<String,Integer> map = new HashMap<String,Integer>();
//        Set<String> s = map.keySet();
//        Stream<String> keyStream = s.stream();
        Stream<String> keyStream = map.keySet().stream();
        Stream<Integer> valueStream = map.values().stream();
        Stream<Map.Entry<String, Integer>> entryStream = map.entrySet().stream();

        //3，数组可以通过Stream接口的静态方法of(T... values)生成流
        String[] strArray = {"hello","world","java"};
        Stream<String> strArrayStream1 = Stream.of(strArray);
        Stream<String> strArrayStream2 = Stream.of("hello", "world", "java");
        Stream<Integer> intStream = Stream.of(10, 20, 30);

    }
}
