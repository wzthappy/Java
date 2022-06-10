package Java.反射.反射获取构造方法并使用练习2;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/*
    通过反射实现如下的操作:
        Student s = new Student("林青霞");
        System.out.println(s);
 */
public class ReflectDemo03 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        //获取Class对象
        Class<?> c = Class.forName("Java.反射.获取Class类中的对象.Student");

        //private Student(String name) {
        // //Constructor<?>[] getDeclaredConstructor(Class<?>... parameterTypes);
        Constructor<?> con = c.getDeclaredConstructor(String.class);   //private

        //暴力反射
        //public void setAccessible(boolean flag);  值为true，取消访问检查
        con.setAccessible(true);

        Object obj = con.newInstance("林青霞");
        System.out.println(obj);
    }
}
