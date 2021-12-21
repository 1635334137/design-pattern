package com.lanzong.struct.facade;

/**
 * 外观模式
 * 迪米特法则（最少知识原则）：一个软件实体应当尽可能少的与其他实体发生相互作用
 * 核心：为子系统提供统一的入口。封装子系统的复杂性，便于客户端调用
 * 本例子中，如果客户端自己去注册公司，则需要跟多个对象打交道，而通过外观模式改造，把具体封装起来，留出一个入口给客户端调用，方便客户端
 */
public class Client {
    public static void main(String[] args) {
        RegisterFacade register = new RegisterFacade();
        register.register();
    }
}
