package Java.字IO流.特殊操作流.对象序列化流的3个问题;

import java.io.*;

/*
    用对象序列化流序列化了一个对象后，假如我们修改了对象所属的文件，读取数据会不会出问题呢?
    java.io.InvalidClassException:
       当序列化运行时检测到类中的以下问题之一时抛出:
           类的串行版本与从流中读的类描述的类型不匹配
           该类包含未知的数据类型
           该类没有可访问的无参数构造函数

    local class incompatible:
    stream classdesc serialVersionUID = -3392637735479593521,
    local class serialVersionUID = -2434060384973774546

    如果出问题了，如何解决呢?
    // 给对象所属的类加一个值:  private static final long serialVersionUID = 42L;

    如果一个对象中某个成员变量的值不想被序列化，又该如何实现呢?
            private transient int age;
 */
public class ObjectStreamDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        write();
        read();
    }

    //反序列化
    private static void read() throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(
                new FileInputStream("untitled1\\oos2.txt")
        );
        Object obj = ois.readObject();

        Student123 s = (Student123)obj;
        System.out.println(s.getNemo() + ", " + s.getAge());
    }

    //序列化
    private static void write() throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(
                new FileOutputStream("untitled1\\oos2.txt")
        );
        Student123 s = new Student123("卡卡",20);
        oos.writeObject(s);

        oos.close();
    }
}
