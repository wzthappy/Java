package Java.继承.学生和老师;

public class Teacher extends Person {
    public Teacher()  {}
    public Teacher(String name,int age) {
//        this.name = name;
//        this.age = age;  //  错误
        super(name,age);
    }

    public void teach() {
        System.out.println("用爱成就每一位学员");
    }




    //1
//    private String name;
//    private int age;
//
//    public 继承.学生和老师.Teacher() {
//    }
//
//    public 继承.学生和老师.Teacher(String name, int age) {
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
//    public void teach() {
//        System.out.println("用爱成就每一位学员");
//    }
}
