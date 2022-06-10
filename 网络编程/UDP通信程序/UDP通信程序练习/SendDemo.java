package Java.网络编程.UDP通信程序.UDP通信程序练习;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/*
    UDP发送数据:
        数据来源键盘录入, 直到输入的数据是886, 发送数据结束
 */
public class SendDemo {
    public static void main(String[] args) throws IOException {
        //创建发送端的Socket对象(DatagramSocket)
        DatagramSocket ds = new DatagramSocket();

        //自己封装键盘录入
        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in)
        );
        String line;
        while ((line = br.readLine()) != null) {
//            输入的数据是886, 发送数据结束
            if ("886".equals(line)) {
                break;
            }
            //创建数据,并把数据打包
            byte[] bys = line.getBytes();
            DatagramPacket dp = new DatagramPacket(bys,bys.length,
                    InetAddress.getByName("192.168.3.12"),12345);
            //调用DatagramSocket对象的方法发送数据
            ds.send(dp);
        }
        //关闭发送端
        ds.close();
    }
}
