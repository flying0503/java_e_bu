package cn.bhyn.static_member;


/*
* 静态代码块：
* 特点：当第一次用到本类时，静态代码块执行唯一的一次
*
*
* */

public class static_block {

    static {
        System.out.println("静态代码块执行");
    }
    public  static_block(){
        System.out.println("构造方法执行");
    }
}
