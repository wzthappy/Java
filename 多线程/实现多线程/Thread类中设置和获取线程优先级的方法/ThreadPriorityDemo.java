package Java.多线程.实现多线程.Thread类中设置和获取线程优先级的方法;
/*
    Thread类中设置和获取线程优先级的方法:
        public final void setPriority(int newPriority);  更改此线程的优先级
        public final int getPriority();  返回此线程的优先级
 */
public class ThreadPriorityDemo {
    public static void main(String[] args) {
        ThreadPriority tp1 = new ThreadPriority();
        ThreadPriority tp2 = new ThreadPriority();
        ThreadPriority tp3 = new ThreadPriority();

        tp1.setName("高铁");
        tp2.setName("飞机");
        tp3.setName("汽车");

        //public final int getPriority();  返回此线程的优先级
//        System.out.println(tp1.getPriority());
//        System.out.println(tp2.getPriority());
//        System.out.println(tp3.getPriority());  //5

//        tp1.setPriority(10000);  //IllegalArgumentException
//        System.out.println("最大优先级: " + Thread.MAX_PRIORITY);   //10
//        System.out.println("最小优先级: " + Thread.MIN_PRIORITY);   //1
//        System.out.println("默认优先级: " + Thread.NORM_PRIORITY);  //5

        //设置正确的优先级
        tp1.setPriority(5);
        tp2.setPriority(10);
        tp3.setPriority(1);

        tp1.start();
        tp2.start();
        tp3.start();
    }
}
