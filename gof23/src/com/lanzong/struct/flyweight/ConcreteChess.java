package com.lanzong.struct.flyweight;

//具体享元类，为内部状态提供成员变量进行存储
public class ConcreteChess implements ChessFlyWeight{

    //内部状态
    private String color;

    public ConcreteChess(String color) {
        this.color = color;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void display(Coordinate c) {
        System.out.println("棋子颜色："+color);
        System.out.println("棋子位置："+c.getX()+"---"+c.getY());
    }
}
