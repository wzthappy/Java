package Java.异常.Throwable的成员方法;
/*
* public String getMessage();  返回此 throwable 的详细消息字符串
* public String toString();  返回此可抛出的简短描述
* public void printStackTrace();  把异常的错误信息输出在控制台
* */
public class ExceptionDemo2 {
    public static void main(String[] args) {
        System.out.println("开始");
        method();
        System.out.println("结束");
    }
    public static void method() {
        try {
            int[] arr = {1,2,3};
            System.out.println(arr[3]);    //这里产生了一个异常的对象 new ArrayIndexOutOfBoundsException("xxx");
        } catch (ArrayIndexOutOfBoundsException e) {   // e =  new ArrayIndexOutOfBoundsException("xxx");
            //1， public void printStackTrace();  把异常的错误信息输出在控制台
//            e.printStackTrace();

            //2， public String getMessage();  返回此 throwable 的详细消息字符串
//            System.out.println(e.getMessage());    //3

            //3，public String toString();  返回此可抛出的简短描述
//            System.out.println(e.toString());      //java.lang.ArrayIndexOutOfBoundsException: 3

            e.printStackTrace();   //他的异常信息是最全的
        }
    }
}
/*
public class Throwable {
         private String ;

         public Throwable(String message) {
            detailMessage = message;
         }

        public String getMessage() {
        return detailMessage;
    }
}
 */