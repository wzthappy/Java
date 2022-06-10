package Java.方法引用.引用类方法;
/*
    练习:
        1，定义一个接口(Converter)，里面定义一个抽象方法:
            int convert(String s);
        2，定义一个测试类(ConverterDemo)，在测试类中提供两个方法:
            一个方法是: useConverter(Converter c);
            一个方法是主方法，在主方法中调用useConverter方法
 */
public class ConverterDemo {
    public static void main(String[] args) {
        //在主方法中调用useConverter方法
//        useConverter( (String s) -> {
//            return Integer.parseInt(s);
//        } );
        useConverter(s -> Integer.parseInt(s));

        //引用类方法               s ↓
        useConverter(Integer::parseInt);

        //Lambda表达式被类方法替代的时候，它的 形式参数 全部传递给 静态方法作为参数
    }

    private static void useConverter(Converter c) {
        int number = c.convert("666");
        System.out.println(number);
    }
}
