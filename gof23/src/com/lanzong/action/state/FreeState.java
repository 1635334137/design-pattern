package com.lanzong.action.state;

//状态1
public class FreeState implements State{

    //状态对应的行为
    @Override
    public void handle() {
        System.out.println("空闲状态！");
    }
}
