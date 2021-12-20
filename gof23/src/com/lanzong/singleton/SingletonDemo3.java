package com.lanzong.singleton;

/**
 * 静态内部类实现单例模式
 * 线程安全，且延时加载
 */
public class SingletonDemo3 {

    private static class SingletonClassInstance{
        private final static SingletonDemo3 instance = new SingletonDemo3();
    }

    private SingletonDemo3(){}

    //方法没有同步，调用效率高！
    public static SingletonDemo3 getInstance(){
        return SingletonClassInstance.instance;
    }
}
