package Java.面向对象.类的定义和使用;

/*
* 创建对象
*    格式：类名 对象名 = new 类名();
*
* 使用对象
*    1，使用成员变量
*         格式：对象名.变量名
*    2，使用成员方法
*         格式：对象名.方法名()
* */
public class PhoneDemo {
    public static void main(String[] args) {
        //创建对象
        //格式：类名 对象名 = new 类名();
        Phone p = new Phone();  //类名：手机(面向对象.类的定义和使用.Phone)

        // 使用对象
        //1,使用成员变量
        //格式：对象名.变量名    默认值
        System.out.println(p.brand); //品牌(brand)
        System.out.println(p.price); //价格(price)
        //赋值
        p.brand = "小米";
        p.price = 2999;
        //调用
        System.out.println(p.brand);
        System.out.println(p.price);

        //2，使用成员方法
        p.call();   // 打电话(call)
        p.sendMessage();  //发短信(sendMessage)
    }
}
