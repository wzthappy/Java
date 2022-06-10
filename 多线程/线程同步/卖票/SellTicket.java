package Java.多线程.线程同步.卖票;

//1，定义一个类SellTicket实现Runnable接口，里面定义一个成员变量: private int tickets = 100;
public class SellTicket implements Runnable {
    private int tickets = 100;
    private Object obj= new Object();

    @Override
    public void run() {
        while (true) {
            //假设t1抢到的cpu的执行权
            //t2抢到的cpu的执行权，但是锁住了，要等t1执行玩
            synchronized (obj) {
                //t1进来后，就会把这段代码锁起来
                if (tickets > 0) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + "正在出售第" + tickets + "张票");
                    tickets--;
                }
            }
            //t1出来了，这段代码的锁就释放了
        }

        //2，在SellTicket类中重写run()方法实现卖票，代码步骤如下
        // A: 判断票数大于0，就卖票，并告知是那个窗口卖的
        // B: 卖了票之后，总票数就会减1
        // C: 票没有了，也可能有人来问，所以这里用死循环让买票的动作一直执行
        //相同的票出现了多次
//        while (true) {
////            通过sleep()方法来模拟出票时间
//            if (tickets > 0) {
//                try {
//                    Thread.sleep(100);
//                    //t1线程休息100毫秒
//                    //t2线程抢到了cpu的执行权，t2线程就开始执行，执行到这里的时候，t2线程休息100毫秒
//                    //t3线程抢到了cpu的执行权，t3线程就开始执行。。。。。。
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//                //假设线程按照顺序执行过来
//                //t1抢到cpu的执行权,在控制台输出: 窗口1正在出售第100张票
//                System.out.println(Thread.currentThread().getName() + "正在出售第" + tickets + "张票");
//                //t2抢到的cpu的执行权，在控制台输出: 窗口2正在出售第100张票
//                //t3抢到的cpu的执行权，在控制台输出: 窗口3正在出售第100张票
//                tickets--;
//                //如果这个线程还是按照顺序来，这里就执行了3次--的操作: 最终票变成了97
//            }
//        }

//        //出现了负数的票
//        while (true) {
//            //tickets = 1;
//            if (tickets > 0) {
//                try {
//                    Thread.sleep(100);
//                    //t1线程休息100毫秒
//                    //t2线程抢到了cpu的执行权，t2线程就开始执行，执行到这里的时候，t2线程休息100毫秒
//                    //t3线程抢到了cpu的执行权，t3线程就开始执行。。。。。。
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//                //假设线程按照顺序执行过来
//                //t1抢到cpu的执行权,在控制台输出: 窗口1正在出售第1张票
//                //假设t1继续拥有cpu的执行权，就会执行  tickets--;操作   tickets = 0;
//                //t2抢到cpu的执行权,在控制台输出: 窗口2正在出售第0张票
//                //假设t2继续拥有cpu的执行权，就会执行  tickets--;操作   tickets = -1;
//                //t3抢到cpu的执行权,在控制台输出: 窗口3正在出售第-1张票
//                //假设t2继续拥有cpu的执行权，就会执行  tickets--;操作   tickets = -2;
//                System.out.println(Thread.currentThread().getName() + "正在出售第" + tickets + "张票");
//                tickets--;
//            }
//        }
    }
}
