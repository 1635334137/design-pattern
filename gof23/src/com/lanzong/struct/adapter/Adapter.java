package com.lanzong.struct.adapter;

/**
 * 适配器
 * 这个适配器现在实现目标接口，即适配用户端的需求
 * 然后又传递了一个类，即需要适配的对象。
 * 就相当于笔记本接口是USB，键盘是type-c
 * 而适配器类既实现了USB接口，又使用了type-c，相当把两者关联起来
 */
public class Adapter implements Target{

    //需要适配的类
    private Adaptee adaptee;

    public Adapter(Adaptee adaptee){
        this.adaptee = adaptee;
    }

    @Override
    public void handleReq() {
        adaptee.request();
    }
}
