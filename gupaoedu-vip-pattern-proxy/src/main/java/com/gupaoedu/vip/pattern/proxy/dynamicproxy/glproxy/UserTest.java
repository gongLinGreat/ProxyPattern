package com.gupaoedu.vip.pattern.proxy.dynamicproxy.glproxy;

import java.lang.reflect.Method;

public class UserTest {
    public static void main(String[] args) {
        try {
            Object obj = new Intermediary().getInstance(new User());
            Method method = obj.getClass().getMethod("findJob",null);
            method.invoke(obj,args);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
