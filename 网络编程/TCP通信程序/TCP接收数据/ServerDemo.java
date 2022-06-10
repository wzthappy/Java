package Java.网络编程.TCP通信程序.TCP接收数据;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/*
    TCP接收数据的步骤:
        1,创建服务端的Socket对象(ServerSocket)
        + 监听客户端  返回Socket对象
        2,获取输入流,读数据,并把数据显示在控制台
        3,释放资源
 */
public class ServerDemo {
    public static void main(String[] args) throws IOException {
        //  1,创建服务端的Socket对象(ServerSocket)
        //  ServerSocket(int port);  创建绑定到指定端口的服务器套接字
        ServerSocket ss = new ServerSocket(10000);

        //Socket accept();  监听要连接到此套接字并接受它
        Socket s = ss.accept();

        //2,获取输入流,读数据,并把数据显示在控制台
        //InputStream getInputStream();
        InputStream is = s.getInputStream();
        byte[] bys = new byte[1024];
        int len = is.read(bys);
        System.out.println("数据是: " + new String(bys,0,len));

        //3,释放资源
//        s.close();
        ss.close();
    }
}
