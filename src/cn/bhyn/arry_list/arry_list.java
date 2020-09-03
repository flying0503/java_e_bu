package cn.bhyn.arry_list;

import java.util.ArrayList;

public class arry_list {                //集合，长度可变

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        System.out.println(list);       //显示内容，不显示地址
    }

}
