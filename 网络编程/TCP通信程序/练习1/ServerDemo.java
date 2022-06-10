package Java.网络编程.TCP通信程序.练习1;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/*
    服务器: 接收数据, 给出反馈
 */
public class ServerDemo {
    public static void main(String[] args) throws IOException {
        //创建服务端的Socket对象(ServerSocket)
        ServerSocket ss = new ServerSocket(10000);

        //监听客户端连接,返回一个Socket对象
        Socket s = ss.accept();

        //获取输入流,读数据,并把数据显示在控制台
        InputStream is = s.getInputStream();
        byte[] bys = new byte[1024];
        int len = is.read(bys);
        System.out.println("服务器: " + new String(bys,0,len));

        //给出反馈
        OutputStream os = s.getOutputStream();
        os.write("数据已经收到".getBytes());

        //释放资源
        ss.close();
    }
}
