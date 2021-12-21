package com.lanzong.struct.bridge;

//电脑类，让电脑类天生就具有品牌属性，后期可用可不用
public class Computer {
    private Brand brand;

    public Computer(Brand brand){
        this.brand = brand;
    }

    public void sale(){
        brand.sale();
    }
}
