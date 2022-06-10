package Java.字IO流.特殊操作流.Properties作为Map集合的使用;

import java.util.Properties;
import java.util.Set;

/*
    Properties作为Map集合的使用
 */
public class PropertiesDemo01 {
    public static void main(String[] args) {
        //创建集合对象
//        Properties<String,String> prop = new Properties<String,String>();   //错误
        Properties prop = new Properties();

        //存储元素
        prop.put("it001", "卡卡");
        prop.put("it002", "晓晓");
        prop.put("it003", "帆帆");

        //遍历集合
        Set<Object> keySet = prop.keySet();
        for (Object key : keySet) {
            Object value = prop.get(key);
            System.out.println(key + ", " + value);
        }
    }
}
