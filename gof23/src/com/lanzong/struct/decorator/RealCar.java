package com.lanzong.struct.decorator;

//具体构件角色（真实对象）
public class RealCar implements ICar {
    @Override
    public void move() {
        System.out.println("陆地上跑的车");
    }
}
