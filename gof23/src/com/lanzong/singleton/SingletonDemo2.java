package com.lanzong.singleton;

/**
 * 懒汉式单例模式
 */
public class SingletonDemo2 {

    private static SingletonDemo2 instance = null;

    //1.单例首先构造器要私有，防止类被new出一个对象
    private SingletonDemo2(){}

    //因为不是在类初始化时创建，而是在调用方法时创建，所以需要添加synchronized
    public static synchronized SingletonDemo2 getInstance(){
        if (instance == null){
            instance = new SingletonDemo2();
        }
        return instance;
    }
}
