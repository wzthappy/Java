package Java.面向对象.封装和对象.private关键字;

/*
 * 学生测试类
 * */
public class StudentDemo02 {
    public static void main(String[] args) {
        //创建对象
        Student02 s = new Student02();

        //使用set方法给成员变量赋值
        s.setName("卡卡");
        s.setAge(19);
        s.show();

        //使用get方法获取成员变量的值
        System.out.println(s.getName() + "____" + s.getAge());
    }
}
