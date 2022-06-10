package Java.继承.方法重写和Override注解;

/*
* 测试类
* */
public class PhoneDemo02 {
    public static void main(String[] args) {
        //创建对象，调用方法
        Phone02 p = new Phone02();
        p.call("晓晓");
        System.out.println("----------");
        NewPhone np = new NewPhone();
        np.call("晓晓");
    }
}
