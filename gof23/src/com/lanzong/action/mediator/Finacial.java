package com.lanzong.action.mediator;

//财务部门
public class Finacial implements Department{

    private Mediator m;//持有中介者的引用（总经理）

    public Finacial(Mediator m) {
        this.m = m;
        //注册到中介者，让中介者使用
        m.register("finacial",this);
    }

    @Override
    public void selfAction() {
        System.out.println("数钱！");
    }

    @Override
    public void outAction() {
        System.out.println("汇报工作，钱太多，怎么花！");
    }
}
