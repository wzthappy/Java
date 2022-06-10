package Java.方法.方法和前面例题;

public class Test04 {
    public static void main(String[] args) {
        //为了存储多个月的兔子对数，定义一个数组，用动态初始化完成数组元素的初始化，长度为20
        int[] arr = new int[20];

        //因为第1个月，第2个月兔子的对数是已知的，都是1；
        arr[0] = 1;
        arr[1] = 1;

        //用循环实现计算每个月的兔子对数
        for (int i = 2; i < arr.length; i++) {
            arr[i] = arr[i - 2] + arr[i - 1];
            /*
            * arr[2] = arr[0] + arr[1];   2
            * arr[3] = arr[1] + arr[2];   3
            * arr[4] = arr[2] + arr[3];   5
            *             .......
            * */
        }
        //第20个月的兔子对数
        System.out.println("第二十个月兔子的对数是：" + arr[19]);
    }
}
