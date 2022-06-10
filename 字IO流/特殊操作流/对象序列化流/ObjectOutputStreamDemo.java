package Java.字IO流.特殊操作流.对象序列化流;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/*
    对象序列化流
        构造方法:
            ObjectOutputStream(OutputStream out);  创建一个写入指定的OutputStream的OutputStream

        序列化对象的方法:
            void writeObject(Object obj);  将指定的对象写入ObjectOutputStream

    NotSerializableException: 抛出一个实例需要一个Serializable接口。序列化运行时或实例的类可能会抛出此异常

    类的序列化由实现java.io.Serializable接口的类启用。不实现此接口的类将不会使用任何状态序列化或反序列化
 */
public class ObjectOutputStreamDemo {
    public static void main(String[] args) throws IOException {
        //ObjectOutputStream(OutputStream out);  创建一个写入指定的OutputStream的OutputStream
        ObjectOutputStream oos = new ObjectOutputStream(
                new FileOutputStream("untitled1\\oos.txt")
        );
        //创建对象
        Student1111 s = new Student1111("卡卡",12);

//        void writeObject(Object obj);  将指定的对象写入ObjectOutputStream
        oos.writeObject(s);

        //释放资源
        oos.close();
    }
}
