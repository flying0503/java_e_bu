package cn.bhyn.static_member;

public class static_member {

    int ooo = 0;
    public static void main(String[] args) {
        Student one = new Student();
        one.name = "郭靖";
        one.age = 19;

        Student two = new Student();
        two.name = "黄蓉";
        two.age = 16;

        one.room = "101";

        System.out.println("one neam:"+one.name+",one age:"+one.age+",room:"+one.room);
        System.out.println("one neam:"+two.name+",one age:"+two.age+",room:"+two.room);

        String a = Student.what_room();     //通过类调用静态函数
        System.out.println("roow:"+a);

        //静态方法不能直接访问非静态。
        //System.out.println(ooo);

        //栈地址，堆对象。


        static_block sb = new static_block();
        static_block sb2 = new static_block();  //第二次不执行。
        //用途：用来给静态成员赋值。
    }
}
