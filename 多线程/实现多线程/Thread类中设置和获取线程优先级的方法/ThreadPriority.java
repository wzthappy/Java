package Java.多线程.实现多线程.Thread类中设置和获取线程优先级的方法;

public class ThreadPriority extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(getPriority() + getName() + ", " + i);
        }
    }
}
