package com.lanzong.builder;

/**
 * 实现了构建接口的具体构建实现类（构建方式使用工厂方法或者抽象工厂实现，完成和建造者模式的组合使用）
 */
public class LzAirShipBuilder implements AirShipBuilder{
    @Override
    public Engine builderEngine() {
        return new Engine("金江牌发动机");
    }

    @Override
    public EscapeTower builderEscapeTower() {
        return new EscapeTower("金江牌逃逸塔");
    }

    @Override
    public OrbitalModule builderOrbitalModule() {
        return new OrbitalModule("金江牌轨道舱");
    }
}
