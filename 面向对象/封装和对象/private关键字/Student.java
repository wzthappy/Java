package Java.面向对象.封装和对象.private关键字;

/*
 * 学生类
 * */
public class Student {
    //成员变量
    String name; // 姓名(name)
    int age;  // 年龄(age)

    private int ag; //年龄2(ag)  保护的

    //提供get/set方法
    public void  setAg(int a){
//        ag = a;
        if (a < 0 || a > 120) {
            System.out.println("你给的年龄有误");
        } else {
            ag = a;
        }
    }

    public int getAg() {
        return ag;
    }

    public void show() {
        System.out.println(name + " ," + ag);
    }


    //成员方法
    public void study() {   // 学习
        System.out.println("好好学习，天天向上");
    }

    public void doHomework() {   //做作业
        System.out.println("键盘敲烂，月薪过万");
    }

}
