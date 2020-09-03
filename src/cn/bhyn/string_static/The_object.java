package cn.bhyn.string_static;

public class The_object {
/*
* String::equals(Object obj)  可以传入任何对象,内容比较
*
* */


    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "abc";
        char[] charArry = {'a','b','c'};
        String str3 = new String(charArry);     //str3地址值与str1，str2不同，str3的地址是charArry的地址

        String str4 = str1+str2;                //字符串没变，地址改变。详见字符串池
        System.out.println(str4);
        str4 = str4.substring(2,6);             //截取字符串


        System.out.println(str1.equals(str2));  //内容比较
        System.out.println(str1.equals(str3));
        System.out.println(str2.equals(str3));
        System.out.println("abc".equals(str1));
        System.out.println(str4);
        str1 = str1.replace("a","*");   //替换
        System.out.println(str1);
        String str5 = "das,111,22,555,66,";

        String[] str_arry = str5.split(",");        //切分 不能用 "."作为条件一定要用用"\\."
        for (int i = 0; i<str_arry.length; i++ ) {
            System.out.println(str_arry[i]);
        }

    }
}
