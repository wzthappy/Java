package Java.多线程.实现多线程.设置和获取线程名称;

public class MyThread extends Thread {
    public MyThread() {}

    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            // String getName();  返回此线程的名称
            System.out.println(getName() + ": " + i);
        }
    }
}
/*
private String name;

public Thread() {
    init(null, null, "Thread-" + nextThreadNum(), 0);
}

public Thread(String name) {
    init(null, null, name, 0);
}

private void init(ThreadGroup g, Runnable target, String name,
                  long stackSize) {
    init(g, target, name, stackSize, null, true);
}

private void init(ThreadGroup g, Runnable target, String name,
                      long stackSize, AccessControlContext acc,
                      boolean inheritThreadLocals) {
     this.name = name;
}

public final synchronized void setName(String name) {
    this.name = name;
}

 public final String getName() {
        return name;
    }

private static int threadInitNumber;  //0,1----
private static synchronized int nextThreadNum() {
    return threadInitNumber++;  //0,1----  后++
}
 */
