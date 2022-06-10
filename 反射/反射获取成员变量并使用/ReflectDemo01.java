package Java.反射.反射获取成员变量并使用;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/*
    反射获取成员变量并使用
 */
public class ReflectDemo01 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        //获取Class对象
        Class<?> c = Class.forName("Java.反射.获取Class类中的对象.Student");

        //Field[] getFields();  返回一个包含 Field对象的数组，Field对象反映由该 Class对象表示的类或接口的所有可访问的公共字段
        //Field[] getDeclaredFields();  返回一个包含 Field对象的数组，反映由该 Class对象表示的类或接口声明的所有字段
        Field[] fields = c.getFields();
        for (Field field : fields) {
            System.out.println(field);
        }
        System.out.println("--------");
        Field[] declaredFields = c.getDeclaredFields();
        for (Field field : declaredFields) {
            System.out.println(field);
        }

        System.out.println("--------");

       //Field getField(string name); 返回一个 Field对象，指定的 公共 成员字段
        //Field getDeclaredField(String name);   指定字段
        Field addressField = c.getField("address");

        //获取无参构造方法创建对象
        Constructor<?> con = c.getConstructor();
        Object obj = con.newInstance();

        //Field提供有关类或接口的单个字段的信息和动态访问
        //void set(Object obj, Object value);  将指定的对象参数中由此 Field对象表示的字段设置为指定的值
        addressField.set(obj,"西安");  //给obj的成员变量addressField赋值为"西安"

        System.out.println(obj);

    }
}
