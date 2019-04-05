package com.gupaoedu.vip.pattern.proxy.dynamicproxy.glproxy.game.entity;

public class Knight extends Character {
    @Override
    public void fight() {
        System.out.print("骑士" );
        weapon.userWeapon();
    }
}
