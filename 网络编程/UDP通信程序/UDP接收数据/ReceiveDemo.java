package Java.网络编程.UDP通信程序.UDP接收数据;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

/*
    UDP接收数据的步骤:
        1,创建接收端的Socket对象(DatagramSocket)
        2,创建一个数据包,用于接收数据
        3,调用DatagramSocket对象的方法接收数据
        4,解析数据包,并把数据在控制台显示
        5,关闭接收端
 */
public class ReceiveDemo {
    public static void main(String[] args) throws IOException {
        //1,创建接收端的Socket对象(DatagramSocket)
        //DatagramSocket(int port);  构造数据报套字并将其绑定到本地主机上的指定端口
        DatagramSocket ds = new DatagramSocket(10086);

        //  2,创建一个数据包,用于接收数据
        //DatagramPacket(byte[] buf, int length);  构造一个 DatagramPacket用于接收长度为 length 数据包
        byte[] bys = new byte[1024];
        DatagramPacket dp = new DatagramPacket(bys,bys.length);

        //  3,调用DatagramSocket对象的方法接收数据
        ds.receive(dp);

        //4,解析数据包,并把数据在控制台显示
        //byte[] getData();  返回数据缓冲区
//        byte[] datas = dp.getData();

        //int getLength();  返回要发送的数据的长度或接收到的数组长度
//        int len = dp.getLength();

//        String dataString = new String(datas,0,len);  //字节数组转换为字符串    字符串中的构造方法
//        System.out.print("数据是: " + dataString);

        System.out.print("数据是: " + new String(dp.getData(),0,dp.getLength()));

        // 5,关闭接收端
        ds.close();
    }
}