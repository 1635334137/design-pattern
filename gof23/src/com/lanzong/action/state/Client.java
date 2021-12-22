package com.lanzong.action.state;

/**
 * 核心：用于解决系统中复杂对象的 【状态转换】 以及 【不同状态下行为】 的封装问题
 * 结构：
 * Context环境类：维护一个State对象，定义当前的状态
 * State抽象状态类
 * ConcreteState具体状态类：每个类封装了一个状态对应的行为
 */
public class Client {
    public static void main(String[] args) {
        HomeContext ctx = new HomeContext();

        //修改状态
        ctx.setState(new FreeState());
        ctx.setState(new BookedState());
    }
}
