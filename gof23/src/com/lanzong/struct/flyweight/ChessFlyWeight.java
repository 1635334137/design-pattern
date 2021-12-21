package com.lanzong.struct.flyweight;

/**
 * 享元类
 * 抽象享元类，声明公共方法，向外界提供内部状态，设置外部状态
 */
public interface ChessFlyWeight {
    void setColor(String color);
    String getColor();
    void display(Coordinate c);
}
