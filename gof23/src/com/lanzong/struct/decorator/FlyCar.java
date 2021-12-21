package com.lanzong.struct.decorator;

//具体装饰角色，负责给构件添加新的功能
public class FlyCar extends SuperCar{

    public FlyCar(ICar car) {
        super(car);
    }

    public void fly(){
        System.out.println("会飞");
    }

    @Override
    public void move() {
        super.move();
        fly();
    }
}
