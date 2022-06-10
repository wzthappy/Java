package Java.集合进阶.List.分别使用ArrayList和LinkedList完成存储字符串并遍历;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/*
* List集合常用子类: Arraylist，LinkedList
*       ArrayList: 底层数据结构是数组，查询快，增删慢
*       LinkedList: 底层数据结构是链表，查询慢，增删快
*
* 练习:
*     分别使用ArrayList和LinkedList完成存储字符串并遍历
* */
public class ListDemo {
    public static void main(String[] args) {
        //创建集合对象
        List<String> array = new ArrayList<String>();

        array.add("hello");
        array.add("world");
        array.add("java");

        //遍历
        //1，迭代器
        Iterator<String> it = array.iterator();
        while (it.hasNext()) {
            String s = it.next();
            System.out.println(s);
        }
        System.out.println("--------");
        //2,普通for
        for (int i = 0; i < array.size(); i++) {
            String s = array.get(i);
            System.out.println(s);
        }
        System.out.println("-------");
        //3,增强for
        for (String s : array) {
            System.out.println(s);
        }
        System.out.println("===========");

        LinkedList<String> linkedList = new LinkedList<String>();

        linkedList.add("hello");
        linkedList.add("world");
        linkedList.add("java");

        //遍历
        //1，迭代器
        Iterator<String> it2 = linkedList.iterator();
        while (it2.hasNext()) {
            String s = it2.next();
            System.out.println(s);
        }
        System.out.println("----------");
        //2，普通for
        for (int i = 0; i < linkedList.size(); i++) {
            String s = linkedList.get(i);
            System.out.println(s);
        }
        System.out.println("-----------");
        //3，增强for
        for (String s : linkedList) {
            System.out.println(s);
        }
    }
}
