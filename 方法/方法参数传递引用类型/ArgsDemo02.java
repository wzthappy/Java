package Java.方法.方法参数传递引用类型;

public class ArgsDemo02 {
    public static void main(String[] args) {
        int[] arr = {10,20,30};
        System.out.println("调用change方法前" + arr[1]);
        change(arr);
        System.out.println("调用change方法后" + arr[1]);
    }
    public static void change(int[] arr) {
        arr[1] = 200;
    }
}
