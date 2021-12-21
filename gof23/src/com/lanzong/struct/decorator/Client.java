package com.lanzong.struct.decorator;

/**
 * 装饰器模式：动态的为一个对象增加新的功能
 * 一种用于代替继承的技术，无需通过继承增加子类就能扩展对象的新功能，同时避免类型体系的快速膨胀
 */
public class Client {
    public static void main(String[] args) {
        //最原始的真实角色使用
        ICar car = new RealCar();
        car.move();

        //装饰了一个功能的真实角色
        FlyCar flyCar = new FlyCar(car);
        flyCar.move();

        //装饰了另一个功能的真实角色
        AICar aiCar = new AICar(car);
        aiCar.move();

        //组合使用了两种功能的真实角色
        AICar nbcar = new AICar(new FlyCar(car));
        nbcar.move();
    }
}
