package com.lanzong.factory.factorymethod;

public class AdFactory implements CarFactory{
    @Override
    public Car createCar() {
        return new Ad();
    }
}
