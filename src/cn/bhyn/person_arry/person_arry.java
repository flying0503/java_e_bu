package cn.bhyn.person_arry;
import cn.bhyn.person.person;
public class person_arry {


    public static void main(String[] args) {
        person[] person_greap = new person[3];  //只有地址值
        person_greap[0] = new person("邓宸");
        person_greap[1] = new person("陈文军");
        person_greap[2] = new person("迪丽热巴");

        for (int i = 0; i < 2; i++) {
            person_greap[i].sayHello(person_greap[i+1].getName());
        }
    }
}
