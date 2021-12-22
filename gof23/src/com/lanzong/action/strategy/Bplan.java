package com.lanzong.action.strategy;

//B策略
public class Bplan implements Strategy{
    @Override
    public void getPrice(int price) {
        System.out.println("打五折");
    }
}
