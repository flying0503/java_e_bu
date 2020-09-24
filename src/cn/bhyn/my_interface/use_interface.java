package cn.bhyn.my_interface;
/*使用接口需要继承
  继承的实现类必须重写所有的接口
  创建实现类对象
*/
public class use_interface implements my_interface {

    @Override   //重写
    public void methodAbs() {
        System.out.println("first");
    }

    @Override
    public void methodAbs_2() {
        System.out.println("sacend");
    }

    @Override
    public void methodAbs_3() {
        System.out.println("third");
    }

    @Override
    public void methodAbs_4() {
        System.out.println("fourth");
    }
}
