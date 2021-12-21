package com.lanzong.struct.proxy;

//明星本人具体的实现
public class RealStar implements Star{

    @Override
    public void sing() {
        System.out.println("明星本人唱歌");
    }

}
