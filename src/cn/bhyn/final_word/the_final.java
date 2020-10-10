package cn.bhyn.final_word;
import cn.bhyn.animal.animal;
import cn.bhyn.animal.cat;
import cn.bhyn.animal.dog;
/*
*1 可以用来修饰一个类
*2 可以用来修饰一个方法
*3 修饰局部变量
*4 修饰成员变量
*
* */

/*
* 用final修饰一个类时，则这个类不能有子类
* 所以不能覆盖重写
* */

public final class the_final {
    void hs(){
        System.out.println("abcd");
    }
}
    class class_2{

    final int a = 1;    //手动赋值或通过构造方法赋值
    final void hs(){
       /*则此方法无法被重写*/
    }

    void hs_2(){
        final int NUM = 10; //变成常量
        //只能有一次赋值
        final int NUM_2;
        NUM_2 = 20;
    }

    void hs_3(){
        //对于应用类型来说则是地址值不可变
       final animal an = new cat();
        //an 的地址不可变
        //an = new dog();//错误写法
    }

}