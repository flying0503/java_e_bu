package cn.bhyn.person;

public class person_run {


    public static void main(String[] args) {
        person wjl = new person();
        person dc = new person();

        wjl.name = "王健林";
        dc.name = "邓宸" ;

        dc.sayHello(wjl.name);
        wjl.sayHello(dc.name);

        person nbz = new person("聂宝珍",28);
        person cwj = new person("陈文军",22);

        nbz.sayHello(dc.name);
        dc.sayHello(cwj.name);
    }

}
