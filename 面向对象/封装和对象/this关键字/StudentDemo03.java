package Java.面向对象.封装和对象.this关键字;

/*
* 学生测试类
* */
public class StudentDemo03 {
    public static void main(String[] args) {
        //创建对象
        Student03 s = new Student03();

        //使用set方法给成员变量赋值
        s.setName("卡卡");
        s.setAge(19);
        //调用show方法
        s.show();

    }
}
