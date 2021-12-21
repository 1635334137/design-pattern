package com.lanzong.struct.proxy.dynamic;

import java.lang.reflect.Proxy;

/**
 * 通过JDK自己的动态代理实现
 */
public class Client {
    public static void main(String[] args) {
        Star realStar = new RealStar();
        StarHandler handler = new StarHandler(realStar);

        //动态创建一个代理类
        Star proxy = (Star) Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(),new Class[]{Star.class},handler);
        //调用代理对象的方法
        proxy.sing();
    }
}
