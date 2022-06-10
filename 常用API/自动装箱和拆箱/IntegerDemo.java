package Java.常用API.自动装箱和拆箱;
/*
* 装箱：把基本数据类型转换为对应的包装类类型
* 拆箱：把包装类类型转换为对应的基本数据类型
* */
public class IntegerDemo {
    public static void main(String[] args) {
        //装箱：把基本数据类型转换为对应的包装类类型
        Integer i = Integer.valueOf(100);  //装箱

        Integer ii = 100;    //自动装箱  Integer.valueOf(100);

        //拆箱：把包装类类型转换为对应的基本数据类型
        //ii += 200;
//        ii = ii.intValue() + 200;  //拆箱
        ii += 200;    //自动拆箱  // ii.intValue()
        System.out.println(ii);

        Integer iii = null;
        if (iii != null) {
            iii += 300;  //NullPointerException  //null    iii.intValue()
        }
    }
}
