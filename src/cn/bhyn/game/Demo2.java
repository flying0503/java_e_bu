package cn.bhyn.game;

import java.util.ArrayList;


public class Demo2 {
    public static void main(String[] args) {
        ArrayList<Hero> heroList = new ArrayList<Hero>();
        heroList.add(new Hero("巫妖王",10,new Weapon(1,"霜之哀伤")));
        heroList.add(new Hero("伊利丹",9,new Weapon(2,"埃辛诺斯战刃")));
        heroList.get(0).attack(heroList.get(1));
        heroList.get(1).attack(heroList.get(0));
        }
    }
