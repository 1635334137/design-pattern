package com.lanzong.action.strategy;

/**
 * 负责和具体的策略类交互
 * 这个类的作用：把算法类和客户端彻底分离，让客户端调用更加简洁
 */
public class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void pringPrice(int price){
        strategy.getPrice(price);
    }
}
