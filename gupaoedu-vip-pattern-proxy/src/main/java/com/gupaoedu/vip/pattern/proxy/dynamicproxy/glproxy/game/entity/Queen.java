package com.gupaoedu.vip.pattern.proxy.dynamicproxy.glproxy.game.entity;

public class Queen extends Character {
    @Override
    public void fight() {
        System.out.print("皇后" );
        weapon.userWeapon();
    }
}
