package Java.函数式接口.Supplier接口练习;

import java.util.function.Supplier;

/*
    定义一个类(SupplierTest)，在类中提供两个方法:
        一个方法是: int getMax(Supplier<Integer> sup);  用于返回一个int数组中的最大值
        一个方法是主方法，在主方法中调用getMax方法
 */
public class SupplierTest {
    public static void main(String[] args) {
        //定义一个int数组
        int[] arr = {19,50,28,37,46};
        int maxValue = getMax(() -> {
            int max = arr[0];
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] > max) {
                    max = arr[i];
                }
            }
            return max;
        });
        System.out.println(maxValue);

    }
    private static int getMax(Supplier<Integer> sup) {
//        Integer ieg = sup.get();
//        int i = ieg.intValue();
//        return i;
        return sup.get();  //自动转型
    }
}
