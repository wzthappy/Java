package Java.接口.接口的成员特点;

public interface Inter {
    public int num = 10;
    public final int num2 = 20;

    int num3 = 30;   // 等价  public static final int num3 = 30;

//    public Inter() {}  报错

//    public void show() {}  报错

    public abstract void method();
    void show();    //等价于  public abstract void show();
}
