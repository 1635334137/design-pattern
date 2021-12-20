package com.lanzong.factory.simplefactory;

/**
 * 简单工厂（静态工厂）
 * 工厂模式：把调用者和创建者分离。
 * 没有工厂模式的情况下：调用者需要知道接口及实现类，并且因为每个实现类的不同而要清楚的知道每个实现类是如何创建的
 * 有工厂模式的情况下：分工明确，调用者只需要知道接口和工厂类，并去调用即可，而创建实现类的细节由工厂去做。
 */
public class Client {//调用者
    public static void main(String[] args) {
        Car car = CarFactory.createCar("奥迪");
        Car car2 = CarFactory.createCar("比亚迪");
        car.run();
        car2.run();
    }
}
