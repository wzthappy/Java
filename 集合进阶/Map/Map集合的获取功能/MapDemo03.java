package Java.集合进阶.Map.Map集合的获取功能;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
    Map集合的获取功能:
        V get(Object key);  根据键获取值
        Set<K> keySet();  获取所有键的集合
        Collection<V> values();  获取所有值的集合
 */
public class MapDemo03 {
    public static void main(String[] args) {
        //创建集合对象
        Map<String,String> map = new HashMap<String,String>();

        //添加元素
        map.put("001","卡卡");
        map.put("002","晓晓");
        map.put("003","多多");

        //V get(Object key);  根据键获取值
        System.out.println(map.get("001"));   //卡卡
        System.out.println(map.get("999"));   //null

       //Set<K> keySet();  获取所有键的集合
//        System.out.println(map.keySet());   //[001, 002, 003]
        Set<String> keySet = map.keySet();
        for (String key : keySet) {
            System.out.println(key);
        }

        //  Collection<V> values();  获取所有值的集合
        Collection<String> values = map.values();
        for (String value : values) {
            System.out.println(value);
        }
    }
}
