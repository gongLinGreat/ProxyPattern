package com.gupaoedu.vip.pattern.proxy.dynamicproxy.glproxy.game;

import com.gupaoedu.vip.pattern.proxy.dynamicproxy.glproxy.game.entity.King;
import com.gupaoedu.vip.pattern.proxy.dynamicproxy.glproxy.game.entity.Knight;
import com.gupaoedu.vip.pattern.proxy.dynamicproxy.glproxy.game.entity.Queen;
import com.gupaoedu.vip.pattern.proxy.dynamicproxy.glproxy.game.entity.Troll;
import com.gupaoedu.vip.pattern.proxy.dynamicproxy.glproxy.game.service.impl.AxeBeahavior;
import com.gupaoedu.vip.pattern.proxy.dynamicproxy.glproxy.game.service.impl.BowAndArrowBeahavior;
import com.gupaoedu.vip.pattern.proxy.dynamicproxy.glproxy.game.service.impl.KnifeBeahavior;
import com.gupaoedu.vip.pattern.proxy.dynamicproxy.glproxy.game.service.impl.SwordBeahavior;

public class FightBeaviorTest {
    public static void main(String[] args) {
        King king = new King();
        Queen queen = new Queen();
        Knight knight = new Knight();
        Troll troll = new Troll();
        king.setWeapon(new KnifeBeahavior());
        king.fight();
        queen.setWeapon(new SwordBeahavior());
        queen.fight();
        knight.setWeapon(new BowAndArrowBeahavior());
        knight.fight();
        troll.setWeapon(new AxeBeahavior());
        troll.fight();


    }
}
