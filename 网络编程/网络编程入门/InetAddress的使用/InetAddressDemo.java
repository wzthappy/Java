package Java.网络编程.网络编程入门.InetAddress的使用;

import java.net.InetAddress;
import java.net.UnknownHostException;

/*
    InetAddress
        此类表示IntAddress协议 (IP) 地址

    public static InetAddress getByName(String host);  确定主机名称的IP地址。主机名称可以是机器名称，也可以是IP地址
    public String getHostName();  获取此IP地址的主机名
    public String getHostAddress();  返回文本显示中的IP地址字符串
 */
public class InetAddressDemo {
    public static void main(String[] args) throws UnknownHostException {
        // public static InetAddress getByName(String host);  确定主机名称的IP地址。主机名称可以是机器名称，也可以是IP地址
        InetAddress address = InetAddress.getByName("LAPTOP-1HJ3H98M");
//        InetAddress address = InetAddress.getByName("192.168.3.12");
        //InetAddress
        System.out.println("InetAddress对象: " + address);


        //public String getHostName();  获取此IP地址的主机名
        String name = address.getHostName();
        System.out.println("主机名: " + name);

        //public String getHostAddress();  返回文本显示中的IP地址字符串
        String ip = address.getHostAddress();
        System.out.println("IP地址: " + ip);
    }
}
