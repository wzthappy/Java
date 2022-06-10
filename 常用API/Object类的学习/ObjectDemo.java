package Java.常用API.Object类的学习;

/*
 * Object 是类层次结构的根，每个类都可以将 Object 作为超类。所有类都直接或者间接的继承自该类
 *
 * 看方法的源码，选中方法，按下Ctrl + B
 *
 *        建议所有子类重写此方法  toString()      自动生成即可alt + insert   //   toString
 * */
public class ObjectDemo {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("卡卡");
        s.setAge(19);
        System.out.println(s);   //     常用API.Object类的学习.Student@1b6d3586
        System.out.println(s.toString());           //  println.(Object x)

        /*

            public void println(Object x) {     //  Object x = s = new Student();
            String s = String.valueOf(x);       //  x = s;
            synchronized (this) {
                print(s);
                 newLine();
                }
            }

          public static String valueOf(Object obj) {    //  obj = x
            return (obj == null) ? "null" : obj.toString();
          }

            public String toString() {
            return getClass().getName() + "@" + Integer.toHexString(hashCode());
           }
         */
    }
}
