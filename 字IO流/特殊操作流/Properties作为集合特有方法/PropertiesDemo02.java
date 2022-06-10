package Java.字IO流.特殊操作流.Properties作为集合特有方法;

import java.util.Properties;
import java.util.Set;

/*
    Properties作为集合的特有方法:
        Object setProperty(String key, String value);  设置集合的键和值，都是String类型，底层调用Hashtable方法put
        String getProperty(String key);  使用此属性列表中指定的键搜索属性
        Set<String> stringPropertyNames();  从该属性列表中放回一个不可修改的键集，其中键及其对应的值是字符串
 */
public class PropertiesDemo02 {
    public static void main(String[] args) {
        //创建集合对象
        Properties prop = new Properties();

        //Object setProperty(String key, String value);  设置集合的键和值，都是String类型，底层调用Hashtable方法put
        prop.setProperty("it001", "卡卡");
        /*
        Object setProperty(String key, String value) {
              return put(key, value);
         }

         Object put(Object key, Object value) {
              return map.put(key , value);
         }
         */
        prop.setProperty("it002", "晓晓");
        prop.setProperty("it003", "零零");

        // String getProperty(String key);  使用此属性列表中指定的键搜索属性
        System.out.println(prop.getProperty("it001"));
        System.out.println(prop.getProperty("it0011"));   //null

        System.out.println(prop);
//        Set<String> stringPropertyNames();  从该属性列表中放回一个不可修改的键集，其中键及其对应的值是字符串
        Set<String> names = prop.stringPropertyNames();
        for (String key : names) {
//            System.out.println(key);
            String value = prop.getProperty(key);
            System.out.println(key + value);
        }
    }
}
