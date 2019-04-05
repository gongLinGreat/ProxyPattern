package com.gupaoedu.vip.pattern.proxy.dynamicproxy.glproxy.game.entity;

public class Troll extends Character {
    @Override
    public void fight() {
        System.out.print("山精");
        weapon.userWeapon();
    }
}
