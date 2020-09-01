package cn.bhyn.phone;

public class the_main {
    public static void main(String[] args) {
        phone ph1 = new phone();
        ph1.name = "HTC";
        ph1.price = 3000;
        ph1.setPass_word(1212);
        System.out.println("name is "+ph1.name);
        System.out.println("price is "+ph1.price);
        System.out.println("password is "+ph1.getPass_word());

        System.out.println("===========================");

        phone ph2 = new phone();    //shift+F6整体重新命名
        ph2.name = "小米";
        ph2.price = (float) 3999.8;
        ph2.setPass_word(334455);
        System.out.println("name is "+ph2.name);
        System.out.println("price is "+ph2.price);
        System.out.println("password is "+ph2.getPass_word());
    }
}
