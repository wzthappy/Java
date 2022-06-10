package Java.反射.反射获取成员方法并使用;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/*
    反射获取成员方法并使用
 */
public class ReflectDemo01 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        //获取Class对象
        Class<?> c = Class.forName("Java.反射.获取Class类中的对象.Student");

        //Method[] getMethods();  返回一个包含 方法对象的数组，所有公共方法，包括类或接口声明的对象以及从超类接口继承的类
        //Method[] getDeclaredMethods();  本类所有方法
//        Method[] methods = c.getMethods();
        Method[] methods = c.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println(method);
        }
        System.out.println("-------");

        //Method getMethod(Stream name，Class<?>... parameterTypes);  返回一个 公共方法对象
        //Method getDeclaredMethod(Stream name，Class<?>... parameterTypes);  返回一个 方法对象
        // public void method1() {
        Method m = c.getMethod("method1");

        //获取无参构造方法创建对象
        Constructor<?> con = c.getConstructor();
        Object obj = con.newInstance();

        //在类或接口上提供有关单一方法的信息和访问权限
        //Object invoke(Object obj,Object... args);  在具有指定参数的指定对象上调用此 方法对象表示的基本方法
        //Object:  返回值类型
        //obj: 调用方法的对象
        //args: 方法需要的参数
        m.invoke(obj);

    }
}
