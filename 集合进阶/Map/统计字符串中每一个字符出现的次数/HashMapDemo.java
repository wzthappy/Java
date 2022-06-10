package Java.集合进阶.Map.统计字符串中每一个字符出现的次数;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

/*
    需求:
        键盘录入一个字符串，要求统计字符串中每一个字符串出现的次数。
        举例: 键盘录入"aababcabcdabcde"  在控制台输出: "a(5)b(4)c(3)d(2)e(1)"

    思路:
        1，键盘录入一个字符串
        2，创建HashMap集合，键是Character,值是Integer
        3，遍历字符串，得到每一个字符
        4，拿得到的每一个字符作为键到HashMap集合中去找对应的值，看其返回值
            如果返回值是null: 说明该字符串在HashMap集合中不存在，就把该字符作为键，1作为值存储
            如果返回值不是null: 说明该字符串在HashMap集合中存在，把该值加1，然后重新存储该字符和对应值
        5，遍历HashMap集合，得到键和值，按照要求进行拼接
        6，输出结果
 */
public class HashMapDemo {
    public static void main(String[] args) {
        //1，键盘录入一个字符串
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串: ");
        String line = sc.nextLine();

        //2，创建HashMap集合，键是Character,值是Integer
//       HashMap<Character,Integer> hm = new HashMap<Character,Integer>();  //没有排序的
        TreeMap<Character,Integer> hm = new TreeMap<Character,Integer>();    //对键排序

        // 3，遍历字符串，得到每一个字符
        for (int i = 0; i < line.length(); i++) {
            char key = line.charAt(i);

            // 4，拿得到的每一个字符作为键到HashMap集合中去找对应的值，看其返回值
            Integer value = hm.get(key);

            if (value == null)  {
                // 如果返回值是null: 说明该字符串在HashMap集合中不存在，就把该字符作为键，1作为值存储
                hm.put(key,1);
            } else {
                // 如果返回值不是null: 说明该字符串在HashMap集合中存在，把该值加1，然后重新存储该字符和对应值
                value++;
                hm.put(key,value);
            }
        }
        // 5，遍历HashMap集合，得到键和值，按照要求进行拼接
        StringBuilder sb = new StringBuilder();
        Set<Character> keySet = hm.keySet();
        for (Character key : keySet) {
            Integer value = hm.get(key);
            sb.append(key).append("(").append(value).append(")");
        }
        String result = sb.toString();
        //6，输出结果
        System.out.println(result);
    }
}
