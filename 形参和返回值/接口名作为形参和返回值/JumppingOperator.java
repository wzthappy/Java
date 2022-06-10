package Java.形参和返回值.接口名作为形参和返回值;

public class JumppingOperator {
    public void useJumpping(Jumpping j) {   // Jumpping  j = new Cat();
        j.jump();
    }
    public Jumpping getJumpping() {
        Jumpping j = new Cat();
        return j;
    }
}
