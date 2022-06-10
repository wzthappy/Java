package Java.方法.方法和前面例题;

public class Test03 {
    public static void main(String[] args) {
        //数据在1~100之间，用for循环实现数据的获取
        for (int x = 1; x <= 100; x++) {
            //根据规则，用if语句实现数据的判断：要么个位是7，要么十位是7，要么能被7整除
            if (x % 10 == 7 || x / 10 % 10 == 7 || x % 7 == 0) {
                //在控制台输出满足规则的数据
                System.out.println(x);
            }
        }
    }
}
