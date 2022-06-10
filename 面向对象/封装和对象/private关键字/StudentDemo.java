package Java.面向对象.封装和对象.private关键字;

/*
 *    单个对象
 * 学生测试类
 * */
public class StudentDemo {
    public static void main(String[] args) {
        //创建对象
        Student s = new Student();
        //输出地址值
        System.out.println(s);

        //使用对象
        //1,调用成员变量
        System.out.println(s.name + ", " + s.age);  // 姓名(name)  // 年龄(age)
        //赋值
        s.name = "卡卡";
        s.age = 19;
        System.out.println(s.name + ", " + s.age);

        //2，调用成员方法
        s.study();
        s.doHomework();

        //年龄2(ag)  保护的
//        s.setAg(-30);
        s.setAg(30);
        //调用show方法
        s.show();

    }
}
