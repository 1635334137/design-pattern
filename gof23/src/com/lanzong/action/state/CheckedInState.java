package com.lanzong.action.state;

//状态3
public class CheckedInState implements State{

    //状态对应的行为
    @Override
    public void handle() {
        System.out.println("已入住");
    }
}
