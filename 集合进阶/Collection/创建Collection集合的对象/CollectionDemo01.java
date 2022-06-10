package Java.集合进阶.Collection.创建Collection集合的对象;

import java.util.ArrayList;
import java.util.Collection;

/*
* 创建Collection集合的对象
*      ·多态的方式
*      ·ArrayList()
* */
public class CollectionDemo01 {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<String>();

        //添加元素：boolean add(E e)  String e
        c.add("hello");
        c.add("world");
        c.add("java");
        //输出集合对象
        String s = c.toString();   //   String 类
        System.out.println(c.toString());   // toString()方法在String 中重写了
    }
}
