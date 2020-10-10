package cn.bhyn.game;

public class Demo {


    public static void main(String[] args) {
        Hero my_hero = new Hero();
        my_hero.setLeave(10);
        my_hero.setName("巫妖王");
        my_hero.setWeapon(new Weapon(1,"霜之哀伤"));

        Hero emm_hero = new Hero("伊利丹",9,new Weapon(2,"埃辛诺斯战刃"));

        my_hero.attack(emm_hero);
        emm_hero.attack(my_hero);
    }
}
