package Java.字IO流.特殊操作流.Properties和IO流结合的方法;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

/*
    Properties和IO流结合的方法:
        void load(Reader reader);  从输入字符流读取属性列表 (键和元素对);

    void store(Writer writer, String comments);
        将此属性列表 (键和元素对) 写入此 Properties表中,以适合使用 Load(Reader)方法的格式写入输出字符流
 */
public class PropertiesDemo {
    public static void main(String[] args) throws IOException {
        //把集合中的数据保存到文件
        myStore();
        //把文件中的数据加载到集合
        myLoad();
    }

    private static void myLoad() throws IOException {
        Properties prop = new Properties();
        // void load(Reader reader);  从输入字符流读取属性列表 (键和元素对);
        FileReader fr = new FileReader("untitled1\\fw.txt");
        prop.load(fr);

        fr.close();

        System.out.println(prop);
    }

    private static void myStore() throws IOException {
        Properties prop = new Properties();
        prop.setProperty("it001","卡卡");
        prop.setProperty("it002","零零");
        prop.setProperty("it003","哈哈");
//        void store(Writer writer, String comments);
//        将此属性列表 (键和元素对) 写入此 Properties表中,以适合使用 Load(Reader)方法的格式写入输出字符流
        FileWriter fw = new FileWriter("untitled1\\fw.txt");
        prop.store(fw,null);
        fw.close();
    }
}
