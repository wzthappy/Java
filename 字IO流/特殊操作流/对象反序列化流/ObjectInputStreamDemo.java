package Java.字IO流.特殊操作流.对象反序列化流;

import Java.字IO流.特殊操作流.对象序列化流.Student1111;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/*
    构造方法:
        ObjectInputStream(InputStream in);  创建从指定的InputStream读取的ObjectInputStream

    反序列化对象的方法:
        Object readObject();  从ObjectInputStream读取一个对象
 */
public class ObjectInputStreamDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // ObjectInputStream(InputStream in);  创建从指定的InputStream读取的ObjectInputStream
        ObjectInputStream ois = new ObjectInputStream(
                new FileInputStream("untitled1\\oos.txt")
        );
        // Object readObject();  从ObjectInputStream读取一个对象
        Object obj = ois.readObject();

        //向下转型
        Student1111 s = (Student1111) obj;

        System.out.println(s.getName() + ", " + s.getAge());

        ois.close();
    }
}
