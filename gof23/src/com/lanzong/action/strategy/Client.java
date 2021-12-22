package com.lanzong.action.strategy;

/**
 * 策略模式：分离算法，选择实现
 */
public class Client {
    public static void main(String[] args) {
        Strategy strategy = new Aplan();
        Context context = new Context(strategy);
        context.pringPrice(100);
    }
}
