package Java.常用API.Object类的常用方法;
/*
* 测试类
* public boolean equals(Object obj);  指示一些其他对象是否等于此
* */
public class ObjectDemo {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("卡卡");
        s1.setAge(19);

        Student s2 = new Student();
        s2.setName("卡卡");
        s2.setAge(19);

        //需求：比较两个对象的内容是否相同           //  Student s1
        System.out.println(s1 == s2);    // 他比的是地址值    false

        System.out.println(s1.equals(s2));   //他比的还是地址 false，  重写了equals()方法就可以了 alt+insert  true
        /*                     向上转型
           public boolean equals(Object obj) {
                //this ----  s1
                //obj -----  s2
            return (this == obj);
            }
         */


    }
}
