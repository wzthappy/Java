package Java.多线程.实现多线程.方式1;
/*
    方式1: 继承Thread类
        1，定义一个类MyThread继承Thread类
        2，在MyThread类中重写run()方法
        3，创建MyThread类的对象
        4，启动线程
 */
public class MyThreadDemo {
    public static void main(String[] args) {
        // 3，创建MyThread类的对象
        MyThread my1 = new MyThread();
        MyThread my2 = new MyThread();

//        my1.run();
//        my2.run();     // 没有被多线程

        //void start();  导致此线程开始执行，Java虚拟机调用此线程的run()方法
        my1.start();
        my2.start();
    }
}
