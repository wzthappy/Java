package Java.面向对象.构造方法;

/*
* 测试类
* */
public class StudentDemo04 {
    public static void main(String[] args) {
        //创建对象
        Student04 s =new Student04();
        s.show();

        // public 构造方法.Student04(String name)
        Student04 s2 =new Student04("卡卡");
        s2.show();

        //public 构造方法.Student04(int age)
        Student04 s3 = new Student04(19);
        s3.show();

        //  public 构造方法.Student04(String name,int age)
        Student04 s4 = new Student04("卡卡",19);
        s4.show();
    }
}
