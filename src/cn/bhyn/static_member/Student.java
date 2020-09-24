package cn.bhyn.static_member;

public class Student {

    String name;
    int age;
    static String room;
    public static   String what_room()        //静态方法可以直接通过类调研
    {
        return room;
    }
}
