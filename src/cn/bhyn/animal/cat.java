package cn.bhyn.animal;

public class cat extends animal {
    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }

    public void catch_mouse()
    {
        System.out.println("猫抓老鼠");
    }
}
