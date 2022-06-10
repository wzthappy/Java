package Java.修饰符.导包和权限修饰符.itcast02;

public class Fu {
    private void show1() {
        System.out.println("private");
    }
    void show2() {
        System.out.println("默认");
    }
    protected void show3() {
        System.out.println("protected");
    }
    public void show4() {
        System.out.println("public");
    }

    public static void main(String[] args) {
        //创建Fu对象，测试看有那些方法可以使用
        Fu f = new Fu();
        f.show1();
        f.show2();
        f.show3();
        f.show4();
    }
}
