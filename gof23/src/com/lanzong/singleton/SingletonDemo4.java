package com.lanzong.singleton;

/**
 * 枚举方式实现单例模式
 * 防止反射机制的漏洞，其他几种无法防止
 */
public enum SingletonDemo4 {
    //枚举元素，本身就是单例对象
    INSTANCE;

    //添加自己需要的操作！
    public void singletonOperation(){

    }
}
