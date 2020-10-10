package cn.bhyn.my_interface;
/*
* 标准形式
* 可以包含
* 1 常量
* 2 抽象方法
* 3 静态方法
* 4 默认方法
* 5 私有方法
*
* 接口是没有构造方法和静态代码块的
* 接口可以多重继承
* public class Myinterface implements interfaceA,interfaceB{}
*
* 父类优先于接口！！！
* */

public interface my_interface {

    /*
     * 抽象方法
     *
     * 注意：接口当中的抽象方法，修饰符必须是两个固定的关键字 ：public abstract
     * 甚至可以省略
     * */
    public abstract void methodAbs();   //抽象方法
    abstract void  methodAbs_2();       //也是抽象方法
    public  void  methodAbs_3();        //也是抽象方法
    void methodAbs_4();                 //也是抽象方法

    public default void methodAbs_5()   //default默认方法
    {
        System.out.println("默认方法");
    }

    public  static void methodAbs_6()   //静态方法
    {
        System.out.println("静态方法");
    }

    /*
    * 接口常量
    * 一旦使用final关键字修饰则不可改变
    * 注意不写关键字也是一样的
    * 接口中的常量必须赋值
    * 常量一般全大写
    * */
    public static final int NUM = 10;//常量

}




