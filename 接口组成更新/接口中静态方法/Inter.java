package Java.接口组成更新.接口中静态方法;

public interface Inter {
    void show();

    default void method(){
        System.out.println("Inter 中的默认方法执行了");
    }

//    public static void test() {
//        System.out.println("Inter 中的静态方法执行了");
//    }

    static void test() {
        System.out.println("Inter 中的静态方法执行了");
    }
}
