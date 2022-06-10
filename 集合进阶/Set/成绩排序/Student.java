package Java.集合进阶.Set.成绩排序;

public class Student implements Comparable<Student> {
    private String name;
    private int chinese;
    private int math;

    public Student(String ooo, int i) {
    }

    public Student(String name, int chinese, int math) {
        this.name = name;
        this.chinese = chinese;
        this.math = math;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getChinese() {
        return chinese;
    }

    public void setChinese(int chinese) {
        this.chinese = chinese;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public int getSum() {
        return this.chinese + this.math;
    }

    @Override
    public int compareTo(Student s) {
        int num = s.getSum() - this.getSum();
        int num2 = num == 0 ? s.chinese - this.chinese : num;
        int num3 = num2 == 0 ? s.name.compareTo(this.getName()) : num2;
        return num3;
    }
}
