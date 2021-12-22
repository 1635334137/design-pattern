package com.lanzong.action.strategy;

//A策略
public class Aplan implements Strategy{
    @Override
    public void getPrice(int price) {
        System.out.println("打八折");
    }
}
