package Java.字符串.StringBuilder;

/*
* 1,StringBuilder 转换为 String
*       public String toString();  通过 toString() 就可以实现把 StringBuilder 转换为 String
*
* 2,String 转换为 StringBuilder
*       public StringBuilder(String s);  通过构造方法就可以实现把 String 转换为 StringBuilder
* */
public class StringBuilderDemo02 {
    public static void main(String[] args) {
        //1,StringBuilder 转换为 String
        StringBuilder sb = new StringBuilder();
        sb.append("hello");

//        String s = sb;  X 这个是错错误的做法
        //  public String toString();  通过 toString() 就可以实现把 StringBuilder 转换为 String
        String s = sb.toString();
        System.out.println(s);

        //2,String 转换为 StringBuilder
        String s2 = "hello";

//        StringBuilder sb = s2;  X 这个是错错误的做法
        //public StringBuilder(String s);  通过构造方法就可以实现把 String 转换为 StringBuilder
        StringBuilder sc = new StringBuilder(s2);
        System.out.println(sc);
    }
}
