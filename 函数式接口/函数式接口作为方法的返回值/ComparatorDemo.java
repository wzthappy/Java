package Java.函数式接口.函数式接口作为方法的返回值;

import java.util.*;

/*
    定义一个类(ComparatorDemo)，在类中提供两个方法:
        一个方法是: Comparator<String> getComparator();  方法返回值Comparator是一个函数式接口
        一个方法是主方法，在主方法中调用getComparator方法
 */
public class ComparatorDemo {
    public static void main(String[] args) {
        //构造使用的场景

        //定义集合，存储字符串元素
        ArrayList<String> array = new ArrayList<String>();
        array.add("cccc");
        array.add("aa");
        array.add("b");
        array.add("ddd");
        Iterator<String> it = array.iterator();
        System.out.println("排序前: ");
        while (it.hasNext()) {
            String s = it.next();
            System.out.println(s);
        }

        //自然排序
        Collections.sort(array);
        System.out.println("自然排序排序后: " + array);

        //比较器排序
        Collections.sort(array,getComparator());
        System.out.println("比较器排序排序后: " + array);


    }
    public static Comparator<String> getComparator() {
        //匿名内部类的方式实现
//        Comparator<String> comp = new Comparator<String>() {
//            @Override
//            public int compare(String s1, String s2) {
//                return s1.length() - s2.length();
//            }
//        }
//        return comp;

//        return new Comparator<String>() {
//            @Override
//            public int compare(String s1, String s2) {
//                return s1.length() - s2.length();  //长度
//            }
//        };

        //Lambda
//        return (String s1, String s2) -> {
//            return s1.length() - s2.length();
//        };

        return (s1,s2) -> s1.length() - s2.length();
    }
}
