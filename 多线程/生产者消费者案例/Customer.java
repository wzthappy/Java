package Java.多线程.生产者消费者案例;
//3，消费者类(Customer); 实现Runnable接口，重写run()方法，调用获取牛奶的操作
public class Customer implements Runnable {
    private Box b;

    public Customer(Box b) {
        this.b = b;
    }

    @Override
    public void run() {
        while (true) {
            b.get();
        }
    }
}
