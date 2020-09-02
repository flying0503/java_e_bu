package cn.bhyn.intput;

import java.util.Scanner;

public class intput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//从键盘输入
        int a = sc.nextInt();
        System.out.println("a:"+a);
        int x = sc.nextInt(16); //输入的是16进制数 ，例如输入a，输出10
        System.out.println("x:"+x);
        String s = sc.next();        //获取字符串
        System.out.println("s:"+s);
        System.out.printf("a:%d",a); //c风格输出
    }
}
