package Java.继承.方法重写注意事项;

public class Zi06 extends Fu06 {

//    @Override    // 报错  show()方法是父类私用的类容,子类不可能重写
//    private void show() {
//        System.out.println("Zi中show()方法被调用");
//    }

//    @Override   //重写
//    public void method() {
//        System.out.println("Zi中method()方法被调用");
//    }

//    @Override
//    void method() {   //默认的权限
//        System.out.println("Zi中method()方法被调用");
//    }
        @Override
    public void method() {   //默认的权限
        System.out.println("Zi中method()方法被调用");
    }
}
