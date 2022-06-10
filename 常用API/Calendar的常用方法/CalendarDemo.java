package Java.常用API.Calendar的常用方法;

import java.util.Calendar;

/*
* public int get(int field);  返回给定日历字段的值
* public abstract void add(int field,int amount);  根据日历的规则，将指定的时间量添加或减去给定的日历字段
* public final void set(int year,int month,int dote);  设置当前日历的年月日
* */
public class CalendarDemo {
    public static void main(String[] args) {
        //获取日历类对象
        Calendar c = Calendar.getInstance();

        //一，public int get(int field);  返回给定日历字段的值
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH)+1;
        int date = c.get(Calendar.DATE);
        System.out.println(year + "年" + month + "月" + date +"日");

        //二，public abstract void add(int field,int amount);  根据日历的规则，将指定的时间量添加或减去给定的日历字段
        Calendar c2 = Calendar.getInstance();
          //  需求1:三年前的今天 ，减三年
        c2.add(Calendar.YEAR,-3);
        int year2 = c2.get(Calendar.YEAR);
        int month2 = c2.get(Calendar.MONTH)+1;
        int date2 = c2.get(Calendar.DATE);
        System.out.println(year2 + "年" + month2 + "月" + date2 +"日");
        //需求2: 10年后的5天前
        Calendar c3 = Calendar.getInstance();
        c3.add(Calendar.YEAR,10);
        c3.add(Calendar.DATE,-5);
        int year3 = c3.get(Calendar.YEAR);
        int month3 = c3.get(Calendar.MONTH)+1;
        int date3 = c3.get(Calendar.DATE);
        System.out.println(year3 + "年" + month3 + "月" + date3 +"日");

        //三，public final void set(int year,int month,int dote);  设置当前日历的年月日
        Calendar c4 = Calendar.getInstance();
        c4.set(2022,11,11);
        int year4 = c4.get(Calendar.YEAR);
        int month4 = c4.get(Calendar.MONTH)+1;
        int date4 = c4.get(Calendar.DATE);
        System.out.println(year4 + "年" + month4 + "月" + date4 +"日");
    }
}
