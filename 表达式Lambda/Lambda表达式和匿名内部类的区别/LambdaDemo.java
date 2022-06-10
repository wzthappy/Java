package Java.表达式Lambda.Lambda表达式和匿名内部类的区别;
/*
    Lambda表达式和匿名内部类的区别
 */
public class LambdaDemo {
    public static void main(String[] args) {
        //匿名内部类
        useInter(new Inter() {
            @Override
            public void show1() {
                System.out.println("show1");
            }

            @Override
            public void show2() {
                System.out.println("show2");
            }
        });

        useAnimal(new Animal() {
            @Override
            public void method() {
                System.out.println("Java/抽象类");
            }
        });

        useStudent(new Student() {
            @Override
            public void study() {
                System.out.println("具体类");
            }
        });

        System.out.println("--------");
        //Lambda
//        useInter( () -> System.out.println("接口") );   //我在Inter加了一个抽象方法   报错

//        useAnimal( () -> System.out.println("抽象类") );  //报错

//        useStudent( () -> System.out.println("具体类") );  //报错
    }

    private static void useStudent(Student s) {
        s.study();
    }

    private static void useAnimal(Animal a) {
        a.method();
    }

    private static void useInter(Inter i) {
        i.show1();
    }
}