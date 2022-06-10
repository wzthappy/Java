package Java.方法.数组遍历;

public class MethodTest01 {
    public static void main(String[] args) {
        //定义一个数组，用静态初始化完成数组初始化
        int[] arr = {11,22,33,44,55};
        //调用方法
        printArray(arr);
    }
    //定义一个方法，用数组遍历通用格式对数组进行遍历
    /*
        两个明确：
            返回值类型； void
            参数： int[] arr
     */
    public static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if(i == arr.length-1) {
                System.out.print(arr[i]);
            } else {
                System.out.print(arr[i] + ", ");
            }
        }
        System.out.println("]");
    }
}
