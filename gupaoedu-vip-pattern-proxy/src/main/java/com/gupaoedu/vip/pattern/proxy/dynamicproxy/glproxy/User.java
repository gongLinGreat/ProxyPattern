package com.gupaoedu.vip.pattern.proxy.dynamicproxy.glproxy;

/**
 * 用户
 */
public class User implements Job{

    @Override
    public void findJob(){
        System.out.println("找一个满意的工作。");
    }
}
