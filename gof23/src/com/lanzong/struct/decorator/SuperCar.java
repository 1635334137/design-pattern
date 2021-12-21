package com.lanzong.struct.decorator;

//Decorator装饰角色，持有一个抽象构件的引用，接受客户端请求，并把请求转发给真实的对象
public class SuperCar implements ICar{

    protected ICar car;

    public SuperCar(ICar car){
        this.car = car;
    }

    @Override
    public void move() {
        car.move();
    }
}
