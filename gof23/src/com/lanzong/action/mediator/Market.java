package com.lanzong.action.mediator;

//市场部门
public class Market implements Department{

    private Mediator m;//持有中介者的引用（总经理）

    public Market(Mediator m) {
        this.m = m;
        //注册到中介者，让中介者使用
        m.register("market",this);
    }

    @Override
    public void selfAction() {
        System.out.println("跑去接项目！");
    }

    @Override
    public void outAction() {
        System.out.println("汇报工作，项目承接进度，需要资金支持！");

        //跟中介者（总经理）说，我需要某部门帮我做什么，该方法可以复杂化，例如传递多个参数，指定具体某些事情。
        m.command("finacial");
    }
}