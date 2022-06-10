package Java.面向对象.构造方法;

/*
* 学生类
*   构造方法：
*       作用：创建对象
*       功能：完成对象数据的初始化
*   格式；
*       修饰符 类名() {
*
*       }
*
*    修饰符一般用:public   //公开
 */
public class Student04 {
    private String name;     // private  私有
    private int age;

//     构造方法：
//       public 构造方法.Student04() {
//           System.out.println("无参构造方法");
//       }
    public Student04() {

    }

       public Student04(String name) {
            this.name = name;
       }

       public Student04(int age) {
            this.age = age;
       }

       public Student04(String name,int age) {
            this.name = name;
            this.age = age;
       }
    //show()方法
    public void show() {
        System.out.println(name + ", " + age);
    }
}
