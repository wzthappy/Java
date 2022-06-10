package Java.网络编程.UDP通信程序.UDP通信程序练习;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

/*
    UDP接收数据:
        因为接收端不知到发送端什么时候停止发送, 故采用死循环接收
 */
public class ReceiveDemo {
    public static void main(String[] args) throws IOException {
        //创建接收端的Socket对象(DatagramSocket)
        DatagramSocket ds = new DatagramSocket(12345);

        //故采用死循环接收
        while (true) {
            //创建一个数据包,用于接收数据
            byte[] bys = new byte[1024];
            DatagramPacket dp = new DatagramPacket(bys, bys.length);

            //调用DatagramSocket对象的方法接收数据
            ds.receive(dp);

            //解析数据包,并把数据在控制台显示
//        byte[] bytes = dp.getData();
//        int len = dp.getLength();
//        String s = new String(bytes,0,len);
            System.out.println("数据是: " +
                    new String(dp.getData(), 0, dp.getLength()));
        }
        //关闭接收端
//            ds.close();
    }
}
