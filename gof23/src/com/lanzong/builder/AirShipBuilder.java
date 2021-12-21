package com.lanzong.builder;
//飞船构建接口
public interface AirShipBuilder {
    Engine builderEngine();
    EscapeTower builderEscapeTower();
    OrbitalModule builderOrbitalModule();
}
