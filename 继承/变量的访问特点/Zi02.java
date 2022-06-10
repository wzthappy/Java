package Java.继承.变量的访问特点;

public class Zi02 extends Fu02 {
    //身高
    public int height = 175;
    //年龄
//    public int age = 20;  // 2
    public void show() {
//        int age = 30;  // 3
        System.out.println(age);
        System.out.println(height);

//        System.out.println(weight);  // 报错
    }
}
