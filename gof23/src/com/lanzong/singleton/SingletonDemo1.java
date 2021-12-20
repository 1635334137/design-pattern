package com.lanzong.singleton;

/**
 * 饿汉式单例模式
 */
public class SingletonDemo1 {

    //2.创建一个单例对象
    private static SingletonDemo1 instance = new SingletonDemo1();//类初始化时，立刻加载这个对象！

    //1.单例首先构造器要私有，防止类被new出一个对象
    private SingletonDemo1(){
    }

    //3.提供一个静态方法供其他对象能使用这个单例对象
    // （注：饿汉式这个方法不需要synchronized关键字，因为对象在类初始化时创建，而类初始化是天然线程安全的）
    public static SingletonDemo1 getInstance(){
        return instance;
    }
}
