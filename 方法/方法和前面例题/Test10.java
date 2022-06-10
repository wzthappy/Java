package Java.方法.方法和前面例题;

import java.util.Scanner;

public class Test10 {
    public static void main(String[] args) {
        //定义一个数组，用动态初始化完成数据元素的初始化，长度为6
        int[] arr = new int[6];

        //键盘录入评委分数
        Scanner sc = new Scanner(System.in);
        //由于是6个评委打分，所以，接收评委分数的操作，用循环改进
        for (int x = 0; x < arr.length; x++) {
            System.out.println("请输入第" + (x + 1) + "个评委的打分：");
            arr[x] = sc.nextInt();
        }
        //调用输入的数据
        System.out.print("输入的数据：");
        printArray(arr);

        //调用最大值
        int max = getMax(arr);

        //调用最小值
        int min = getMin(arr);

        //调用数组和
        int sum = getSum(arr);

        // 按照计算规则进行计算得到平均分
        int avg = (sum-max-min)/ (arr.length-2);

        //输出平均分
        System.out.println("选手的最终得分是：" + avg);
    }

    //定义方法实现获取数组中的元素的和(数组元素求和)
    /*
    * 两个明确：
    *    放回值类型：int
    *    参数：int[] arr
    * */
    public static int getSum(int[] arr) {
        int sum = 0;
        for (int x = 0; x < arr.length; x++) {
            sum += arr[x];
        }
        return sum;
    }
    //定义方法实现获取数据中的最低分(数组最小值)
    /*
     * 两个明确：
     *    返回值类型：int
     *    参数：int[] arr
     * */
    public static int getMin(int[] arr) {
        int min = arr[0];
        for (int x = 1; x < arr.length; x++) {
            if (arr[x] < min) {
                min = arr[x];
            }
        }
        return min;
    }

    //定义方法实现获取数据中的最高分(数组最大值)
    /*
     * 两个明确：
     *    返回值类型：int
     *    参数：int[] arr
     * */
    public static int getMax(int[] arr) {
        int max = arr[0];
        for (int x = 1; x < arr.length; x++) {
            if (arr[x] > max) {
                max = arr[x];
            }
        }
        return max;
    }

    //遍历数组
    public static void printArray(int[] arr) {
        System.out.print("[");
        for (int x = 0; x < arr.length; x++) {
            if (x == arr.length - 1) {
                System.out.print(arr[x]);
            } else {
                System.out.print(arr[x] + ", ");
            }
        }
        System.out.println("]");
    }
}
