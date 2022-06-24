package com.company;

public class Hero {
    private int hp = 0;
    private int damage = 0;
    private String superforce = "";

    public int getHp() {
        return hp;
    }

    public int getDamage() {
        return damage;
    }

    public String getSuperforce() {
        return superforce;
    }

    public Hero(int hp, int damage, String superforce) {
        this.hp = hp;
        this.damage = damage;
        this.superforce = superforce;
    }


    public Hero(int hp, int damage) {
        this.hp = hp;
        this.damage = damage;
    }

}


