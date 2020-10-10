package cn.bhyn.equals_way;

import cn.bhyn.person.person;

public class equals_way {


    public static void main(String[] args) {
        /*equals()用于比较对象是否相等*/
        person p1 = new person("邓宸",27);
        person p2 = new person("张海祥",28);

        System.out.println( "比较对象："+p1.equals(p2));
    }
}
