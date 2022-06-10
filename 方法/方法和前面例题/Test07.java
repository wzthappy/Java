package Java.方法.方法和前面例题;

public class Test07 {
    public static void main(String[] args) {
        //定义两个数组，分别使用静态初始化完成数组元素的初始化
        int[] arr = {11, 22, 33, 44, 55};
//        int[] arr2 = {11, 22, 33, 44, 55};
        int[] arr2 = {11, 22, 33, 44, 553};
        //调用方法，用变量接收
        boolean flag = compare(arr,arr2);
        //输出结果
        System.out.println(flag);
    }

    //定义一个方法，用于比较两个数组的内容是否相同
    /*
     * 两个明确:
     *    返回值类型：boolean
     *    参数：int[] arr,int[] arr2
     * */
    public static boolean compare(int[] arr, int[] arr2) {
        //首先比较数组的长度，如果长度不相同，数组内容肯定不相同，返回false
        if (arr.length != arr2.length) {
            return false;
        }

        //其次遍历，比较两个数组中的每一个元素，只要有元素不相同，放回false
        for (int x = 0; x < arr.length; x++) {
            if (arr[x] != arr2[x]) {
                return false;
            }
        }
        //最后循环遍历结束后，返回true
        return true;
    }
}