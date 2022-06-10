package Java.面向对象.类的定义和使用;

/*
 * 类的定义
 *
 * 类的定义步骤：
 *       定义类
 *       编写类的成员变量
 *       编写类的成员方法
 *
 * 如：
 *    手机类：
 *       类名：
 *          手机(面向对象.类的定义和使用.Phone)
 *
 *       成员变量：
 *          品牌(brand)
 *          价格(price)
 *
 *       成员方法：
 *          打电话(call)
 *          发短信(sendMessage)
 * */
public class Phone {   //类名：手机(面向对象.类的定义和使用.Phone)

    // 成员变量
    String brand; //品牌(brand)
    int price; //价格(price)

    //成员方法
    public void call() {   // 打电话(call)
        System.out.println("打电话");
    }
    public void sendMessage() {  //发短信(sendMessage)
        System.out.println("发短信");
    }
}
