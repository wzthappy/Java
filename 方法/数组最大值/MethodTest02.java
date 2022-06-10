package Java.方法.数组最大值;

public class MethodTest02 {
    public static void main(String[] args) {
        //定义一个数组，用静态初始化完成数组元素初始化
        int[] arr = {12, 45, 98, 73 , 60};

        //调用获取最大值方法，用变量接收返回结果
        int number = getMax(arr);
        System.out.println("number:" + number);
    }
    //定义一个方法，用来获取数组中的最大值
    /*
        返回值类型：int
        参数：int[] arr
     */
    public static int getMax(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
