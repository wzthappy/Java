package Java.形参和返回值.类名作为形参和返回值;

public class CatOperator {
    public void useCat(Cat c) { // Cat c = new Cat();   类名作为形参
        c.eat();
    }

    public Cat getCat() {     //类名作为返回值
        Cat c = new Cat();
        return c;
    }
}
