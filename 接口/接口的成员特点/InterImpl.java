package Java.接口.接口的成员特点;

public class InterImpl implements Inter {  // 等价于 public class InterImpl extends Object implements Inter {
    public InterImpl() {
        super();              //extends Object
    }

    @Override
    public void method() {
        System.out.println("method");
    }

    @Override
    public void show() {
        System.out.println(" show");
    }
}
