package Java.反射.反射获取成员方法并使用练习;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/*
    练习: 通过反射实现如下操作
        Student s = new Student();
        s.method1();
        s.method2("林青霞");
        Student ss = s.method3("林青霞"，30);
        System.out.println(ss);
        s.function()；
 */
public class ReflectDemo02 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchFieldException {
        //创建Class对象
        Class<?> c = Class.forName("Java.反射.获取Class类中的对象.Student");

        //Student s = new Student();
        Constructor<?> con = c.getConstructor();

        Object obj = con.newInstance();

        // s.method1();
        Method m1 = c.getMethod("method1");
        m1.invoke(obj);

        //s.method2("林青霞");
        Method m2 = c.getMethod("method2",String.class);
        m2.invoke(obj,"林青霞");

        // Student ss = s.method3("林青霞"，30);
        Method m3 = c.getMethod("method3", String.class, int.class);
        Object o = m3.invoke(obj, "林青霞", 30);
        //System.out.println(ss);
        System.out.println(o);

        //s.function()；
        Method m4 = c.getDeclaredMethod("function");
        m4.setAccessible(true);
        m4.invoke(obj);
    }
}
