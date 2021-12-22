package com.lanzong.action.templateMethod;

//易变的步骤之一，具体实现
public class SaveMoney extends BankTemplateMethod{
    @Override
    public void transact() {
        System.out.println("我要存钱！");
    }
}
