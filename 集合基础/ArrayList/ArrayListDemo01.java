package Java.集合基础.ArrayList;

import java.util.ArrayList;

/*
* ArrayList构造方法：
*       public ArrayList(); 创建一个空的集合对象
*
* ArrayList添加方法：
*       public boolean add(E e); 将指定的元素追加到此集合的末尾
*       public void add(int index, E element); 在此集合中的指定位置插入指定的元素
* */
public class ArrayListDemo01 {
    public static void main(String[] args) {
        // public ArrayList(); 创建一个空的集合对象
//        ArrayList<String> array = new ArrayList<>();  ==   一样的
        ArrayList<String> array = new ArrayList<String>();

        //输出集合
        System.out.println("array：" + array);

        //ArrayList添加方法：
        //public boolean add(E e); 将指定的元素追加到此集合的末尾  返回值是boolean
//        System.out.println(array.add("hello"));   //有多余的  true
        array.add("hello");    //没有  true    0   1  2
        array.add("world");
        array.add("java");

        //public void add(int index, E element); 在此集合中的指定位置插入指定的元素
        array.add(1,"javase");
        array.add(3,"javaee");
        array.add(4,"javaee"); //IndexOutOfBoundsException  集合的索引越界   报错
        System.out.println("array：" + array);
    }
}
