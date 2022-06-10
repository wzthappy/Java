package Java.常用API.Date类的常用方法;

import java.util.Date;

/*
 * public long getTime();   获取的是日期对象从1970年1月1日 00:00:00 到现在的毫秒值
 * public void setTime(long time);   设置时间，给的是毫秒值
 * */
public class DateDemo02 {
    public static void main(String[] args) {
        //创建对象
        Date d = new Date();
        // public long getTime();   获取的是日期对象从1970年1月1日 00:00:00 到现在的毫秒值
        System.out.println(d.getTime());
        System.out.println(d.getTime() * 1.0 / 1000 / 60 / 60 / 24 / 365 + "年");

        //public void setTime(long time);   设置时间，给的是毫秒值
//        long time = 1000*60*60;
        long time = System.currentTimeMillis();
        d.setTime(time);
        System.out.println(d);
    }
}
