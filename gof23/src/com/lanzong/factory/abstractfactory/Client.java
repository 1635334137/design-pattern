package com.lanzong.factory.abstractfactory;

/**
 * 抽象工厂其实和工厂方法没什么区别，只是应对的场景不同，抽象工厂是产品族的解决方案
 */
public class Client {
    public static void main(String[] args) {
        CarFactory carFactory = new LuxuryCarFactory();
        Engine engine = carFactory.createEngine();
        engine.run();
        engine.start();
        Seat seat = carFactory.createSeat();
        seat.message();
        Tyre tyre = carFactory.createTyre();
        tyre.revolve();
    }
}
