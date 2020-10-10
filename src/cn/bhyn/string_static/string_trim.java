package cn.bhyn.string_static;

public class string_trim {
    public static void main(String[] args) {
        String str = "   Java   class    ";
        System.out.println(str);
        System.out.println("源字符串长度："+str.length());

        String str2 = str.trim();
        System.out.println(str2);
        System.out.println("去掉前后空格后的字符串长度："+str2.length());
    }
}
