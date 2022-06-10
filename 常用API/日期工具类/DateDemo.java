package Java.常用API.日期工具类;

import java.text.ParseException;
import java.util.Date;

/*
* 测试类
* */
public class DateDemo {
    public static void main(String[] args) throws ParseException {
        //创建日期对象
        Date d = new Date();
        String s1 = DateUtils.dateToString(d, "yyyy年MM月dd日 HH:mm:ss");
        System.out.println(s1);
        String s2 = DateUtils.dateToString(d,"yyyy年MM月dd日");
        System.out.println(s2);
        String s3 = DateUtils.dateToString(d,"HH:mm:ss");
        System.out.println(s3);
        System.out.println("----------");

        String s = "2048-08-09 12:12:12";
        Date dd = DateUtils.stringToDate(s, "yyyy-mm-dd HH:mm:ss");   //alt+enter
        System.out.println(dd);

    }
}
