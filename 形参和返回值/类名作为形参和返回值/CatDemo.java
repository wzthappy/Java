package Java.形参和返回值.类名作为形参和返回值;
/*
* 测试类
* */
public class CatDemo {
    public static void main(String[] args) {
        //创建操作类对象，并调用方法
        CatOperator co = new CatOperator();
        Cat c = new Cat();
        co.useCat(c);

        Cat c2 = co.getCat();  // co.getCat() = new Cat()    Cat c2 = new Cat()
        c2.eat();
    }
}
