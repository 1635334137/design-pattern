package com.lanzong.builder;

/**
 * 建造者模式：实现装配和构建的解耦
 * 一个复杂的成品，由多个组件组成，不同的装配和不同的构建都可能得到不一样的成品，实现了装配和构建的解耦，形成了多种组合方式的可能性，使程序更灵活
 *
 */
public class Client {
    public static void main(String[] args) {
        //建造者模式，当然是获取一个装配实例，并调用装配方法，传递的参数就是构建的具体实现类
        AirShipDirector airShipDirector = new LzAirShipDirector(new LzAirShipBuilder());
        AirShip airShip = airShipDirector.directorAirShip();
        System.out.println(airShip.toString());
    }
}
