package cn.bhyn.Student;
//import cn.bhyn.Student.Student; 同一个包下可以省略

public class the_main {
    public static void main(String[] args) {
        Student nm1 = new Student();
        nm1.age = 10;
        nm1.name = "Tom";
        nm1.ID = 01;
        Student nm2 = new Student();
        nm2.ID = 02;
        nm2.name = "Jary";
        nm2.age =9;

        nm1.name_is();
        nm1.ags_is();
        nm1.ID_is();

        nm2.name_is();
        nm2.ags_is();
        nm2.ID_is();
    }
}
