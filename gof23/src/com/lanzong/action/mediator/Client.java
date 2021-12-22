package com.lanzong.action.mediator;

/**
 * 中介者模式
 * MVC模式的控制器就是一个中介者
 * 解耦多个同事对象之间的交互关系，都跟中介者打交道
 */
public class Client {
    public static void main(String[] args) {
        Mediator m = new President();//中介者

        Market market = new Market(m);
        Development dev = new Development(m);
        Finacial f = new Finacial(m);

        //做自己的事或者叫中介者帮你沟通其他部门
        market.selfAction();
        market.outAction();
        dev.outAction();
    }
}
