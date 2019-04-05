package com.gupaoedu.vip.pattern.proxy.dynamicproxy.glproxy.game.service.impl;

import com.gupaoedu.vip.pattern.proxy.dynamicproxy.glproxy.game.service.WeaponBehavior;

public class SwordBeahavior implements WeaponBehavior {
    @Override
    public void userWeapon() {
        System.out.println("使用宝剑战斗");
    }
}
