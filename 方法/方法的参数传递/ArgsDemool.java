package Java.方法.方法的参数传递;

public class ArgsDemool {
    public static void main(String[] args) {
        int number = 100;
        System.out.println(number);
        change(number);
        System.out.println(number);
    }
    public static void change(int number) {
        number = 200;
    }
}
