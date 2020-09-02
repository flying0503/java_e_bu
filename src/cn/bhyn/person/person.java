package cn.bhyn.person;

public class person {
    String name;

    public person(){            //空构造方法，系统赠送默认构造方法

    }

    public person(String name)  //构造方法，一旦有一个则不再赠送
    {
        this.name = name;       //局部变量函数与公共变量或函数重名的时使用this调用公共变量或函数
    }

    public void sayHello(String name)
    {
        System.out.println(name+"你好，我是"+this.name); //局部变量函数与公共变量或函数重名的时使用this调用公共变量或函数
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
}
