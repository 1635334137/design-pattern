package com.lanzong.action.templateMethod;

/**
 * 模板方法模式：
 * 定义算法的骨架，具体某些步骤延迟到子类中实现
 * 处理步骤父类中定义好，具体实现延迟到子类中
 *
 * 实现一个算法时，整体步骤很固定，部分易变，易变部分可以抽象出来，供子类实现
 */
public class Client {
    public static void main(String[] args) {

        //匿名类写法
        BankTemplateMethod bt = new BankTemplateMethod() {
            @Override
            public void transact() {
                System.out.println("我要取钱！");
            }
        };
        bt.process();

        SaveMoney saveMoney = new SaveMoney();
        saveMoney.process();
    }
}
