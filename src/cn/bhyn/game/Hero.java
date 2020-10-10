package cn.bhyn.game;

public class Hero {
    private String name;
    private int leave;
    private Weapon weapon;

    public Hero() {
    }

    public Hero(String name, int leave, Weapon weapon) {
        this.name = name;
        this.leave = leave;
        this.weapon = weapon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLeave() {
        return leave;
    }

    public void setLeave(int leave) {
        this.leave = leave;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public void attack(Hero emm_hero){
        System.out.println("级别为"+leave+"的"+name+"正在用"+weapon.getName()+"攻击"+emm_hero.getName());
    }
}
