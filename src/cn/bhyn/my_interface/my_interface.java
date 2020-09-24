package cn.bhyn.my_interface;
/*
* 标准形式
* 可以包含
* 1 常量
* 2 抽象方法
* 3 静态方法
* 4 默认方法
* 5 私有方法
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

    public default void methodAbs_5()   //默认方法
    {
        System.out.println("默认方法");
    }


}




