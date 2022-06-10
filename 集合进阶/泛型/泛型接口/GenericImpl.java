package Java.集合进阶.泛型.泛型接口;

public class GenericImpl<T> implements Generic<T> {

    @Override
    public void show(T t) {
        System.out.println(t);
    }
}
