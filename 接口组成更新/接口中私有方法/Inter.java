package Java.接口组成更新.接口中私有方法;

public interface Inter {
    default void show1() {
        System.out.println("show1开始执行");
        show();
        System.out.println("show1结束执行");
    }
    default void show2() {
        System.out.println("show2开始执行");
        show();
        System.out.println("show2结束执行");
    }

    static void show() {    //我的JDK没有有private.....，用他代替
        System.out.println("初级工程师");
        System.out.println("中级工程师");
        System.out.println("高级工程师");
    }

    static void method1() {
        System.out.println("method1开始执行");
//        System.out.println("初级工程师");
//        System.out.println("中级工程师");
//        System.out.println("高级工程师");
        show();      //private 私用  非静态不能调用
        //private 私用  静态可以调用
        System.out.println("method1结束执行");
    }
    static void method2() {
        System.out.println("method2开始执行");
        show();
        System.out.println("method2结束执行");
    }
}