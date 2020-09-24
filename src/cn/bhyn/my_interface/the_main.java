package cn.bhyn.my_interface;

public class the_main {
    public static void main(String[] args) {
        //不能直接new接口
        use_interface usinter = new use_interface();
        usinter.methodAbs();
        usinter.methodAbs_2();
        usinter.methodAbs_3();
        usinter.methodAbs_4();
        usinter.methodAbs_5();      //调用默认方法
    }
}
