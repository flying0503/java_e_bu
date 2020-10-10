package cn.bhyn.animal;

public class dog extends animal {
    @Override
    public void eat() {
        System.out.println("狗吃肉");
    }

    public void watch_house()
    {
        System.out.println("狗看家");
    }
}
