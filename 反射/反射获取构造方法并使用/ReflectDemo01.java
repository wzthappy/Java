package Java.反射.反射获取构造方法并使用;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/*
    反射获取构造方法并使用
 */
public class ReflectDemo01 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        //获取Class对象
        Class<?> c = Class.forName("Java.反射.获取Class类中的对象.Student");

        //Constructor<?>[] getConstructors();  返回一个包含 Constructor对象的数组，Constructor对象反应了由该 Class对象表示的类的所有公共构造函数
        Constructor<?>[] cons = c.getConstructors();
        for (Constructor con : cons) {
            System.out.println(con);    //public ....   公共构造函数
        }

        //Constructor<?>[] getDeclaredConstructors(); 返回反映由该 Class对象表示的类声明的所有构造函数的 .........
        Constructor<?>[] conss = c.getDeclaredConstructors();
        for (Constructor con : conss) {
            System.out.println(con);     // 所有构造函数
        }
        System.out.println("---------");

        //Constructor<?>[] getConstructor(Class<?>... parameterTypes);  返回一个 Constructor对象，..指定公共构造函数
        //Constructor<?>[] getDeclaredConstructor(Class<?>... parameterTypes);  返回一个 Constructor对象，..指定构造函数
        //参数: 要获取的构造方法的参数的个数和数据类型的字节码文件对象
        Constructor<?> con = c.getConstructor();
        //Constructor提供了一个类的单个构造函数的信息和访问权限
        //T newInstance(Object... initargs);  使用由此 Constructor对象表示的构造函数
        Object obj = con.newInstance();
        System.out.println(obj);    //  Student{name='null', age=0, address='null'}


    }
}
