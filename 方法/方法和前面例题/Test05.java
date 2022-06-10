package Java.方法.方法和前面例题;

public class Test05 {
    public static void main(String[] args) {
        //第一层循环，用于表达公鸡的范围，初始化表达式的变量定义为 x=0，判断条件是 x<=20 只  5元
        for (int x = 0; x <= 20; x++) {
            //第二层循环，用于表达母鸡的范围，初始化表达式的变量定义为 y=0，判断条件是 y<=33 只   3元
            for (int y = 0; y <= 33; y++) {
                //这个时候，用于表示小鸡的变量 z = 100 - x - y;    1元3只
                int z = 100 - x - y;
                //判断表达式 z % 3 == 0; 和表达式 5 * x + 3 * y +z / 3 = 100 是否同时成立
                if (z % 3 == 0 && 5 * x + 3 * y + z / 3 == 100) {
                    System.out.println("公鸡：" + x + " ,母鸡：" + y + " ,小鸡：" + z);
                }
            }
        }
    }
}
