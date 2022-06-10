package Java.方法.方法和前面例题;

import java.util.Scanner;

public class Test08 {
    public static void main(String[] args) {
        //定义一个数组，用静态初始化完成数组元素的初始化
        int[] arr = {19, 28, 37, 46, 50};

        //键盘录入要查找的数据，用一个变量接收
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入要查找的数据：");
        int number = sc.nextInt();

        /*1, //定义一个索引变量，初始值为-1
        int index = -1;

        //遍历数组，获取到数组中的每一个元素
        for (int x = 0; x < arr.length; x++) {
            //拿录入的数据和数组中的每一个元素进行比较，如果值相同，就把该值对应的索引赋值给索引变量，便结束循环
            if (arr[x] == number) {
                index = x;
                break;
            }
        }*/

        //调用方法
        int index = getIndex(arr,number);
        //输出索引变量
        System.out.println(index);
    }

    // 2, 查找指定的数据在数组中的索引
    /*
    * 两个明确：
    *    返回值类型： int
    *    参数： int[] arr,int number
    * */
    public static int getIndex(int[] arr,int number){
              //定义一个索引变量，初始值为-1
        int index = -1;

        //遍历数组，获取到数组中的每一个元素
        for (int x = 0; x < arr.length; x++) {
            //拿录入的数据和数组中的每一个元素进行比较，如果值相同，就把该值对应的索引赋值给索引变量，便结束循环
            if (arr[x] == number) {
                index = x;
                break;
            }
        }
        //返回索引
        return index;
    }
}
