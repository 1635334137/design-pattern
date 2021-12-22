package com.lanzong.action.state;

//状态2
public class BookedState implements State{

    //状态对应的行为
    @Override
    public void handle() {
        System.out.println("以预定");
    }
}
