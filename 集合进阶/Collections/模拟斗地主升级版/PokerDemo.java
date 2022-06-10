package Java.集合进阶.Collections.模拟斗地主升级版;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeSet;

/*
    需求:
        通过程序实现斗地主过程中的洗牌，发牌和看牌。
    要求: 对牌进行排序

    思路:
        1，创建HashMap，键是编号，值是牌
        2，创建ArrayList，存储编号
        3，创建花色数组和点数数组
        4，从0开始往HashMap里面存储编号，并存储对应的牌。同时往ArrayList里面存储编号
        5，洗牌(洗的是编号)，用Collections的shuffle()方法实现
        6，发牌(发的也是编号，为了保证编号是排序的，创建TreeSet集合接收)
        7，定义方法看牌(遍历TreeSet集合，获取编号，到HashMap集合找对应的牌)
        8，调用看牌方法
 */
public class PokerDemo {
    public static void main(String[] args) {
        //1，创建HashMap，键是编号，值是牌
        HashMap<Integer, String> hm = new HashMap<Integer, String>();

        // 2，创建ArrayList，存储编号
        ArrayList<Integer> array = new ArrayList<Integer>();

        // 3，创建花色数组和点数数组
        String[] colors = {"♦", "♣", "♥", "♠"};
        String[] numbers = {"2", "3", "4", "5", "6", "7", "8", "9", "J", "Q", "K", "A"};
        // 4，从0开始往HashMap里面存储编号，并存储对应的牌。同时往ArrayList里面存储编号
        int index = 0;
        for (String number : numbers) {
            for (String color : colors) {
                hm.put(index, color + number);
                array.add(index);
                index++;
            }
        }
        hm.put(index, "小王");
        array.add(index);
        index++;
        hm.put(index, "大王");
        array.add(index);

        //5，洗牌(洗的是编号)，用Collections的shuffle()方法实现
        Collections.shuffle(array);

        //6，发牌(发的也是编号，为了保证编号是排序的，创建TreeSet集合接收)
        TreeSet<Integer> lqxSet = new TreeSet<Integer>();
        TreeSet<Integer> lyxSet = new TreeSet<Integer>();
        TreeSet<Integer> fqyxSet = new TreeSet<Integer>();
        TreeSet<Integer> dbSet = new TreeSet<Integer>();

        for (int i = 0; i < array.size(); i++) {
            int x = array.get(i);
            if (i >= array.size() - 3) {
                dbSet.add(x);
            } else if (i % 3 == 0) {
                lqxSet.add(x);
            } else if (i % 3 == 1) {
                lyxSet.add(x);
            } else if (i % 3 == 2) {
                fqyxSet.add(x);
            }
        }

        // 8，调用看牌方法
        lookPoker("林青霞", lqxSet, hm);
        lookPoker("柳岩", lyxSet, hm);
        lookPoker("风清扬", fqyxSet, hm);
        lookPoker("底牌", dbSet, hm);
    }

    // 7，定义方法看牌(遍历TreeSet集合，获取编号，到HashMap集合找对应的牌)
    public static void lookPoker(String name, TreeSet<Integer> ts, HashMap<Integer, String> hm) {
        System.out.println(name + "的牌是:");
        for (Integer key : ts) {
            String poker = hm.get(key);
            System.out.print(poker + " ");
        }
        System.out.println();
    }
}
