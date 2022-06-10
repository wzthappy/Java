package Java.面向对象.构造方法;

/*
 * 创建对象并为其成员变量赋值的两种方法
 *   1，无参构造方法创建对象后使用setXxx()赋值
 *   2，使用带参构造方法直接创建带有属性值的对象
 * */
public class StudentDemo05 {
    public static void main(String[] args) {
        // 1，无参构造方法创建对象后使用setXxx()赋值
        Student05 s1 = new Student05();
        s1.setName("卡卡");
        s1.setAge(19);
        s1.show();
        //2，使用带参构造方法直接创建带有属性值的对象
        Student05 s2 = new Student05("卡卡",30);
        s2.show();
    }
}
