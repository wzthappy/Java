package Java.继承.学生和老师;

/*
 * 测试类
 * */
public class PersonDemo {
    public static void main(String[] args) {
        //创建老师类对象进行测试
        Teacher t1 = new Teacher();
        t1.setName("晓晓");
        t1.setAge(30);
        System.out.println(t1.getName() + ", " + t1.getAge());
        t1.teach();

        Teacher t2 = new Teacher("卡卡",29);
        System.out.println(t2.getName() + ", " + t2.getAge());
        t2.teach();
        System.out.println("----------");
        //创建学生类对象进行测试
        Student09 s1 = new Student09();
        s1.setName("好大儿");
        s1.setAge(20);
        System.out.println(s1.getName() + ", " + s1.getAge());
        s1.study();

        Student09 s2 = new Student09("水水",19);
        System.out.println(s2.getName() + ", " + s2.getAge());
        s2.study();




        //1
//        //创建老师类对象进行测试
//        继承.学生和老师.Teacher t1 = new 继承.学生和老师.Teacher();
//        t1.setName("晓晓");
//        t1.setAge(30);
//        System.out.println(t1.getName() + ", " + t1.getAge());
//        t1.teach();
//
//        继承.学生和老师.Teacher t2 = new 继承.学生和老师.Teacher("卡卡", 31);
//        System.out.println(t2.getName() + ", " + t2.getAge());
//        t2.teach();
    }
}
