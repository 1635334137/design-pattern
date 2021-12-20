package com.lanzong.factory.simplefactory;

/**
 * 简单工厂类，但是扩展时是违反开闭原则的
 */
public class CarFactory {//创建者

    public static Car createCar(String type){
        Car car = null;
        if ("奥迪".equals(type)){
            car = new Ad();
        }else if("比亚迪".equals(type)){
            car = new Byd();
        }else{
            return null;
        }
        return car;
    }
}
