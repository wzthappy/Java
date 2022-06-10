package Java.字IO流.File.递归求阶乘;
/*
    需求:
        用递归求5的阶乘，并把结果在控制台输出

    思路:
        1，定义一个方法，用于递归求阶乘，参数为一个int类型的变量
        2，在方法内部判断该变量的值是否是1
            是: 返回1
            不是: 返回n*(n-1)!
        3，调用方法
        4，输出结果
 */
public class DiGuiDemo01 {
    public static void main(String[] args) {
        //3，调用方法
        int result = jc(5);
        // 4，输出结果
        System.out.println("5的阶乘是: " + result);
    }

    // 1，定义一个方法，用于递归求阶乘，参数为一个int类型的变量
    public static int jc(int n) {
        //2，在方法内部判断该变量的值是否是1
        if (n == 1) {
            return 1;
        } else {
            return n * jc(n - 1);
        }
    }
}
