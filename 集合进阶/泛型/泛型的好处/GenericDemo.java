package Java.集合进阶.泛型.泛型的好处;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
* 需求: Collection集合存储字符串并遍历
* */
public class GenericDemo {
    public static void main(String[] args) {
        //创建集合对象
//        Collection c = new ArrayList();
        Collection<String> c = new ArrayList<String>();
        //添加元素
        c.add("hello");
        c.add("world");         //Object
        c.add("java");
//        c.add(100);
        //遍历集合
//        Iterator it = c.iterator();
        Iterator<String> it = c.iterator();
        while (it.hasNext()) {
//            Object s = it.next();      //Object
//            System.out.println(s);
//            String s = (String)it.next();       // 100   String   //ClassCastException
            String s = it.next();
            System.out.println(s);
        }
    }
}
