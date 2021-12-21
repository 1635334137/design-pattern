package com.lanzong.struct.decorator;

//具体装饰角色，负责给构件添加新的功能
public class AICar extends SuperCar{

    public AICar(ICar car) {
        super(car);
    }

    public void autoMove(){
        System.out.println("自动驾驶");
    }

    @Override
    public void move() {
        super.move();
        autoMove();
    }
}
