package Java.方法.方法重载;

public class MethodDemo {
    public static void main(String[] args) {
        //调用方法
        int result = sum(10,20);
        System.out.println(result);

        double result2 = sum(10.0,20.0);
            System.out.println(result2);

        int result3 = sum(10,20,30);
        System.out.println(result3);
    }
    //求两个int类型数据和方法
    public static int sum(int a,int b) {
        return a + b;
    }
    //求两个double类型数据和方法
    public static double sum(double a,double b) {
        return a + b;
    }
    //求三个int类型数据和方法
    public static int sum(int a,int b,int c) {
        return a + b +c;
    }
}
