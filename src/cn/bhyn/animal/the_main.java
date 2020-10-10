package cn.bhyn.animal;

public class the_main {
    public static void main(String[] args) {
        animal an = new cat();      //向上转型
        an.eat();

        cat my_cat = (cat) an;      //向下还原
        my_cat.catch_mouse();

        //dog my_dog = (dog) an; 错误写法，错误还原

        animal an2 = new dog();
        an2.eat();
        dog my_dog = (dog) an2;
        my_dog.watch_house();

        /*
        * 安全向下转型
        * instanceof
        * */
        if(an instanceof dog)
        {
            dog my_dog2 = (dog) an;
            my_dog2.watch_house();
        }
    }
}
