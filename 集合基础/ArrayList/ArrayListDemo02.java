package Java.集合基础.ArrayList;

import java.util.ArrayList;

/*
* ArrayList常用方法：
*       public boolean remove(Object o);  删除指定的元素，返回删除是否成功
*       public E remove(int index);  删除指定索引处的元素，返回被删除的元素
*       public E set(int index,E element);  修改指定索引处的元素，返回被修改的元素
*       public E get(int index);  返回指定索引的元素
*       public int size();  返回集合中的元素的个数
* */
public class ArrayListDemo02 {
    public static void main(String[] args) {
        //创建集合
        ArrayList<String> array = new ArrayList<String>();

        //添加元素
        array.add("hello");
        array.add("world");
        array.add("java");

        //1， public boolean remove(Object o);  删除指定的元素，返回删除是否成功
//        System.out.println(array.remove("world"));  //删除成功  返回true
//        System.out.println(array.remove("wor"));  //删除失败  返回false

        //2， public E remove(int index);  删除指定索引处的元素，返回被删除的元素       E 代表当前数据的类型
//        array.remove(1);        //删除第二个字符串       这样写没有返回值
//        System.out.println(array.remove(1));  //删除第二个字符串  返回第二个字符串
//        System.out.println(array.remove(3));  //IndexOutOfBoundsException

        //3，public E set(int index,E element);  修改指定索引处的元素，返回被修改的元素
//        System.out.println(array.set(1,"javaee"));  //把第二个数据修改为javaee ， 返回原来修改的数据
//        System.out.println(array.set(3,"javaee"));  //IndexOutOfBoundsException

        //4，public E get(int index);  返回指定索引的元素
//        array.get(1);   //返回值要接收 ，
//        System.out.println(array.get(0));  //返回第一个字符串的元素
//        System.out.println(array.get(3));  //IndexOutOfBoundsException

        //5, public int size();  返回集合中的元素的个数
//        System.out.println(array.size());  //3个大元素
        //输出集合
        System.out.println("array:" + array);
    }
}
