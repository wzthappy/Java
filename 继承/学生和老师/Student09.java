package Java.继承.学生和老师;

public class Student09 extends Person {
    public Student09() {}
    public Student09(String name,int age){
        super(name,age);
    }
    public void study() {
        System.out.println("好好学习,天天向上");
    }








    //1,
//    private String name;
//    private int age;
//
//    public 继承.学生和老师.Student09() {
//    }
//
//    public 继承.学生和老师.Student09(String name, int age) {
//        this.name = name;
//        this.age = age;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//
//    public void study() {
//        System.out.println("好好学习,天天向上");
//    }
}
