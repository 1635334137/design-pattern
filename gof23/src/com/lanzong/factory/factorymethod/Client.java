package com.lanzong.factory.factorymethod;

/**
 * 工厂方法：符合开闭原则，当需要扩展时，创建新类来实现接口即可
 * 和简单工厂的区别：我认为是 简单工厂是让工厂类来完成各种实现类的创建，而工厂方法则更抽象一层，把工厂也抽象成为了接口，让实现该工厂接口的类去具体实现。
 */
public class Client {//调用者
    public static void main(String[] args) {
        Car car = new AdFactory().createCar();
        Car car2 = new BydFactory().createCar();
        car.run();
        car2.run();
    }
}
