package cn.bhyn.Anonymous;
import cn.bhyn.person.person;

import java.util.Scanner;

public class Anonymous {
    public static void main(String[] args) {
        person one = new person("dc");
        one.sayHello("nbz");

        new person("nbz").sayHello("dc");   //匿名对象，只能用一次

        System.out.println(methodParam(new Scanner(System.in)));           //匿名对象传参,匿名传入，传出
    }

    public static String methodParam(Scanner sc)
    {
        return new String(sc.next());               //匿名返回
    }
}
