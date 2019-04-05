package com.gupaoedu.vip.pattern.proxy.dynamicproxy.glproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 中介
 */
public class Intermediary implements InvocationHandler {
    private Object target;
    public Object getInstance(Object target) throws Exception{
        this.target = target;
        Class<?> clazz = target.getClass();
        return Proxy.newProxyInstance(clazz.getClassLoader(),clazz.getInterfaces(),this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        Object object = method.invoke(this.target,args);
        after();
        return null;

    }

    private void after() {
        System.out.println("双方满意，开始上班。");
    }

    private void before() {
        System.out.println("收到个人信息，开始匹配合适的公司。");
    }

}
