package com.company;

public class boss {
    private int hp=0;
    private int damage=0;
    private String bossDefend="";

    public boss(int hp, int damage,String bossDefend) {
        this.hp = hp;
        this.damage = damage;
        this.bossDefend = bossDefend;
    }
    public void calling(){
        System.out.println("health of boss  "+ this.hp);
        System.out.println("damage of boss  "+ this.damage);
        System.out.println("type of his atack  "+this.bossDefend);
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public String getBossDefend() {
        return bossDefend;
    }

    public void setBossDefend(String bossDefend) {
        this.bossDefend = bossDefend;
    }
}
