package Java.继承.方法重写和Override注解;

/*
* 新手机
* */
public class NewPhone extends Phone02 {
    @Override
    public void call(String name) {
        System.out.println("开启视频功能");
//        System.out.println("给" + name + "打电话");
        super.call(name);
    }
//    @Override   //检查写方法的时候，方法声明的正确性
//    public void calll(String name) {
//        System.out.println("开启视频功能");
////        System.out.println("给" + name + "打电话");
//        super.call(name);
//    }
}
