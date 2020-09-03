package cn.bhyn.arry_list;

import java.util.ArrayList;

public class arry_method {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("aaa");               //添加
        list.add("bbb");
        list.add("ccc");
        System.out.println(list);
        int a =list.size();                   //长度
        System.out.println(a);
        String str0 = list.get(0);    //访问

        list.remove(1);         //删除

        a =list.size();                   //长度

        System.out.println(str0);
        System.out.println(list);
        System.out.println(a);

        ArrayList<Integer> Ilist = new ArrayList<>();       //包装类
        ArrayList<Character> Clist   = new ArrayList<>();    //包装类
        ArrayList<Double> Dlist = new ArrayList<>();
        ArrayList<Float>  Flist = new ArrayList<>();

        Ilist.add(123);                                 //自动拆箱
        Clist.add('a');
        Dlist.add(3.14158);
        Flist.add((float)9.0);

        int i = Ilist.get(0);                   //自动拆箱
    }
}
