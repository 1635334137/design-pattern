package com.lanzong.action.templateMethod;

//父类，控制流程
public abstract class BankTemplateMethod {

    public void start(){
        System.out.print("固定不变的开始流程：");
        System.out.println("取号排队");
    }
    public void end(){
        System.out.print("固定不变的结束流程：");
        System.out.println("反馈评分");
    }

    //变化的部分
    public abstract void transact();

    public final void process(){
        this.start();
        this.transact();//钩子方法/回调方法（由父类控制流程，子类被动调用）
        this.end();
    }
}
