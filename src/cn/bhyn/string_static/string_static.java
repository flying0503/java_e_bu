package cn.bhyn.string_static;

/*
* 对于基本型来说, ==是进行数值比较。
* 对于应用类型来说，==是进行地址值比较
*
*
* */


public class string_static {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "abc";

        char[] charArry = {'a','b','c'};
        String str3 = new String(charArry); //str3地址值与str1，str2不同，str3的地址是charArry的地址

        System.out.println(str1 == str2);
        System.out.println(str2 == str3);
        System.out.println(str1 == str3);
    }
}
