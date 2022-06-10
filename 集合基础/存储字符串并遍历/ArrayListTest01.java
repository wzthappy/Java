package Java.集合基础.存储字符串并遍历;

import java.util.ArrayList;

/*
* 需求：
*   创建一个存储字符串的集合，存储3个字符串元素，使用程序实现在控制台遍历该集合
*
* 思路：
*   1，创建集合对象
*   2，往集合中添加字符串对象
*   3，遍历集合。首先要能够获取到集合中的每一个元素，这个通过get(int index)方法实现
*   4，遍历集合，其次要能够获取到集合的长度，这个通过size()方法实现
*   5，遍历集合的通用格式
* */
public class ArrayListTest01 {
    public static void main(String[] args) {
        //1，创建集合对象
        ArrayList<String> array = new ArrayList<String>();

        //2，往集合中添加字符串对象
        array.add("卡卡");
        array.add("敏敏");
        array.add("晓晓");

        //5，遍历集合的通用格式
        //4，遍历集合，其次要能够获取到集合的长度，这个通过size()方法实现
        for (int i = 0; i < array.size(); i++) {
            //3，遍历集合。首先要能够获取到集合中的每一个元素，这个通过get(int index)方法实现
            String s = array.get(i);  //这里考虑到了，可能还要使用，所以拿一个变量接收
            System.out.println(s);
        }
    }
}
