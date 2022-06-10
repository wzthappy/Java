package Java.网络编程.TCP通信程序.TCP发送数据;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

/*
    TCP发送数据的步骤:
        1,创建客户端的Socket对象(Socket)
        2,获取输出流,写数据
        3,释放资源
 */
public class ClientDemo {
    public static void main(String[] args) throws IOException {
        //1,创建客户端的Socket对象(Socket)
        //Socket(InetAddress address, int port);  创建流套字并将其连接指定IP地址的指定端口号
//        Socket s = new Socket(InetAddress.getByName("192.168.1.103"),10000);
        //Socket(String host, int port);  创建流套字并将其连接指定IP地址的指定端口号
        Socket s = new Socket("192.168.1.103",10000);

        //2,获取输出流,写数据
        //OutputStream getOutputStream();  返回此套接字的输出流
        OutputStream os = s.getOutputStream();
        os.write("hello,tcp,我来了".getBytes());

        // 3,释放资源
        s.close();
    }
}
