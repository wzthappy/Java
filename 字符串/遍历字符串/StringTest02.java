package Java.字符串.遍历字符串;

import java.util.Scanner;

/*
* 需求：
*   键盘录入一个字符串，使用程序实现在控制台遍历该字符串
*
* 思路：
*   1，键盘录入一个字符串，用Scanner实现
*   2，遍历字符串，首先要能够获取到字符串中的每一个字符
*       public char charAt(int index); 返回指定索引处的char值，字符串的索引也是从0开始的
*   3，遍历字符串，其次要能够获取到字符串的长度
*       public int length(); 返回此字符串的长度
*       数组的长度：数组名.length;
*       字符串的长度：字符串对象.length();
*   4,遍历字符串的通用格式
* */
public class StringTest02 {
    public static void main(String[] args) {
        // 1，键盘录入一个字符串，用Scanner实现
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入一个字符串：");
        String line = sc.nextLine();


//        System.out.println(// line.charAt(0~line.length()) //);
        //3，遍历字符串，其次要能够获取到字符串的长度
        for (int i = 0; i < line.length(); i++) {
            //2，遍历字符串，首先要能够获取到字符串中的每一个字符    s.charAt();//获取第几个字符
            System.out.println(line.charAt(i));
        }
    }
}
