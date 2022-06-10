package Java.内部类.匿名内部类;
/*
* 前提：
*   存在一个类或者接口
*   这里的类可以是具体类也可以是抽象类
*
* 格式：
*   new 类名或者接口名() {
*       重写方法;
*   };
*
* 本质 :  是一个继承了该类或实现了该接口的子类匿名对象
* */
public class Outer {
    public void method() {
//       new Inter() {
//            @Override
//            public void show() {
//                System.out.println("匿名内部类");
//            }
//        };        //仅仅只是一个对象

        new Inter() {
            @Override
            public void show() {
                System.out.println("匿名内部类");
            }
        }.show();     // 对象调方法

        new Inter() {
            @Override
            public void show() {
                System.out.println("匿名内部类");
            }
        }.show();

        //多次调用
        Inter i = new Inter() {
            @Override
            public void show() {
                System.out.println("匿名内部类");
            }
        };
        i.show();
        i.show();

    }
}
