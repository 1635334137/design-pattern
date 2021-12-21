package com.lanzong.struct.bridge;

//要制作某种类型的电脑，直接继承电脑类即可
public class DesktopComputer extends Computer{

    public DesktopComputer(Brand brand) {
        super(brand);
    }

    @Override
    public void sale() {
        super.sale();//这个方法可用可不用，用了就是有品牌的电脑，不用就是没品牌
        System.out.println("销售台式机");
    }
}
