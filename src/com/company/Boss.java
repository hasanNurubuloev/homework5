package com.company;

import java.util.Random;

public class Boss {
    int health ;
    int damage ;
    int defence;
    public Boss() {}
    public Boss(int health, int damage, int defence ){
        this.health = health ;
        this.damage = damage ;
        this.defence = defence ;

    }



    public void setHealth(int health) {
        this.health = health;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public void setDefence(int defence) {
        this.defence = defence;
    }



    public int getHealth() {
        return health;
    }

    public int getDamage() {
        return damage;
    }

    public int getDefence() {
        return defence;
    }
    public void   genarateBossDefenceType() {
        Random r = new Random();
        int randomNumber = r.nextInt(40) + 1;}


}
