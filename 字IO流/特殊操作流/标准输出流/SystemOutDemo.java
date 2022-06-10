package Java.字IO流.特殊操作流.标准输出流;

import java.io.PrintStream;

/*
    public static final printStream out;  标准输出流，通常该流对应显示输出或由主机环境或用户指定的另一个输出目标
 */
public class SystemOutDemo {
    public static void main(String[] args) {
        //public static final printStream out;  标准输出流
        PrintStream ps = System.out;

        //能够方便地打印各种数据值
//        ps.print("hello");
//        ps.print(100);
//        ps.println("hello");
//        ps.println(100);

        //System.out 的本质是一个字节输出流
        System.out.println("hello");
        System.out.print(100);

//        System.out.print();  报错，没有ln的必须要有数据
    }
}
