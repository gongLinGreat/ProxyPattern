package com.gupaoedu.vip.pattern.proxy.dynamicproxy.glproxy.game.entity;

import com.gupaoedu.vip.pattern.proxy.dynamicproxy.glproxy.game.service.WeaponBehavior;

/**
 * 角色
 */
public abstract class Character {
    WeaponBehavior weapon;
    abstract void fight();

    public void setWeapon(WeaponBehavior weapon) {
        this.weapon = weapon;
    }

}
