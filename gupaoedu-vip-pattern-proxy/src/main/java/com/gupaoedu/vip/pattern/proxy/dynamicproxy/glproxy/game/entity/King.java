package com.gupaoedu.vip.pattern.proxy.dynamicproxy.glproxy.game.entity;

public class King extends Character {
    @Override
    public void fight() {
        System.out.print("国王" );
        super.weapon.userWeapon();
    }
}
