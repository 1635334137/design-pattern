package com.lanzong.struct.bridge;

/**
 * 通过桥接模式，电脑的品牌和类型进行了连接组合，方便了品牌的增加或者类型的变化，以及不同的组合
 * 原来的联想笔记本为一个类，违反了单一职责，即负责了品牌又负责了类型。不易于扩展和修改
 *
 * 桥接模适合多个变化维度的情况
 */
public class Client {
    public static void main(String[] args) {
        LaptopComputer laptopComputer = new LaptopComputer(new LenovoBrand());
        laptopComputer.sale();

        LaptopComputer laptopComputer2 = new LaptopComputer(new DellBrand());
        laptopComputer2.sale();

        DesktopComputer desktopComputer = new DesktopComputer(new LenovoBrand());
        desktopComputer.sale();
    }
}
