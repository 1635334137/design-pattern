package com.lanzong.builder;

/**
 * 实现了装配接口的具体装配实现类
 */
public class LzAirShipDirector implements AirShipDirector{

    //传递一个构建类供装配时使用
    public AirShipBuilder airShipBuilder;

    public LzAirShipDirector(AirShipBuilder airShipBuilder){
        this.airShipBuilder = airShipBuilder;
    }

    @Override
    public AirShip directorAirShip() {
        Engine engine = airShipBuilder.builderEngine();
        EscapeTower escapeTower = airShipBuilder.builderEscapeTower();
        OrbitalModule orbitalModule = airShipBuilder.builderOrbitalModule();
        AirShip airShip = new AirShip();
        airShip.setEngine(engine);
        airShip.setEscapeTower(escapeTower);
        airShip.setOrbitalModule(orbitalModule);
        return airShip;
    }
}
