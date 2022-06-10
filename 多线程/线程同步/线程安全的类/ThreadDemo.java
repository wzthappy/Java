package Java.多线程.线程同步.线程安全的类;

import java.util.*;

/*
    线程安全的类:
        StringBuffer
        Vector
        Hashtable
 */
public class ThreadDemo {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();   //synchronized
        StringBuilder sb2 = new StringBuilder();

        Vector<String> v = new Vector<String>();  //synchronized
        ArrayList<String> array = new ArrayList<String>();

        Hashtable<String,String> ht = new Hashtable<String,String>();   //synchronized
        HashMap<String,String> hm = new HashMap<String,String>();

        //static <T> List<T> synchronizedList(List<T> list);  返回由指定列表支持的同步 (线程安全) 列表
        List<String> list = Collections.synchronizedList(new ArrayList<String>());

        Map<String, String> map = Collections.synchronizedMap(new HashMap<String, String>());
    }
}
