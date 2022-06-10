package Java.多线程.生产者消费者案例;
//2，生产者类(Producer); 实现Runnable接口，重写run()方法，调用存储牛奶的操作
public class Producer implements Runnable {
    private Box b;

    public Producer(Box b) {
        this.b = b;
    }

    @Override
    public void run() {
        //调用存储牛奶的操作
        for (int i = 1; i <= 30 ; i++) {
            b.put(i);
        }
    }
}
