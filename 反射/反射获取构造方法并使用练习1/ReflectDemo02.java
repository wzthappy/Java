package Java.反射.反射获取构造方法并使用练习1;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/*
    通过反射实现如下的操作:
        Student s = new Student("林青霞"，30，"西安");
        System.out.println(s);

 */
public class ReflectDemo02 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        //获取Class对象
        Class<?> c = Class.forName("Java.反射.获取Class类中的对象.Student");

        //public Student(String name, int age, String address) {
        //Constructor<?>[] getConstructor();
        Constructor<?> con = c.getConstructor(String.class,int.class,String.class);
        //基本数据类型也可以通过.class得到对应的Class类型

        Object obj = con.newInstance("林青霞", 30, "西安");

        System.out.println(obj);
    }
}
